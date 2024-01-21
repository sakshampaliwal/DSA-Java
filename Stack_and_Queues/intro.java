import java.util.*;

class customstack {
    int stack[];
    int top = 0;

    customstack() {
        stack = new int[5];
    }

    customstack(int no) {
        stack = new int[no];
    }

    public void push(int no) {
        if (top == stack.length) {
            System.out.println("Out of Bound...");
            return;
        }
        stack[top] = no;
        top++;
    }

    public void pop() {
        if (top == 0) {
            System.out.println("No more pop...");
            return;
        }
        stack[top - 1] = 0;
        top--;

    }

    public void peek() {
        System.out.println(stack[top - 1]);
    }

    public void display() {
        for (int i=0;i<top;i++) {
            System.out.println(stack[i]);
        }
    }
}

public class intro extends customstack {
    intro(){
        super();
    }
    intro(int size){
        super(size);
    }
    public static void main(String[] args) {
        customstack st = new customstack(2);
        st.push(5);
        st.push(6);
        st.push(7);
        System.out.println("_______");
        st.display();
        st.pop();
        System.out.println("______");
        st.display();
    }
}