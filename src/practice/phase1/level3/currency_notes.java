package practice.phase1.level3;
import java.util.Scanner;

public class currency_notes {
    public static void main(String[] args){
        System.out.println("---------------");
        System.out.println("Currency notes");
        System.out.println("---------------");


        System.out.print("Enter an amount: ");

        Scanner sc = new Scanner(System.in);
        int amount = sc.nextInt();


        int[] notes = {2000, 500, 100};
        int count = 0;

        for(int i=0; i< notes.length; i++){
            if(amount>=notes[i]) {
                count = amount / notes[i];
                amount = amount % notes[i];

                int noteAmount = notes[i] * count;

                System.out.printf("%d x %d = %d\n", notes[i], count, noteAmount);
                System.out.printf("amount left: %d\n", amount);
            }
        }

        sc.close();

    }
}
