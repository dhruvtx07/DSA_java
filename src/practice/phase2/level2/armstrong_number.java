package practice.phase2.level2;
import java.util.Scanner;

public class armstrong_number {
    public static void main(String[] args){
        System.out.println("----------------");
        System.out.println("armstrong number");
        System.out.println("----------------");

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int tempNum = num;
        int counter = 0;

        int armstrong = 0;

        while(tempNum>0){
            counter++;
            tempNum = tempNum/10;
        }

        tempNum = num;
        while(tempNum>0){
            int raiseTo = 1;
            int place = tempNum%10;
            for(int i=1;i<=counter;i++){
                raiseTo = raiseTo*place;
                System.out.printf("%d raised to %d  = %d\n", place, counter, raiseTo);
            }
            armstrong = armstrong+raiseTo;
            raiseTo = 1;
            tempNum = tempNum/10;
            System.out.printf("armstrong: %d\n", armstrong);
        }

        if(armstrong == num){
            System.out.printf("valid armstrong number: %d = %d", armstrong, num);
        }else{
            System.out.println("invalid number");
        }



        sc.close();


    }
}
