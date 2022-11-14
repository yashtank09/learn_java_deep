package ExceptionHandling;

// User Define Exceptions

// Stack Overflow exception which will gives message that stack is full.
class StackOverflowException extends Exception{
    public String toString(){
        return "Error: Stack is Overflow, Stack is Full.";
    }
}

// Stack Underflow exception which will gives message that stack is empty.
class StackUnderflowException extends Exception{
    public String toString(){
        return "Error: Stack is Underflow, Stack is Empty.";
    }
}
class Stack{
    private int size;
    private int top = -1;
    private int S[];

    // constructor for initializing datamembers and defining size of array using argument
    public Stack(int sz){
        size = sz;
        S = new int[sz];
    }
    // Pushing/Inserting an element in Stacck
    public void push(int x) throws StackOverflowException {
        if(top == size-1)
            throw new StackOverflowException();
        top++;
        S[top] = x;
    }

    // Poppiing/Deleting an element in Stacck
    public int pop() throws StackUnderflowException{
        int x = -1;
        if(top == -1)
            throw new StackUnderflowException();
        S[top] = x;
        top--;
        return x;
    }

    // Printing array
    public void printStack(){
        for(int i=0; i<=S.length-1; i++){
            System.out.println(S[i]);
        }
    }
}
public class UDE_stack_challange {
    public static void main(String[] args) {
        
        // Object of class Stack
        Stack st = new Stack(5);
        try {
            st.push(10);
            st.push(20);
            st.push(30);
            st.push(40);
            st.push(50);
            // st.push(60); if we are adding 6th element then it will rais an error: 'Stack is Full'
            st.printStack();
            st.pop();
            st.pop();
            st.pop();
            System.out.println("After Popping elements: ");
            st.printStack();
            // st.pop(); if we are popping 6th element then it will rais an error: 'Stack is Empty'
            
        } catch (StackOverflowException e) {
            System.out.println(e);
        } catch (StackUnderflowException e) {
            System.out.println(e);
        }
    }
}
