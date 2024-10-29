package sprint1;

public class UniqueSum {

    public static void uniqueMain () {

        /* first test case
        int a = 1;
        int b = 2;
        int c = 3;


         */
        /* second test case
        int a = 3;
        int b = 3;
        int c = 3;
        */

        //Third test case
        int a = 1;
        int b = 1;
        int c = 2;


        System.out.println("The sum of the unique numbers is " + sum(a,b,c));

    }

    public static int sum (int a, int b, int c) {

        int sum;

        if (a==b && b==c) {
            sum =0;

        }
        else if (a==b) {
            sum = c;

        }
        else if (a==c) {
            sum =b;
        }
        else if (b==c) {
            sum =a;
        }
        else {
            sum = a+b+c;
        }

        return sum;
    }


}
