package Week4.Ex1;

public class Time1Test {
    public static void main(String[] args) {
        Time1 time = new Time1();

        System.out.printf("Universal time : " +
            time.toUniveralString());
        System.out.printf("%nStandard  time : " +
                time.toString());
    }
}
