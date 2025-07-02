public class solution4{
    public static boolean treesimilair(t1, t2){
        if (t1 == null && t2 == null){
            return true;
        }

        if (t1 == null && t1 != null){
            return false;
        }
        
        if (t1 != null && t2 != null){
            boolean left=treesimilair(t1.left, t1.right)
            boolean right=treesimilair(t1.left, t1.right)
        }
    }
}