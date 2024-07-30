package com.gaurav;

import java.util.Arrays;
import java.util.List;

public class Test {

    public int value;
    public int hashcode(){
        return (int)(value^5);
    }

    public static void main(String[] args) {
        Test t = new Test();
        t.hashcode();

        List inst = Arrays.asList(1,2,3);
        List nums = inst;
        nums.add(3.12);
        System.out.println(nums);
    }
}
