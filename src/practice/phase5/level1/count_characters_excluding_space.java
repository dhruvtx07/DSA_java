package practice.phase5.level1;
import java.util.Scanner;

public class count_characters_excluding_space {
    public static void main(String[] args){
        System.out.println("---------------");
        System.out.println("count characters in a string without spaces");
        System.out.println("---------------");


        Scanner sc = new Scanner(System.in);
        System.out.print("enter something: ");
        String str = sc.nextLine();

        System.out.println();
        System.out.println("counting characters using for loop");
        int counter = 0;
        for(int i = 0; i<str.length(); i++){
               if(str.charAt(i) != ' '){
                   counter += 1;
               }
        }
        System.out.printf("length - %d and without characters - %d\n", str.length(), counter);

        System.out.println();
        System.out.println("counting characters using for each loop");
        int count = 0;
        for(char c : str.toCharArray()){
            if(c != ' '){
                count += 1;
            }
        }
        System.out.printf("length - %d and without characters - %d\n", str.length(), count);

        sc.close();
    }
}
