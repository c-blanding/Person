public class Main {
    public static void main(String[] args) {

        Person tim = new Person("Tim", "Howard", "000001", "MR.", 2003);

        System.out.println(tim.getAge());
        System.out.println(tim.getAge(2013));
        System.out.println(tim.toCSVDataRecord());


    }
}