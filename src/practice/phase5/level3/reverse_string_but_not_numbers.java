package practice.phase5.level3;
import java.util.Scanner;

public class reverse_string_but_not_numbers {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("--------------------");
        System.out.println("reverse string but not numbers");
        System.out.println("--------------------");

        System.out.print("enter string: ");
        String s1 = sc.nextLine();

        System.out.println("reversing string but not numbers using loop");
        if(s1.length()<=1){
            System.out.print(s1);
        }else{
            int limit = 0;

            for(int i = 0; i<s1.length(); i++){
                if(Character.isDigit(s1.charAt(i))){
                    if(i == 0){
                        System.out.print(s1.charAt(i));
                    }
                    if(i!=0){
                        for(int j= i-1; j>limit; j--){
                            System.out.print(s1.charAt(j));
                        }
                        System.out.print(s1.charAt(i));
                    }
                    limit = i;
                }
                if(i==s1.length()-1){
                    for(int j= i; j>limit; j--){
                        System.out.print(s1.charAt(j));
                    }

                }
            }
        }

        sc.close();
    }
}
