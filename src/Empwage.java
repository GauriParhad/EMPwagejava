public class Empwage {
    public static void main(String[] args) {

        System.out.println("Welcome to Employee wage computation program. ");

        int IS_FULL_TIME = 2;
        int IS_PART_TIME = 1;
        int EMP_RATE_PER_HR = 20;
        int Emphrs = 0;
        int Empwage = 0;
        int DAY = 0;
        int workingdays = 20;
        int Empworkinghrs=100;

        int Empcheck = (int) Math.floor(Math.random() * 10) % 3;
        for (DAY = 1; DAY <= workingdays; DAY++) {

            switch (Empcheck) {
                case 2:

                    System.out.println("Employee is full time present.");
                    Emphrs = 8;
                    break;

                case 1:
                    System.out.println("Employee is part time present.");
                    Emphrs = 4;
                    break;

                default:
                    System.out.println("Employee is Absent");
                    Emphrs = 0;
                    break;
            }
            Empwage = Emphrs * EMP_RATE_PER_HR* Empworkinghrs;
            System.out.println("Employee wage is:" + Empwage);
        }
    }
}

