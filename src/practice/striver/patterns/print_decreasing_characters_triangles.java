package practice.striver.patterns;

public class print_decreasing_characters_triangles {
    public static void main(String[] args){
        for(int row = 5; row>=1; row--){
            char c = 'A';
            for(int column = 1; column<=row; column++){
                System.out.printf("%c", c);
                c++;
            }
            System.out.println();
        }
    }
}
