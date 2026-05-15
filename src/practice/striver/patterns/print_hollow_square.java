package practice.striver.patterns;

public class print_hollow_square {
    public static void main(String[] args){
        for(int rows = 1; rows<=4; rows++){
            for(int column = 1; column<=4; column++){
                if(rows==1 || rows==4){
                    System.out.print("* ");
                }else{
                    if(column==1 || column==4){
                        System.out.print("* ");
                    }else{
                        System.out.print("  ");
                    }
                }
            }
            System.out.println();
        }
    }
}
