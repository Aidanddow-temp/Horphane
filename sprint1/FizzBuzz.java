package sprint1;

public class FizzBuzz {


    public static void FizzBuzzPrinter( int num){
        for (int i= 1; i<=num; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else {System.out.println(i);}
        }
    }

}
