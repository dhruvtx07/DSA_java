package practice.phase3.level1;
import java.util.Scanner;

public class print_power_of_x {
    public static int powerOfN(int n, int power){
        if(power == 0){
            return 1;
        }
        int ans = n * powerOfN(n, power-1);
        return ans;
    }
    public static void main(String[] args){
        System.out.println("--------------");
        System.out.println("power of n using recusion");
        System.out.println("--------------");

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        System.out.print("Enter power: ");
        int power = sc.nextInt();



        int num = powerOfN(n, power);
        System.out.println(num);

        sc.close();
    }
}
