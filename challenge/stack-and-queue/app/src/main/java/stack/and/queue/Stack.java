package stack.and.queue;

import java.util.EmptyStackException;

public class Stack <T>{
    Node<T> top;
    T value;

    public Stack(){
        this.top = null;
    }

   // **********************************************************//
    public void push(T value){
        Node<T> temp = new Node<>(value);
        temp.next = top;
        top = temp;
    }

    // **********************************************************//

    public T pop(){
        if(this.top == null){
            throw new EmptyStackException();
        }
        Node<T> temp = this.top;
        this.top = this.top.next;
        temp.next = null;
        return temp.value;
    }

    // **********************************************************//

    public T peek(){
        if(this.top == null){
            throw new EmptyStackException();
        }
        return this.top.value;
    }


    // **********************************************************//

    public boolean isEmpty(){
        return this.top == null;
    }
}

