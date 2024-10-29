import org.junit.jupiter.api.Test;
import sprint1.FizzBuzz;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {


    @Test
    public void testFizzBuzz() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outContent));

        FizzBuzz.FizzBuzzPrinter(15);

        System.setOut(originalOut);

        // Check the output
        assertEquals("1\n2\nFizz\n4\nBuzz\nFizz\n7\n8\nFizz\nBuzz\n11\nFizz\n13\n14\nFizzBuzz", outContent.toString().trim().replace("\r\n", "\n"));
    }


}
