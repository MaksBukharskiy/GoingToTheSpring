package AlgorithmsAndDataStructures.LeetCode.SocksPair;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Main {
    public static void main(String[] args) {


//  You are given a list of socks, where each sock is represented by a string indicating its color.
//  Socks of the same color can be paired.
//  Your task is to:
//
//  Identify all paired socks (i.e., colors that appear at least twice, and you form
//  as many complete pairs as possible).
//  Identify all unpaired socks (i.e., colors that appear an odd number of times — the leftover after pairing).
//  Return two collections:
//
//  A list of colors that have been successfully paired (each pair represented once per complete pair).
//  A set (or list) of colors that remain unpaired.
//  Note: The order of paired socks should reflect the order in which pairs were completed during
//  a single left-to-right pass.

//        Paired socks:   ["blue", "red", "green"]
//        Unpaired socks: ["white", "dark", "aqua"]

        List<String> allSocks = List.of("red", "blue", "green", "blue", "red", "white", "green", "dark", "aqua");

        Set<String> unpairedSocks = new HashSet<>();
        List<String> pairedSocks = new ArrayList<>();

        allSocks.forEach(sock -> {
            if (unpairedSocks.contains(sock)) {
                unpairedSocks.remove(sock);
                pairedSocks.add(sock);
            }
            else  {
                unpairedSocks.add(sock);
            }
        });

        System.out.println("allSocks: " + allSocks);
        System.out.println("\numpaired: " + unpairedSocks);
        System.out.println("paired: " + pairedSocks);


    }
}
