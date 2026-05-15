package practice.striver.patterns;

public class print_mountain_of_triangles {
    public static void main(String[] args){
        for(int rows = 1; rows <=5; rows++){
            for(int columns = 1; columns<=5; columns++){
                if(columns<=rows){
                    System.out.printf("%d", columns);
                }else{
                    System.out.print(" ");
                }
            }
            for(int columns = 5; columns>=1; columns--){
                if(columns<=rows){
                    System.out.printf("%d", columns);
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();

        }
    }
}
