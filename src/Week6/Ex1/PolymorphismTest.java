package Week6.Ex1;

public class PolymorphismTest {
    public static void main(String[] args) {
        CommissionEmployee commissionEmployee
                = new CommissionEmployee(
                        "Bob","Barker",
                "222-22-222",1000,
                0.06);
        BasePlusCommissionEmployee basePlusCommissionEmployee = new
                BasePlusCommissionEmployee(
                        "Kris","Campbell",
                "333-33-333",50000,
                0.1,100000);

        System.out.printf("%s",commissionEmployee);
        System.out.println();
        System.out.println();
        System.out.printf("%s",basePlusCommissionEmployee);

        // Polymorphism Part
        CommissionEmployee commissionEmployee2 =
                basePlusCommissionEmployee;
        ((BasePlusCommissionEmployee) commissionEmployee2).setBaseSalary(250000);

        System.out.println();
        System.out.println();
        System.out.printf("%s",commissionEmployee2);
    }
}
