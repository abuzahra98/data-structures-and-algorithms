package tree;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

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

    public int maximumValue(Node<Integer> root) {
        if (this.root == null) return 0;
        if (this.root.left == null || this.root.right == null)

            return (int) this.root.value;
        int max = 0;
        ArrayList<Integer> maxList = (ArrayList<Integer>) postOrder((Node<t>) this.root);
        for (int i = 0; i < maxList.size(); i++) {
            if (maxList.get(i) >= max) {
                max = maxList.get(i);
            }
        }
        return max;
    }

    private Object postOrder(Node<t> root) {
        return null;
    }

    public ArrayList breadthFirst(BinarySearchTree<Integer> newTree) throws Exception {
        ArrayList<Object> resultList = new ArrayList<>();
        resultList.clear();
        Queue<Node> queue = new LinkedList<>();
        queue.add(this.root);
        while(!queue.isEmpty()) {
            Node newNode = queue.poll();
            resultList.add(newNode.value);
            if(newNode.left != null) {
                queue.add(newNode.left);
            }
            if(newNode.right != null){
                queue.add(newNode.right);
            }

        }
        return resultList;
    }
    public Node<t> getRoot() {
        if (root == null) {
            return null;
        }
        return root;
    }

    public void setRoot(Node<t> root) {
        this.root = root;
    }
    public BinaryTree<String> fizzBuzz(BinaryTree<Integer> tree) {

        BinaryTree<String> newTree = new BinaryTree<>();

        if (tree.getRoot().getData() != null) {
            traverseFizzBuzzTree(tree.getRoot(), newTree.getRoot());
        }

        return newTree;
    }

    private void traverseFizzBuzzTree(Node<Integer> root, Node<String> newRoot) {

        if (root.getData() % 15 == 0) {
            newRoot.setData("FizzBuzz");
        } else if (root.getData() % 5 == 0) {
            newRoot.setData("Buzz");
        } else if (root.getData() % 3 == 0) {
            newRoot.setData("Fizz");
        } else {
            newRoot.setData(root.getData().toString());
        }

        if (root.getLeft() != null) {
            newRoot.setLeft(new Node<>());
            traverseFizzBuzzTree(root.getLeft(), newRoot.getLeft());
        }

        if (root.getRight() != null) {
            newRoot.setRight(new Node<>());
            traverseFizzBuzzTree(root.getRight(), newRoot.getRight());
        }
    }

}

