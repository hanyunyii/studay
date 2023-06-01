package stock;

/**
 * 栈
 */
public interface Stack<T> {

    public void push(T value);

    public void pop();

    public int size();

    public String show();
}
