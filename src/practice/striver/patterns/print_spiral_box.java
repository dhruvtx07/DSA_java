package practice.striver.patterns;

public class print_spiral_box {
    public static void main(String[] args){
        int[][] box = new int[1][5];
        int length = box.length;
        int breadth = box[0].length;

        int top = 0;
        int bottom = box.length-1;

        int left = 0;
        int right = box[0].length-1;
        int counter = 1;

        for(int i = 0; i<box[0].length-1; i++){
            for(int i1 = left; i1<=right;i1++){
                System.out.printf("box[top] = %d [i1] = %d\n", top, i1);
                box[top][i1] = counter;
                counter++;
            }
            top++;


            for(int i2 = top; i2<=bottom; i2++){
                box[i2][right] = counter;
                counter++;
            }
            right--;

            if(top<=bottom){
                for(int i3 = right; i3>=left; i3--){
                    box[bottom][i3] = counter;
                    counter++;
                }
                bottom--;
            }

            if(left<=right){
                for(int i4 = bottom; i4>=top; i4--){
                    box[i4][left] = counter;
                    counter++;
                }
                left++;
            }

        }

        for(int row = 0; row<length; row++){
            for(int column = 0; column<breadth; column++){
                System.out.printf("%d   ", box[row][column]);
            }
            System.out.println();
        }

    }
}
