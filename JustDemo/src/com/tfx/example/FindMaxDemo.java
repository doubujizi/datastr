package com.tfx.example;

/**
 * @author tianfuxian
 * @Description:
 * @Date: 2018-10-19 17:47
 */
public class FindMaxDemo {
    public static Comparable findMax(Comparable[]arr){
        int maxIndex = 0;
        for(int i =1;i<arr.length;i++){
            if(arr[i].compareTo(arr[maxIndex])>0){
                maxIndex =i;
            }
        }
        return arr[maxIndex];
    }

    public static void main(String[] args) {
        String [] str1={"Joe","Bob","Bill","Zeke"};
        System.out.println(findMax(str1));
    }
}
