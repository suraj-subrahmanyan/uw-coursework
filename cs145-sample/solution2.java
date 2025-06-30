
import java.util.Scanner;

public class solution2{
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int[] array=new int[3];

        for (int i=1; i<4; i++){
            System.out.print("Enter Number " + i + ": ");
            int num = in.nextInt();
            array[i-1] = num;
        }
        System.out.println(max3(array[0], array[1], array[2]));
    }

    public static int max3(int x1, int x2, int x3){
        if (x1>=x2 && x1>=x3){
            return x1;
        } else if(x2>=x1 && x2>=x3){
            return x2;
        } else {
                return x3;
            }
    }
}