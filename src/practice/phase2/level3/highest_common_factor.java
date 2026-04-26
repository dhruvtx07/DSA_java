package practice.phase2.level3;
import java.util.*;

public class highest_common_factor {
    public static void main(String[] args){
        System.out.println("-----------------");
        System.out.println("HCF GCD");
        System.out.println("-----------------");

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter first number: ");
        int num2 = sc.nextInt();

        ArrayList<Integer> factors1 = new ArrayList<>();
        ArrayList<Integer> factors2 = new ArrayList<>();

        factors1.add(1);
        factors2.add(1);

        for(int i = 1; i*i<=num1;i++){
            if(num1%i == 0){
                factors1.add(i);
                factors1.add(num1/i);
            }
        }

        for(int i = 1; i*i<=num2;i++){
            if(num2%i == 0){
                factors2.add(i);
                factors2.add(num2/i);
            }
        }

        ArrayList<Integer> commonFactors = new ArrayList<>();
        for(int i = 0; i<factors1.size();i++){
            for(int j = 0; j<factors2.size(); j ++){
                if(factors1.get(i) == factors2.get(j)){
                    commonFactors.add(factors1.get(i));
                    }
            }
        }

        int HCF = commonFactors.get(0);
        for(int i = 0; i<commonFactors.size(); i++){
            if(HCF < commonFactors.get(i)){
                HCF = commonFactors.get(i);
            }
        }

        System.out.printf("HCF of %d and %d is: %d\n", num1, num2, HCF);



        sc.close();

    }
}
