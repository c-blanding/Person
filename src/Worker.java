public class Worker extends Person {

    public double getHourlyPayRate() {
        return hourlyPayRate;
    }

    public void setHourlyPayRate(double hourlyPayRate) {
        this.hourlyPayRate = hourlyPayRate;
    }

    private double hourlyPayRate = 20;

    Worker(String firstName, String lastName, String title, int YOB) {
        super(firstName, lastName, title, YOB);

    }

    private double calculateWeeklyPay(double hoursWorked) {
        if (hoursWorked <= 40) {
            return hourlyPayRate * hoursWorked;
        }

        else {
            double ot = hoursWorked - 40;
            return (hourlyPayRate * 40) + ((hourlyPayRate * 1.5) * ot);
        }
    }

    public void displayWeeklyPay(double hoursWorked) {
        double weeklyPay = calculateWeeklyPay(hoursWorked);
        System.out.println("Hours Worked: " + hoursWorked);
        if (hoursWorked <= 40) {
            System.out.println("Regular Pay: $" + weeklyPay + String.format(" (%.2f hours)", hoursWorked));
            System.out.println("Overtime Pay: $0");
            System.out.println("Total: " + weeklyPay);
        }

        else {
            System.out.println("Regular Pay: $" + (calculateWeeklyPay(40)) + " (40.00 hours)");
            System.out.println("Overtime Pay: $" + (weeklyPay - calculateWeeklyPay(40)) + String.format(" (%.2f hours)", hoursWorked - 40));
            System.out.println("Total: $" + weeklyPay);
        }
    }
}
