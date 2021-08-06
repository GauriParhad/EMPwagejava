public class Empwage {
    public static void main(String[] args) {

        System.out.println("Welcome to Employee wage computation program. ");

        //constant
        int IS_FULL_TIME = 2;
        int IS_PART_TIME = 1;
        int EMP_RATE_PER_HR = 20;
        int Emphrs = 0;
        int Empwage = 0;

        int empCheck = (int) Math.floor(Math.random() * 10) % 2;
        if (empCheck == IS_FULL_TIME) {
            System.out.println("Employee is full time present.");
            Emphrs = 8;
        }
        if (empCheck == IS_PART_TIME) {
            System.out.println("Employee is part time present.");
            Emphrs = 4;
        } else {
            System.out.println("Employee is Absent.");
            Emphrs = 0;
        }

        Empwage = Emphrs *  EMP_RATE_PER_HR;
        System.out.println(" Employee wage is:"+Empwage);
    }
}

