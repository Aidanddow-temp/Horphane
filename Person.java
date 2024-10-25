import java.time.LocalDate;
import java.time.Period;

public class Person {
    private String firstName;
    private String lastName;
    private LocalDate DOB;
    public static int counter = 0;

    public Person(){
    }

    public Person(String firstName, String lastName, LocalDate DOB){
        this.firstName = firstName;
        this.lastName = lastName;
        this.DOB = DOB;
        counter++;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getDOB() {
        return DOB;
    }

    public void setDOB(LocalDate DOB) {
        this.DOB = DOB;
    }

    public int ageConverter(){

        LocalDate today = LocalDate.now();
        Period timePassed = Period.between(this.DOB, today);
        int age = timePassed.getYears();
        return age;
    }

    @Override
    public String toString() {
        return ("First name: " + this.firstName + "\nLast name: " + this.lastName + "\nDate of Birth: " + this.DOB.toString());
    }
}
