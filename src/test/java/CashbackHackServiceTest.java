import org.junit.jupiter.api.Test;
import ru.netology.service.CashbackHackService;

public class CashbackHackServiceTest {

@Test

    public void testRemain0() {
        CashbackHackService service = new CashbackHackService();
        int amount = 0;
        int actual = service.remain(amount);
        int expected = 1000;
        assertEquals(actual, expected);
    }

    @Test

    public void testRemain10() {
        CashbackHackService service = new CashbackHackService();
        int amount = 10;
        int actual = service.remain(amount);
        int expected = 990;
        assertEquals(actual, expected);
    }

}
