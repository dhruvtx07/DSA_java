package practice.phase6.level5;
import java.util.*;

public class check_age_group {
    public static void main(String[] args) {
        System.out.println("check which person belongs to which category");
        Scanner sc = new Scanner(System.in);

        int[] age = new int[5];
        for (int i = 0; i < age.length; i++) {
            System.out.printf("enter age for person %d: ", i + 1);
            age[i] = sc.nextInt();
        }


        for (int i = 0; i < age.length; i++) {
            int personAge = age[i];
            if(personAge<=18){
                System.out.println("person is minor");
            }else if(personAge<=60){
                System.out.println("person is adult");
            }else{
                System.out.println("person is senior citizen");
            }

        }



        sc.close();
    }
}
