public class TreeUtil2 {


    public static boolean isLeftK(BinNode<Integer> root, int k){
        if(k<0)
            return false;
        if(!root.hasLeft() && !root.hasRight())
            return true;
        return isLeftK(root.getLeft(), k-1) && isLeftK(root.getRight(), k) ;
    }

}
