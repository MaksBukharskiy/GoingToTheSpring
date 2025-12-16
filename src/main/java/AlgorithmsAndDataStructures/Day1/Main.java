package AlgorithmsAndDataStructures.Day1;

import javax.xml.transform.Source;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Main {
    public static void main(String[] args) {

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
