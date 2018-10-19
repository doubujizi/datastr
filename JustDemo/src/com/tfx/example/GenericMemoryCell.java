package com.tfx.example;

/**
 * @author tianfuxian
 * @Description:
 * @Date: 2018-10-19 18:07
 */
public class GenericMemoryCell<T> {
    private T storedValue;
    public T read(){
        return storedValue;
    }
    public void write(T x){
        storedValue = x;
    }
}
