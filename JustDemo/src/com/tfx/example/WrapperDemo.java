package com.tfx.example;

/**
 * @author tianfuxian
 * @Description: 使用MemoryCell来存储整数
 * @Date: 2018-10-18 17:48
 */
public class WrapperDemo {
    public static void main(String[] args) {
        MemoryCell memoryCell = new MemoryCell();
        memoryCell.write(new Integer((37)));
        Integer wrapperVal = (Integer)memoryCell.read();
        int val = wrapperVal.intValue();
        System.out.println("Content are:" + val);

    }
}
