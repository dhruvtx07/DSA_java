package practice.phase5.level1;
import java.util.Scanner;

public class input_string_and_compute_length {
    public static void main(String[] args){
        System.out.println("---------------");
        System.out.println("input string and compute length");
        System.out.println("---------------");

        Scanner sc = new Scanner(System.in);

        System.out.print("enter something: ");
        String str = sc.nextLine();

        int length = 0;

        for(int i = 0; i<str.length(); i++){
            length += 1;
        }

        System.out.println();
        System.out.printf("length - %d", length);

        sc.close();
    }
}
