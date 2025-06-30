public class solution1 {
    public static void main(String[] args) {
        System.out.println(f(0));
        System.out.println(g(-1));
        System.out.println(f(g(1)));
        System.out.println(g(f(1)));

    }

//    Program that defines function f, which consumes x and produces f(x)
    public static int f(int x){
        return (int)Math.pow(x, 2)-3;
    }

//    Program that defines function g, which consumes x and produces g(x)
    public static int g(int x){
        return (int)(3*(Math.pow(x,2))+2*x-6);
    }

//    Program for function fg that consumes x and produces f(g(x))
    public static int fg(int x){
        return f(g(x));
    }
}