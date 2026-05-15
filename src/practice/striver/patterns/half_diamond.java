package practice.striver.patterns;

public class half_diamond {
    public static void main(String[] args){
        for(int rows = 1; rows<=5; rows++){
            for(int column = 1; column<=rows; column++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int rows = 4; rows>=1; rows--){
            for(int column = 1; column<=rows; column++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
