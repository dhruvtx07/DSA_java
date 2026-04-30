package practice.phase3.level4;
import java.util.Scanner;

public class count_vowels_in_string_using_recursion {
    public static int fun(int i, int n, String s1, int temp){
        if(i == n){ return temp; }

        if(s1.charAt(i) == 'a' || s1.charAt(i) == 'e' || s1.charAt(i) == 'i' || s1.charAt(i) == 'o' || s1.charAt(i) == 'u'){
            temp += 1;
        }

        return fun(i+1,n, s1, temp);
    }
    public static void main(String[] args){
        System.out.println("----------------");
        System.out.println("Counting vowels in a string using recursion");
        System.out.println("----------------");

        Scanner sc = new Scanner(System.in);


        System.out.print("Enter something: ");
        String s1 = sc.nextLine();

        int count = fun(0, s1.length(), s1, 0);
        System.out.println(count);

        sc.close();
    }
}
