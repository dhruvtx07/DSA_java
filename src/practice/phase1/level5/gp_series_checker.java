package practice.phase1.level5;
import java.util.Scanner;

public class gp_series_checker {
    public static void main(String[] args){

        System.out.println("-----------------");
        System.out.println("GP series checker");
        System.out.println("-----------------");

        int[] nums = new int[5];
        Scanner sc = new Scanner(System.in);
        for(int i= 0; i< nums.length; i++ ){
            System.out.printf("Enter number for position %d: ", i+1);
            nums[i] = sc.nextInt();
        }

        int ratio = (int)nums[1] / nums[0];
        boolean flag = true;

        for(int i= 2; i< nums.length; i++ ){
            if(ratio != (int)nums[i] / nums[i-1]){
                flag = false;
            }
        }
        if(!flag){
            System.out.println("not a GP series");
        }else{
            System.out.println("valid GP series");
        }

        sc.close();
    }
}
