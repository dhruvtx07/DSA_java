package practice.striver.patterns;

public class print_increasing_triangle_with_decreasing_character_rows {
    public static void main(String[] args){
        for(char row = 'E'; row>='A'; row--){
            for(char column = row; column<='E'; column++){
                System.out.print(column);
            }
            System.out.println();
        }

    }
}
