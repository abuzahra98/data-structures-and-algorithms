package tree;

import java.util.ArrayList;

public class BinaryTree <t>{
    public Node<t>root;
    public ArrayList<t> preOrder=new ArrayList<>();
    public ArrayList <t> preorderFunction(Node <t> rootNode){
        if (rootNode!=null){
            System.out.println(rootNode.getNodeValue());
            preOrder.add(rootNode.getNodeValue());
            if ((rootNode.getLeft()!=null)){
                preorderFunction(rootNode.getLeft());
            }  if ((rootNode.getRight()!=null)){
                preorderFunction(rootNode.getRight());
            }
        }return preOrder;
    }

    ///////////////////////////////////////////////////////////////////

    public ArrayList<t>inOrder=new ArrayList<>();
    public ArrayList <t> inOrderFunction(Node <t> rootNode){
        if (rootNode!=null){
            if ((rootNode.getLeft()!=null)){
                inOrderFunction(rootNode.getLeft());
            }   System.out.println(rootNode.getNodeValue());
            inOrder.add(rootNode.getNodeValue());
            if ((rootNode.getRight()!=null)){
                inOrderFunction(rootNode.getRight());
            }
        }return inOrder;
    }

    ///////////////////////////////////////////////////////////////////
    public ArrayList<t>postOrder=new ArrayList<>();
    public ArrayList <t> postOrderFunction(Node <t> rootNode){
        if ((rootNode.getLeft()!=null)){
            postOrderFunction(rootNode.getLeft());
        }
        if ((rootNode.getRight()!=null)){
            postOrderFunction(rootNode.getRight());
        }System.out.println(rootNode.getNodeValue());
        postOrder.add(rootNode.getNodeValue());
        return postOrder;
    }

    public int maximumValue() {
        if (root == null) return 0;
        if (root.left == null || root.right == null)

            return (int) root.value;
        int max = 0;
        ArrayList<Integer> maxList = (ArrayList<Integer>) postOrder((Node<t>) root);
        for (int i = 0; i < maxList.size(); i++) {
            if (maxList.get(i) >= max) {
                max = maxList.get(i);
            }
        }
        return max;
    }

}