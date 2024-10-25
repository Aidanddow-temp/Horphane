import java.time.LocalDate;
import java.util.Objects;

public class App {
    public static void main(String[] args) {

        String program = args[0];
        System.out.println(program);



        if (Objects.equals(program, "blackjack")){
                int num1 = Integer.parseInt(args[1]);
                int num2 = Integer.parseInt(args[2]);
                System.out.println(Blackjack.blackJackGame(num1, num2));}

        if (Objects.equals(program, "fizzbuzz")) {
            int maxnum = Integer.parseInt(args[1]);
            FizzBuzz.FizzBuzzPrinter(maxnum);

        }

        if (Objects.equals(program, "person")){
            LocalDate DOB = LocalDate.of(1926, 5, 8);
            Person testPerson = new Person("David", "Attenborough", DOB);
            System.out.println("Age of " + testPerson.getFirstName() + " " + testPerson.getLastName()+ ": "  + testPerson.ageConverter());
            System.out.println(testPerson);
            System.out.println("Number of people created: " + Person.counter);
            LocalDate DOB2 = LocalDate.of(2002, 6, 5);
            Person testPerson2 = new Person("Iestyn", "Mullinor", DOB2);
            System.out.println(testPerson2);
            System.out.println("Number of people created: " + Person.counter);

        }

        if (Objects.equals(program, "tax")) {
            Taxes.TaxChallenge.taxMain();
        }

        if (Objects.equals(program, "uniquesum")) {
            UniqueSum.uniqueMain();
        }
    }
}
