package practice.striver.patterns;

public class print_centered_diamond {
    public static void main(String[] args){
        for(int rows = 1; rows<=5; rows++){
            for(int spaces = 1; spaces <= 5-rows; spaces++){
                System.out.print("#");
            }
            for(int column = 1; column <= 2*rows-1; column++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int rows = 5; rows>=1; rows--){
            for(int spaces = 0; spaces<5-rows; spaces++){
                System.out.print("#");
            }
            for(int columns = 1; columns<=2*rows-1; columns++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
