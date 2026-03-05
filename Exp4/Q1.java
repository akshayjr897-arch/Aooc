interface Stack {
    void push(int element);
    int pop();
    void display();
    boolean overflow();
    boolean underflow();
}

class IntegerStack implements Stack {
    private int[] arr;
    private int top;
    private int size;

    public IntegerStack(int size) {
        this.size = size;
        this.arr = new int[size];
        this.top = -1;
    }

    public boolean overflow() {
        return top == size - 1;
    }

    public boolean underflow() {
        return top == -1;
    }

    public void push(int element) {
        if (overflow()) {
            System.out.println("Stack Overflow! Cannot push " + element);
        } else {
            arr[++top] = element;
        }
    }

    public int pop() {
        if (underflow()) {
            System.out.println("Stack Underflow!");
            return -1;
        }
        return arr[top--];
    }

    public void display() {
        if (underflow()) {
            System.out.println("Stack is empty.");
            return;
        }
        System.out.print("Stack elements: ");
        for (int i = 0; i <= top; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}

public class Q1 {
    public static void main(String[] args) {
        IntegerStack myStack = new IntegerStack(3);
        myStack.push(10);
        myStack.push(20);
        myStack.push(30);
        myStack.display();
        myStack.push(40); // Test overflow
        System.out.println("Popped: " + myStack.pop());
        myStack.display();
    }
}