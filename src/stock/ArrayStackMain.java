package stock;

public class ArrayStackMain {
    public static void main(String[] args) {
        Stack<Integer> integerArrayStack = new ArrayStackImpl<>(10);
        integerArrayStack.push(1);
        integerArrayStack.push(1);
        integerArrayStack.push(1);
        integerArrayStack.push(1);
        integerArrayStack.push(1);
        integerArrayStack.push(79);
        System.out.println(integerArrayStack.size());
        integerArrayStack.pop();
        System.out.println(integerArrayStack.show());
    }
}
