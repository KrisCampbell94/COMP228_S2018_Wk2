package Week4.Ex3;
import Week4.Ex1.Time1;

public class ThisTest {
    public static void main(String[] args) {
        Time1 time = new Time1();
        time.setTime(15,30,20);
        System.out.println(time.buildString());
    }
}

