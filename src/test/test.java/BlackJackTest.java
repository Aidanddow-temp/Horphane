import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import sprint1.Blackjack;

public class BlackJackTest {

    // Both over 21 should return 0
    @Test
    public void TestBothOverTwentyOneReturnsZero() {
        int winner = Blackjack.blackJackGame(22, 24);
        Assertions.assertEquals(0, winner);
    }
    
    // One over 21 should return the other
    @Test
    public void TestOneOverTwentyOneReturnsOther() {
        int winner = Blackjack.blackJackGame(10, 30);
        Assertions.assertEquals(10, winner);
    }

    // Both under 21 should return the closest one
    @Test
    public void TestBothUnderTwentyOneReturnsClosest() {
        int winner = Blackjack.blackJackGame(2, 17);
        Assertions.assertEquals(17, winner);
    }
}
