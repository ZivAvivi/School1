
public class TreeUtil {


    // root left right
    public static void printPreOrder (BinNode<Integer> bt)
    {
        if (bt != null)
        {
            System.out.print(bt.getValue() + "  ");
            printPreOrder (bt.getLeft());
            printPreOrder (bt.getRight());
        }
    }

    // left root right
    public static void printInOrder (BinNode<Integer> bt)
    {
        if (bt != null)
        {
            printInOrder (bt.getLeft());
            System.out.print(bt.getValue() + "  ");
            printInOrder (bt.getRight());
        }
    }

    // left right root
    public static void printPostOrder(BinNode<Integer> bt)
    {
        if (bt != null)
        {
            printPostOrder (bt.getLeft());
            printPostOrder (bt.getRight());
            System.out.print(bt.getValue() + "  ");
        }
    }


    // assumes bt != null
    public static boolean isLeaf(BinNode bt) {
        return bt.getLeft() == bt.getRight();
    }

    public static int sumTree (BinNode<Integer> bt) {
        if (bt == null)
            return 0;
        return bt.getValue() +
                sumTree(bt.getLeft()) +
                sumTree(bt.getRight());
    }

    public static int countTree (BinNode<Integer> bt) {
        if (bt == null)
            return 0;
        return 1 + countTree(bt.getLeft()) + countTree(bt.getRight());
    }

    public static int sumTreePositive (BinNode<Integer> bt) {
        if (bt == null)
            return 0;
        if (bt.getValue() >= 0)
            return bt.getValue() +
                    sumTreePositive(bt.getLeft()) +
                    sumTreePositive(bt.getRight());

        return  sumTreePositive(bt.getLeft()) +
                sumTreePositive(bt.getRight());
    }

    public static int countTreePositive (BinNode<Integer> bt) {
        if (bt == null)
            return 0;
        if (bt.getValue() >= 0)
            return 1 + countTreePositive(bt.getLeft()) + countTreePositive(bt.getRight());
        return countTreePositive(bt.getLeft()) + countTreePositive(bt.getRight());
    }

    public static int sumLeftSons (BinNode<Integer> bt) {
        if (bt == null)
            return 0;
        if (bt.hasLeft())
            return bt.getValue() + sumLeftSons(bt.getLeft()) + sumLeftSons(bt.getRight());
        return sumLeftSons(bt.getRight()) + sumLeftSons(bt.getLeft());
    }

    public static int countLeftSons (BinNode<Integer> bt) {
        if (bt == null)
            return 0;
        if (bt.hasLeft())
            return 1 + countLeftSons(bt.getLeft()) + countLeftSons(bt.getRight());
        return countLeftSons(bt.getRight()) + countLeftSons(bt.getLeft());
    }



    public static boolean exist(BinNode<Integer> bt, int x) {
        if (bt == null)
            return false;
        if (bt.getValue() == x)
            return true;
        return exist(bt.getLeft(), x) || exist(bt.getRight(), x);
    }


    public static int height (BinNode<Integer> bt)
    {
        if (bt == null) return -1;
        if (isLeaf (bt)) return 0;
        return 1 + Math.max(height (bt.getLeft()), height(bt.getRight()));
    }

    public static int countLeafs(BinNode<Integer> bt) {
        if (bt == null)
            return 0;
        if (isLeaf (bt))
            return 1 + countLeafs(bt.getLeft()) + countLeafs(bt.getRight());
        return countLeafs(bt.getRight()) + countLeafs(bt.getLeft());
    }

    public static int maxTree(BinNode<Integer> bt)
    {
        return Math.max(maxTree(bt.getLeft()), maxTree(bt.getRight()));
    }

}
