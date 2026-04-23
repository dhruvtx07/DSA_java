package practice.phase1.level5;
import java.util.Scanner;

public class ap_series_checker {
    public static void main(String[] args){
        System.out.println("----------------");
        System.out.println("AP series checker");
        System.out.println("----------------");

        int[] nums = new int[5];
        Scanner sc = new Scanner(System.in);



        for(int i = 0; i<5; i++){
            System.out.printf("Enter number %d: ", i+1);
            nums[i] = sc.nextInt();
        }

        int currentGap = nums[1] - nums[0];
        boolean flag = true;
        for(int i = 2; i<nums.length; i++){
            if(currentGap != nums[i] - nums[i-1] ){
                flag = false;
                break;
            }
        }
        if(!flag){
            System.out.println("invalid series");
        }else{
            System.out.println("valid AP series");
        }

    }
}
