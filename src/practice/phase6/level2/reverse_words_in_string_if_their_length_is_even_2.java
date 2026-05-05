package practice.phase6.level2;

import java.util.Scanner;

public class reverse_words_in_string_if_their_length_is_even_2 {
    public static void main(String[] args){
        System.out.println("reverse words in string if their length is even");
        Scanner sc = new Scanner(System.in);

        System.out.print("enter string: ");
        String s1 = sc.nextLine();

        StringBuilder str = new StringBuilder();

        int space = 0;
        int length = 0;
        for(int i  = 0; i<s1.length();i++){
            char c = s1.charAt(i);
            if(c != ' '){
                str.append(c);
                length++;
            }
            if(c == ' '){
                str.append(c);
                if(length%2 == 0){
                    str.delete(i-1, space);
                    for(int j = i; j>=space; j--){
                        str.append(s1.charAt(j));
                    }
                }
                space = i;
                length = 0;
            }
            if(i == s1.length()-1){
                if(length%2 == 0){
                    str.delete(i-1, space);
                    for(int j = i; j>=space; j--){
                        str.append(s1.charAt(j));
                    }
                }
            }
        }

        System.out.print(str);

        sc.close();
    }

}
