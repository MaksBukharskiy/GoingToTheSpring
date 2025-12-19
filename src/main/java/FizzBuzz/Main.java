package FizzBuzz;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {

        FizzBuzz fizzBuzz = new FizzBuzz();

        for (int i = 1; i <= 100; i++) {
            try{
                byte[] result = fizzBuzz.FizzBuzz(i);
                System.out.println(new String(result));
            }
            catch (Exception e){
                System.out.println(i);
            }
        }

    }
}
