package practice.striver.patterns;

public class print_centered_triangle {
    public static void main(String[] args){
        for(int row = 1; row<=5; row++){
            for(int space = 1; space<=5-row; space++){
                System.out.printf(" ");
            }
            for(int column = 1; column<=2*row-1; column++){
                System.out.printf("*");
            }
            System.out.println();
        }
    }
}

