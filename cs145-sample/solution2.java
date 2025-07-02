public class solution2{
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
