package stock;

public class ArrayStackImpl<T> implements Stack<T> {
    private Integer size;
    private T[] data;
    ArrayStackImpl(Integer size){
        data= (T[]) new Object[size];
        this.size=0;
    }
    @Override
    public void push(T value) {
        if (size>=data.length){
            throw  new RuntimeException("stack out");
        }
        data[size]=value;
        size++;
    }

    @Override
    public void pop() {
        if (size==0){
            throw  new RuntimeException("stack is empty");
        }
        data[size-1]=null;
        size--;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public String show() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("stack:[");
        for (Integer i = 0; i < size; i++) {
            if (i==0){
                stringBuffer.append(data[i]);
            }else{
                stringBuffer.append(",");
                stringBuffer.append(data[i]);

            }

        }
        stringBuffer.append("]");
        return stringBuffer.toString();
    }
}
