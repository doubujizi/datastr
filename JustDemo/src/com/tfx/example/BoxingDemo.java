package com.tfx.example;

/**
 * @author tianfuxian
 * @Description: 自动装箱和拆箱
 * @Date: 2018-10-19 18:09
 */
public class BoxingDemo {
    public static void main(String[] args) {
        //java7新增的特性 菱形运算符 简化代码的开发
        GenericMemoryCell<Integer> m = new GenericMemoryCell<>();
        m.write(37);
        int val = m.read();
        System.out.println("Contents are: "+val);
    }
}
