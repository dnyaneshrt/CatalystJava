package com.catalyst.arrays;

import java.util.Scanner;

public class BubbleSortTest {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("please enter the size of array");
        int size=sc.nextInt();

        int[] nums=new int[size]; //array declaration with size by taking user.

      /*  nums[0]=sc.nextInt();
        nums[1]=sc.nextInt();*/
        System.out.println("enter the values in array");
        for(int i=0;i<size;i++)
        {
            nums[i]=sc.nextInt();
        }

        int[] sortedArray= sortAsc(nums);
        System.out.println("sorted array in asc is as folows:");
        for(int i=0;i<size;i++)
        {
            System.out.println(sortedArray[i]);
        }
        int[] sortedDescArray= sortDesc(nums);
        System.out.println("sorted array in desc is as folows:");
        for(int i=0;i<size;i++)
        {
            System.out.println(sortedDescArray[i]);
        }
    }

    private static int[] sortDesc(int[] nums) {

        for(int i=0;i< nums.length;i++)
        {
            for(int j=0;j< nums.length-1-i;j++)
            {
                if(nums[j]<nums[j+1])
                {
                    int temp=nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=temp;
                }
            }
        }
        return nums;

    }

    private static int[] sortAsc(int[] nums) {

        for(int i=0;i< nums.length;i++)
        {
            for(int j=0;j< nums.length-1-i;j++)
            {
                if(nums[j]>nums[j+1])
                {
                    int temp=nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=temp;
                }
            }
        }
        return nums;
    }
}
