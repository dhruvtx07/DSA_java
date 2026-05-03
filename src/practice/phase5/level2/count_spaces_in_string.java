package practice.phase5.level2;
import java.util.Scanner;

public class count_spaces_in_string {
    public static void main(String[] args){
        System.out.println("----------------");
        System.out.println("count spaces in string");
        System.out.println("----------------");

        Scanner sc = new Scanner(System.in);

        System.out.print("enter string: ");
        String s1 = sc.nextLine();

        String[] strArr = s1.split(",");
        int length = strArr.length;
        System.out.printf("%d spaces in sentence using s1.split(,)", length);

        int spaces = 0;
        for(char c : s1.toCharArray()){
            if(c == ' '){
                spaces++;
            }
        }
        System.out.printf("\n%d spaces in sentence using loop", spaces);


        sc.close();
    }
}
