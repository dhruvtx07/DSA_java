package practice.striver.patterns;

public class print_increasing_characters_rowwise_triangle {
    public static void main(String[] args){
        char c = 'A';
        for(int row = 1; row<=5; row++){
            for(int column = 1; column<=row; column++){
                System.out.printf("%c", c);
            }
            System.out.println();
            c++;
        }
    }
}
