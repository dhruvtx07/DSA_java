package practice.phase6.level2;
import java.util.*;

public class print_characters_that_appear_more_than_twice {
    public static void main(String[] args){
        System.out.println("printing characters appearing more than twice");
        Scanner sc = new Scanner(System.in);

        System.out.print("enter string: ");
        String s1 = sc.nextLine();

        ArrayList<Integer> idx = new ArrayList<>();
        for(int i = 0; i< s1.length(); i++){
            if(idx.contains(i)){
                continue;
            }
            int count = 0;
            idx.add(i);
            for(int j = 0; j<s1.length(); j++){
                char a = s1.charAt(i);
                char b = s1.charAt(j);
                if(a == b){
                    idx.add(j);
                    count++;
                }
            }
            if(count>2){
                System.out.printf("%c - %d times\n", s1.charAt(i), count);
            }
            count = 1;
        }



        sc.close();
    }
}
