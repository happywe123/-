package ReadAgain.设计模式.创建型.Builder;

import java.util.Arrays;

/**
 * 封装一个对象的构造过程，并允许按步骤构造
 */
public class AbstractStringBuilder {
    protected char[] value;
    protected int count;

    public AbstractStringBuilder(int capacity){
        count = 0;
        value = new char[capacity];
    }

    public AbstractStringBuilder append(char c){
        ensureCapacityInternal(count + 1);
        value[count++] = c;
        return this;
    }

    private void ensureCapacityInternal(int minimumCapacity){
        if(minimumCapacity - value.length > 0){
            expandCapacity(minimumCapacity);
        }
    }

    void expandCapacity(int minimumCapacity){
        int newCapacity = value.length * 2 + 2;
        if(newCapacity - minimumCapacity < 0){
            newCapacity = minimumCapacity;
        }
        if(newCapacity < 0){
            if(minimumCapacity < 0)
                throw new OutOfMemoryError();
            newCapacity = Integer.MAX_VALUE;
        }
        value = Arrays.copyOf(value,newCapacity);
    }
}
