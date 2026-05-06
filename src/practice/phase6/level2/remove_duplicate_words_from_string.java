package practice.phase6.level2;
import java.util.ArrayList;
import java.util.Scanner;

public class remove_duplicate_words_from_string {
    public static void main(String[] args){
        System.out.println("remove duplicate words from string");
        Scanner sc = new Scanner(System.in);

        System.out.print("enter string: ");
        String s1 = sc.nextLine();

        String[] words = s1.split(" ");

        ArrayList<String> unique = new ArrayList<>();

        for(String word : words){
            if(!unique.contains(word)){
                unique.add(word);
            }
        }

        System.out.println(unique);


        sc.close();
    }
}
