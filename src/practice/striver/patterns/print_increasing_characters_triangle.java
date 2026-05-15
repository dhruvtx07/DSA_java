package practice.striver.patterns;

public class print_increasing_characters_triangle {
    public static void main(String[] args){
        for(int rows = 1; rows<=5; rows++){
            char c = 'A';
            for(int column = 1; column<=rows; column++){
                System.out.printf("%c", c);
                c++;
            }
            System.out.println();
        }
    }
}
