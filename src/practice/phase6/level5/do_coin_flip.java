package practice.phase6.level5;
import java.util.*;

public class do_coin_flip {
    public static void main(String[] args){
        System.out.println("flipping coin");
        Scanner sc = new Scanner(System.in);

        System.out.print("press enter to flip the coin: ");
        String s1 = sc.nextLine();

        if(s1.isEmpty()){
            int side = (int)(Math.random()*10);
            if(side%2==0){
                System.out.println("heads");
            }else{
                System.out.println("tails");
            }
        }

        System.out.print("\npress enter to continue flip, if you want to exit enter anything and press enter: ");
        String s2 = sc.nextLine();

        if(s2.isEmpty()){
            main(new String[]{});
        }else{
            System.exit(1);
        }




        sc.close();
    }
}
