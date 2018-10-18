package com.tfx.example;

/**
 * @author tianfuxian
 * @Description:
 * @Date: 2018-10-18 17:37
 */
public class MemoryCell {
    public Object read(){
        return  storedValue;
    }
    public void write(Object x){
        storedValue = x;
    }
    private Object storedValue;
}
