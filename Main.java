package employees;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        emp e = new emp();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter empoyee name: ");
        e.setName(input.nextLine());

        System.out.println("Enter employee email: ");
        e.setEmail(input.nextLine());

        System.out.println("Enter employee hourly rate: ");
        e.setHourr(input.nextInt());

        System.out.println("Enter employee capacity(hours/day): ");
        e.setCapacity(input.nextInt());

        System.out.println("Enter employee amount of free days in a month: ");
        e.setFreebitch(input.nextInt());

        e.calculateMonthlyIncome();
    }

}
