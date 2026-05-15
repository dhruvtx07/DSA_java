package practice.striver.patterns;

public class print_increasing_triangle_with_counting {
    public static void main(String[] args){
        int num = 1;
        for(int rows = 1; rows<=5; rows++){
            for(int column = 1; column<=rows; column++){
                System.out.printf("%d ",num);
                num++;
            }
            System.out.println();
        }
    }
}
