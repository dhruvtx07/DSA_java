package practice.phase1.level2;

import java.util.Scanner;

public class alphabets_lies_between {
    public static void main(String[] args){
        System.out.println("---------------");
        System.out.println("Alphabets lies between");
        System.out.println("---------------");


        System.out.print("Enter an alphabet: ");

        Scanner sc = new Scanner(System.in);
        char c = sc.next().charAt(0);

        char d = Character.toUpperCase(c);

        if((d<'A' || d>'Z')){
            System.out.println("Invalid character");
        }
        else{
            if((d<='M')){
                System.out.println("character lies between A-M");
            }else{
                System.out.println("character lies between N-Z");
            }
        }

        sc.close();
    }

}
