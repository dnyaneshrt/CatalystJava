package com.catalyst.interview;

import java.util.Set;
import java.util.TreeSet;

public class ArrayTest {
    public static void main(String[] args) {
        Integer[] arr1={40,50,10,20,30};
        Integer[] arr2={40,50,60,70,80};
        Set<Integer> nums=new TreeSet<>();
        int duplicateCount=0;
        //finding all elements without addng duplicates.
        for(int i=0;i<arr1.length;i++)
        {
           if(!nums.add(arr1[i])) {
               duplicateCount++;
               System.out.println(arr1[i]);
           }
        }
        for(int i=0;i<arr2.length;i++)
        {
            if(!nums.add(arr2[i]))
            {
                duplicateCount++;
             System.out.println(arr2[i]);
        }
        }
        System.out.println(nums);
        System.out.println("total no.of dupllicate elements from both arrays are: "+duplicateCount);
    }
}
