package com.tfx.example;

/**
 * @author tianfuxian
 * @Description:
 * @Date: 2018-10-18 17:41
 */
public class TestMemoryCell {
    public static void main(String[] args) {
        MemoryCell memoryCell=new MemoryCell();
        memoryCell.write("37");
        String val =(String) memoryCell.read();
        System.out.println("Contents are :"+val);
    }
}
