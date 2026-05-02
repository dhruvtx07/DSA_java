package practice.phase5.level1;
import java.util.Scanner;

public class counting_words_in_sentence {
    public static void main(String[] args){
        System.out.println("---------------");
        System.out.println("count words in a string");
        System.out.println("---------------");



        Scanner sc = new Scanner(System.in);
        System.out.print("enter something: ");
        String str = sc.nextLine();


        System.out.println();
        System.out.println("counting characters using split function without loop");
        String[] strArr = str.split(" ");
        System.out.printf("words - %d\n", strArr.length);

        System.out.println();
        System.out.println("counting characters using loop");
        int words = 1;
        for(char c : str.toCharArray()){
            if(c == ' '){
                words += 1;
            }
        }
        System.out.printf("words - %d\n", words);

        sc.close();
    }
}
