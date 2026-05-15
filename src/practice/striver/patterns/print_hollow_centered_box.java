package practice.striver.patterns;

public class print_hollow_centered_box {
    public static void main(String[] args){
        for(int row = 5; row >= 1; row--){
            for(int column = 1; column<=5; column++ ){
                if(column<=row){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            for(int column = 5; column >= 1; column--){
                if(column<=row){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        for(int row = 1; row <= 5; row++){
            for(int column = 1; column<=5; column++ ){
                if(column<=row){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            for(int column = 5; column >= 1; column--){
                if(column<=row){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
