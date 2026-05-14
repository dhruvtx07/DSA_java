package practice.striver;

public class pattern {
    public static void main(String[] args){

        for(int rows = 1; rows<=4; rows++){

            for(int column = 1; column<=4; column++){
                if(column<=rows){
                    System.out.printf("%d", column);
                }
                else{
                    System.out.print("*");
                }
            }

            System.out.println();
        }

    }
}
