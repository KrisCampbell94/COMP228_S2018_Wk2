package Week5.Ex3;

public class BasePlusCommissionEmployeeTest {
    public static void main(String[] args) {
        BasePlusCommissionEmployee emp = new BasePlusCommissionEmployee(
                "Kristian", "Campbell",
                "092109342", 10000, 0.2,
                50000);
        CommissionEmployee emp2 = new CommissionEmployee(
                "Miles", "Morales",
                "093420425", 1000000,
                0.5);

        System.out.printf("%n%s:%n%n%n%s%n%n",
                "Employee information", emp);

        System.out.printf("%n%n%s:%n%n%n%s%n",
                "Employee information", emp2);
    }
}
