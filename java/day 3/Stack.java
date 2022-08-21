class Stack {
    int arr[];
    int top;
    int capacity;

    Stack(int size) {
        arr = new int[size];
        capacity = size;
        top = -1;
    }

    boolean empty() {
        return top == -1;
    }

    boolean full() {
        return top == capacity - 1;
    }

    void push(int elm) {
        if (full()) {
            System.out.println("Stack if full");
            System.exit(1);
        }
        System.out.println("Pushing " + elm);
        arr[++top] = elm;
    }

    int pop() {
        if (empty()) {
            System.out.println("Stack if empty");
            System.exit(1);
        }
        return arr[top--];
    }

    void display() {
        if (empty()) {
            System.out.println("Stack if empty");
        }
        for (int i = 0; i <= top; i++)
            System.out.print(arr[i] + ", ");
       System.out.println();
    }

    public static void main(String[] args) {
        Stack stack = new Stack(5);

        System.out.println("The initial elements of the stack are/is ->");
        stack.display();

        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println("The elements of the stack now are/is ->");
        stack.display();

        System.out.println("Removing one element...");
        stack.pop();

        System.out.println("The elements of the satck after removing are/is ->");
        stack.display();
    }
}