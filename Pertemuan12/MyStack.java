package Pertemuan12;

public class MyStack extends AbstractStack {
    private int maxSize;
    private int top;
    private Object[] stackArray;

    public MyStack(int size) {
        maxSize = size;
        stackArray = new Object[maxSize];
        top = -1;
    }

    @Override
    public void push(Object item) {
        if (top < maxSize - 1) {
            stackArray[++top] = item;
        } else {
            System.out.println("Stack penuh!");
        }
    }

    @Override
    public Object pop() {
        if (!isEmpty()) {
            return stackArray[top--];
        } else {
            System.out.println("Stack kosong!");
            return null;
        }
    }

    @Override
    public boolean isEmpty() {
        return (top == -1);
    }

    public void displayStack(String s) {
        System.out.print(s + "Stack (bottom --> top): ");
        for (int i = 0; i <= top; i++) {
            System.out.print(stackArray[i] + " ");
        }
        System.out.println();
    }
}
