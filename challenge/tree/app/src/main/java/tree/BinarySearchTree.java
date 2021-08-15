package tree;

public class BinarySearchTree<t> extends BinaryTree{
    public void add(t value){
        root=addRecursive(root,(int)value);
    }


    private Node addRecursive(Node current, int value) {
        if (current == null) {
            return new Node(value);
        }

        if (value < (int)current.value) {
            current.left = addRecursive(current.left, value);
        } else if (value > (int)current.value) {
            current.right = addRecursive(current.right, value);
        } else {
            // value already exists
            return current;
        }

        return current;
    }

    public boolean contains(t value){
        return containsFunctionHelper(root,value);
    }


    public boolean containsFunctionHelper(Node root,t value){
        if (root==null) {
            return false;
        }
        if((int)root.value>(int)value){
            System.out.println((int)root.value);
            return containsFunctionHelper(root.left,value);
        }
        if((int)root.value<(int)value){
            return containsFunctionHelper(root.right,value);
        }
        if((int)root.value==(int)value){
            return true;
        }


        return false;
    }
}