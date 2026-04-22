package practice.phase1.level1;
import java.util.Scanner;

public class temperature_check {
    public static void main(String[] args){
        System.out.println("--------------");
        System.out.println("Temperature check");
        System.out.println("--------------");


        System.out.print("Enter some temperature value: ");

        Scanner sc = new Scanner(System.in);
        int temperature = sc.nextInt();

        if(temperature<=0){
            System.out.println("Very cold");
        }else{
            if((temperature>0) &&(temperature<=14)){
                System.out.println("cold");
            }else if((temperature>14) &&(temperature<=28)){
                System.out.println("normal");
            }else if((temperature>28) &&(temperature<=35)){
                System.out.println("bearable summer");
            }else if((temperature>35)){
                System.out.println("hot summer");
            }
        }

        sc.close();
    }
}
