package practice.striver.patterns;

public class increasing_triangle_with_numbers {
    public static void main(String[] args){
        for(int row = 1; row<=5; row++){
            for(int column = 1; column<=row; column++){
                System.out.printf("%d ", column);
            }
            System.out.println();
        }
    }
}
