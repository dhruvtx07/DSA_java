package practice.striver.patterns;

public class print_mountains_upside_and_downside {
    public static void main(String[] args){
        for(int row = 1; row<=5; row++){
            for(int column = 1; column<=5; column++){
                if(column<=row){
                   System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            for(int column2 = 5; column2>=1; column2--){
                if(column2<=row){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        for(int row = 4; row>=1; row--){
            for(int column = 1; column<=5; column++){
                if(column<=row){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            for(int column2 = 5; column2>=1; column2--){
                if(column2<=row){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
