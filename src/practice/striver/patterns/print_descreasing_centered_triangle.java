package practice.striver.patterns;

public class print_descreasing_centered_triangle {
    public static void main(String[] args){
        for(int rows = 5; rows>=1; rows--){
            for(int spaces = 1; spaces<=5-rows; spaces++){
                System.out.printf(" ");
            }
            for(int column = 1; column<=2*rows-1; column++ ){
                System.out.printf("*");
            }
            System.out.println();
        }
    }
}
