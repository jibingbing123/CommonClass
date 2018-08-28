package com.common.test;

/**
 * @description:
 * @author: jibingbing
 * @create: 2018/01/31
 **/
public class Test {
    public static void main(String[] args) {
        int i = 3;
        int j = 0;
        float k = 3.2F;
        long m = -3;

        if(Math.ceil(i) < Math.floor(k)){
            if(Math.abs(i) == m){
                System.out.println(i);
            } else {
                System.out.println(j);
            }
        }
    }
}
