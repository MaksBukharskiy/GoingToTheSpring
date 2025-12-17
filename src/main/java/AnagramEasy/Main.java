package AnagramEasy;

public class Main {
    public static void main(String[] args) {
        IsAnagram isAnagram = new IsAnagram();

        Boolean input = isAnagram.isAnagram("abc", "bca");

        System.out.println(input);
    }
}
