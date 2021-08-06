public class Empwage {
    public static void main(String[] args) {

        System.out.println("Welcome to Employee wage computation program. ");

        //constant
        int IS_PRESENT = 1;
        int EMP_RATE_PER_HR = 20;
        int Emphrs=0;
        int Empwage=0;

        int empCheck = (int) Math.floor(Math.random() * 10) % 2;
        if (empCheck == IS_PRESENT)
            Emphrs=8;

        else
            Emphrs=0;

        Empwage = Emphrs *  EMP_RATE_PER_HR;
        System.out.println(" Employee wage is:"+Empwage);
    }
}

