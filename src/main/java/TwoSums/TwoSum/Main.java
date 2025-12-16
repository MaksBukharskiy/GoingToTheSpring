package TwoSums.TwoSum;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static int[] twoSum(int[] nums, int target) {


//      Given an array of integers nums and an integer target,
//      return indices of the two numbers such that they add up to target.
//      You may assume that each input has exactly one solution,
//      and you may not use the same element twice.
//      You can return the answer in any order.

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }

            map.put(nums[i], i);
        }

        throw new RuntimeException("No solution found");
    }


    public static void main(String[] args) {

        int[] nums = {2, 7, 11, 15, 43};
        int target = 45;

        int[] result = twoSum(nums, target);

        System.out.println("Indices: [" + result[0] + ", " + result[1] + "]");
    }
}