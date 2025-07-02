public class solution4{
    public static boolean treesimilair(t1, t2){
        if (t1 == null && t2 == null){
            return true;
        } else if ((t1 != null && t2 != null) && t1.right == t2.right) {
            return true;            
        } else if ((t1 != null && t2 != null) && t1.left == t2.left) {
            return true;            
        } else {
            return false;
        }
    }
}