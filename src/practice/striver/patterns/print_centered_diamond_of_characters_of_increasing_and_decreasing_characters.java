package practice.striver.patterns;

public class print_centered_diamond_of_characters_of_increasing_and_decreasing_characters {
    public static void main(String[] args){
        for(int row = 1; row<=4; row++){
            char c = 'A';
            for(int spaces = 0; spaces<4-row; spaces++){
                System.out.print(" ");
            }
            for(int column = 1; column<=row; column++){
                System.out.printf("%c", c);
                if(column!=row){
                    c++;
                }
            }
            char d ='A';
            for(int column2 = row-1; column2>0; column2--){
                System.out.printf("%c", d);
                d++;
            }
            System.out.println();
        }
    }
}
