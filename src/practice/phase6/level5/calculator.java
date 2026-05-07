package practice.phase6.level5;
import java.util.Scanner;

public class calculator {
    public static void main(String[] args){
        System.out.println("calculator using switch case");
        Scanner sc = new Scanner(System.in);

        System.out.println("basic calculator using switch case");
        System.out.println("what do you want to do");

        System.out.println("1. add");
        System.out.println("2. subtract");
        System.out.println("3. multiply");
        System.out.println("4. divide");

        System.out.println("enter your choice: ");
        int choice = sc.nextInt();

        System.out.println("enter 1st number: ");
        int num1 = sc.nextInt();

        System.out.println("enter 2nd number: ");
        int num2 = sc.nextInt();

        switch(choice){
            case 1: System.out.println(num1+num2); break;
            case 2: System.out.println(num1-num2); break;
            case 3: System.out.println(num1*num2); break;
            case 4: System.out.println(num1/num2); break;
            default: System.out.println("enter valid option"); main(new String[]{});
        }

        System.out.println("do you want to continue, enter 1 for yes, enter 2 for exit: ");
        int num3 = sc.nextInt();

        switch(num3){
            case 1: main(new String[]{});
            case 2: System.exit(1);

            default: System.out.println("enter valid option"); main(new String[]{});
        }







        sc.close();
    }
}
