package Week6.Ex2;

public class HourlyEmployee extends Employee {

    private double wage;
    private double hours;

    public HourlyEmployee(String firstName, String lastName,
                          String socialSecurityNumber,
                          double wage, double hours){
        super(firstName,lastName,socialSecurityNumber);
        if(wage < 0.0)
            throw new IllegalArgumentException("Wage must be >= 0.0");
        if(hours < 0.0 || hours > 168.0)
            throw new IllegalArgumentException("Wage must be >= 0.0 and <= 168.0");

        this.wage = wage;
        this.hours = hours;
    }


    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        if(wage < 0.0)
            throw new IllegalArgumentException("Wage must be >= 0.0");
        this.wage = wage;
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        if(hours < 0.0 || hours > 168.0)
            throw new IllegalArgumentException("Wage must be >= 0.0 and <= 168.0");
        this.hours = hours;
    }

    @Override
    public double earnings() {
        // No overtime
        if(getHours() <= 40)
            return getHours() * getWage();
        else{// Did work overtime
            return 40 * getWage() + (getHours() - 40) * getWage() * 1.5;
        }
    }

    @Override
    public String toString() {
        return String.format("Hourly Employee: %s%n%s: $%.2f: %s: %.2f",
                super.toString(),"Hourly wage",getWage(),
                "Hours worked",getHours());
    }
}
