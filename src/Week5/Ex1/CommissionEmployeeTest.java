package Week5.Ex1;

public class CommissionEmployeeTest {
    public static void main(String[] args) {
        CommissionEmployee employee = new CommissionEmployee(
                "Kristian", "Campbell",
                "1093864944", 10000,
                0.12);

        System.out.printf("Employee %nFirst Name: %s%nLast Name: %s%nSSN:" +
                " %s%nGross Sales: $%.2f%nCommission Rate: %.2f%n",
                employee.getFirstName(),employee.getLastName(),
                employee.getSocialSecurityNumber(),employee.getGrossSales(),
                employee.getCommissionRate());

        employee.setGrossSales(20000);
        employee.setCommissionRate(0.1);

        System.out.printf("Employee %nFirst Name: %s%nLast Name: %s%nSSN:" +
                        " %s%nGross Sales: $%.2f%nCommission Rate: %.2f%n",
                employee.getFirstName(),employee.getLastName(),
                employee.getSocialSecurityNumber(),employee.getGrossSales(),
                employee.getCommissionRate());

        System.out.printf("%n%nEmployee: %s",employee);
    }
}
