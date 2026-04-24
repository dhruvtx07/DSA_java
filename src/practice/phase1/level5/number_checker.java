package practice.phase1.level5;
import java.util.Scanner;
import java.util.ArrayList;


public class number_checker {
    public static void main(String[] args){
        System.out.println("---------------");
        System.out.println("number checker");
        System.out.println("---------------");

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");

        int num = sc.nextInt();
        int tempNum = num;

        ArrayList<Integer> nums = new ArrayList<>();
        int place = 0;
        while(tempNum>0){
            place = tempNum%10;
            nums.add(place);
            tempNum=tempNum/10;
        }

        long digitSum = 0;
        long digitProduct = 1;

        boolean flag = true;

        for(int i=0; i< nums.size(); i++){
            if(nums.get(i)== 0  || !flag){
                flag = false;
                break;
            }
            digitSum += nums.get(i);
            digitProduct *= nums.get(i);
        }

        if(!flag){
            System.out.println("invalid");
        }else{
            System.out.println("sum of the digits is greater than the product");
        }

        sc.close();

    }
}
