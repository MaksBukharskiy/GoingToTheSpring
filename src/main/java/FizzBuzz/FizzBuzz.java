package FizzBuzz;

public class FizzBuzz {

    public byte[] FizzBuzz(int value) {

        StringBuilder sb = new StringBuilder();

        boolean divisibleBy3 = value % 3 == 0;
        boolean divisibleBy5 = value % 5 == 0;

        if(!divisibleBy3 && !divisibleBy5) throw new IllegalArgumentException();
        if(divisibleBy3 && divisibleBy5) sb.append("fizzbuzz");

        if(value % 3 == 0) sb.append("fizz");
        if(value % 5 == 0) sb.append("buzz");

        return sb.toString().getBytes();

    }

}