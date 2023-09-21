import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {

       Worker CJ = new Worker("CJ", "B","Mr.", 2003);
       CJ.setHourlyPayRate(22);
       Worker Tim = new Worker("Tim", "H", "Mr.", 2000);
       Tim.setHourlyPayRate(18);
       Worker Jimmy = new Worker("Jimmy", "W", "Mr.", 1995);
       Jimmy.setHourlyPayRate(25);
       SalaryWorker Cherry = new SalaryWorker("Cherry", "P", "Ms.", 1985);
       Cherry.setAnnualSalary(50000);
       SalaryWorker Mary = new SalaryWorker("Mary", "T", "Ms.", 1990);
       Mary.setAnnualSalary(70000);
       SalaryWorker Linda = new SalaryWorker("Linda", "J", "Ms.", 1980);
       Linda.setAnnualSalary(100000);

        ArrayList<Worker> workers = new ArrayList<>();
        workers.add(CJ);
        workers.add(Tim);
        workers.add(Jimmy);
        workers.add(Cherry);
        workers.add(Mary);
        workers.add(Linda);

        System.out.println("Week 1");
        workWeek(workers, 40);
        System.out.println("Week 2");
        workWeek(workers, 50);
        System.out.println("Week 3");
        workWeek(workers, 40);


    }

    private static void workWeek(ArrayList<Worker> workers, double hoursWorked) {

        for (Worker worker: workers) {
            System.out.println(worker.getFirstName());
            worker.displayWeeklyPay(hoursWorked);
            System.out.println();



        }
    }
}