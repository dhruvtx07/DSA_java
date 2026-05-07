package practice.phase6.level5;
import java.util.Scanner;

public class check_how_many_students_passed_according_to_their_marks {
    public static void main(String[] args){
        System.out.println("check how many students have passed in their exams");
        Scanner sc = new Scanner(System.in);

        int[] marks = new int[5];
        for(int i = 0; i< marks.length; i++){
            System.out.printf("enter marks for student %d: ", i+1);
            marks[i] = sc.nextInt();
        }

        for(int i = 0; i< marks.length; i++){
            if(marks[i]>=33){
                System.out.printf("student %d passed\n", i+1);
            }else{
                System.out.printf("student %d failed\n", i+1);
            }
        }

        sc.close();
    }
}
