package practice.phase6.level4;
import java.util.*;

public class pasal_triangle {
    public static void main(String[] args){
        System.out.println("printing pascal triangle");

        int[][] nums = new int[10][10];
        for(int row = 0; row< nums.length; row++){
            for(int column = 0; column< row+1; column++){
                nums[row][column] = 1;
            }
        }

        System.out.println("initialized 2d array for pascal triangle");
        for(int row = 0; row< nums.length; row++){
            for(int column = 0; column< row+1; column++){
                int num = nums[row][column];
                System.out.print(num);
            }
            System.out.println();
        }

        for(int row = 2; row< nums.length; row++){
            for(int column = 1; column< row+1; column++){
                nums[row][column] = nums[row-1][column] + nums[row-1][column-1];
            }
            System.out.println();
        }

        System.out.println("\npascal triangle");
        for(int row = 0; row< nums.length; row++){
            for(int column = 0; column< row+1; column++){
                int num = nums[row][column];
                System.out.print(num);
            }
            System.out.println();
        }

    }
}
