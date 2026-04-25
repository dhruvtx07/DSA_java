package practice.phase2.level3;
import java.util.Scanner;

public class numbers_divisible_by_seven {
    public static void main(String[] args){
        System.out.println("----------------");
        System.out.println("check numbers divisible by 7");
        System.out.println("----------------");

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter min number: ");
        int min = sc.nextInt();


        System.out.print("Enter max number: ");
        int max = sc.nextInt();

        if(max>min){
            for(int i = min; i<=max; i++){
                if(i % 7 ==0){
                    System.out.println(i);
                }
            }
        }else{
            System.out.println("enter valid ranges max can't be less than the min");
        }


        sc.close();


    }
}
