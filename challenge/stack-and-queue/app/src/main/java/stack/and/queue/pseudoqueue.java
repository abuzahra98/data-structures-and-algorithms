package stack.and.queue;

public class pseudoqueue {

    Stack stackOne;
    Stack stackTwo;


    public void PseudoQueue(){
        stackOne = new Stack();
        stackTwo = new Stack();
    }


////////////////////////////////////////////////////////////////////////

    public void push(Stack<Integer> topNode, int newValue) {

        topNode.push(newValue);
    }
////////////////////////////////////////////////////////////////////////

    public int pop(Stack<Integer> topNode){
        if (topNode.isEmpty()) {
            System.out.println("Stack Empty");
            System.exit(0);
        }
        return topNode.pop();
    }

////////////////////////////////////////////////////////////////////////


    public void enQueue(int value){
        stackOne.push(value);
    }
    ////////////////////////////////////////////////////////////////////////
    public void deQueue(int value){
        if(stackOne.isEmpty() && stackTwo.isEmpty()) {
            System.out.println("Stack is empty");
            System.exit(0);
        }

        if (stackTwo.isEmpty()){
            while(!stackOne.isEmpty()){
                push(stackTwo, pop(stackOne));
            }
        }


    }
}
