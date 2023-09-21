public class SalaryWorker extends Worker {
    public double getAnnualSalary() {
        return annualSalary;
    }

    public void setAnnualSalary(double annualSalary) {
        this.annualSalary = annualSalary;
    }

    double annualSalary;

    SalaryWorker(String firstName, String lastName, String title, int YOB) {
        super(firstName, lastName, title, YOB);
    }


    private double calculateWeeklyPay(double hoursWorked) {
        return annualSalary / 52;
    }


    @Override
    public void displayWeeklyPay(double hoursWorked) {
        System.out.println(String.format("Weekly Pay: $%.2f/" + annualSalary, calculateWeeklyPay(0)) );
    }
}
