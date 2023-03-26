import ru.netology.service.CashbackHackService;

public class CashbackHackServiceTest {



    public void testRemain (){
        CashbackHackService service = new CashbackHackService();
        int amout = 1000;
        int actual = service.remain(amout);
        int expected = 0;
        assertEguals(actual, expected);
    }

    public void testRemainWithCashback(){
        CashbackHackService service = new CashbackHackService();
        int amout = 900;
        int actual = service.remain(amout);
        int expected = 100;
        assertEguals(actual, expected); //почему красным?


    }
}
