package practice.striver.patterns;

public class print_increasing_triangle_as_binary_triangle {
    public static void main(String[] args){
        for(int rows = 1; rows<=5; rows++){
            for(int column = rows; column>=1; column--){
                if(column%2!=0){
                    System.out.print("1");
                }else{
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }
}
