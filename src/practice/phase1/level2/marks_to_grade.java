package practice.phase1.level2;
import java.util.Scanner;

public class marks_to_grade {
    public static void main(String[] args){

        System.out.println("----------------");
        System.out.println("Marks to grade");
        System.out.println("----------------");


        System.out.print("Enter any marks from 0 to 100: ");

        Scanner sc = new Scanner(System.in);
        int marks = sc.nextInt();

        char grade = 'Z';

        if(marks<0 || marks>100){
            System.out.println("Invalid marks.");
        }else{
            if(marks<=33){
                grade = 'F';
            }else if(marks<=40){
                grade = 'D';
            }else if(marks<=50){
                grade = 'C';
            }else if(marks<=70){
                grade = 'B';
            }else {
                grade = 'A';
            }
        }

        System.out.printf("you have got %c grade for %d marks", grade, marks );
        sc.close();

    }
}
