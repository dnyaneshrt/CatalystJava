package com.catalyst.arrays;
/*
-Array is collection of similler type of data elements.
-Array declaration.
datatype[] array_name=new Datatype[array_size];
int[] nums=new int[10];
-array is fixed in size.. means once we declare an array we cannot change the size.
-array index always starts with zero and ends with [array-size -1]
-the moment we declare the array with specified size, array will be filled with the default values of that type of array for all size.
-array always stores in contiguos memory locations.


*/
public class ArrayTest1 {
    public static void main(String[] args) {
        int[] nums=new int[5]; //array declaration with size 5.

        nums[0]=77788;
        nums[4]=11111;
        nums[2]=7778;
        nums[3]=667;
        nums[1]=777;
        System.out.println("the length of above array is :"+nums.length);
        for(int i=0;i< nums.length;i++)
        {
            System.out.println(nums[i]);//0,1,2,3,4
        }

        System.out.println("the value is at index no. 3 is :"+nums[3]);

        System.out.println("max number from above array is :"+findMaxValue(nums));  //method calling by passing an array
        System.out.println("min number from above array is :"+findMinValue(nums));  //method calling by passing an array

        System.out.println("second highest number from above array is :"+findSecondMaxValue(nums));  //method calling by passing an array
    }

    private static int findSecondMaxValue(int[] nums) {
        int max=nums[0];
        int s_max=0;

        for(int i=1;i< nums.length;i++)
        {
            if(nums[i]>max)
            {
                s_max=max;
                max=nums[i];
            }else if(s_max<nums[i])
            {
                s_max=nums[i];
            }
        }
        return s_max;
    }

    private static int findMaxValue(int[] nums) {
        int max=nums[0];

        for(int i=0;i< nums.length;i++)
        {
           if(nums[i]>max)
           {
               max=nums[i];
           }
        }
        return max;
    }

    private static int findMinValue(int[] nums) {
        int min=nums[0];

        for(int i=0;i< nums.length;i++)
        {
            if(nums[i]<min)
            {
                min=nums[i];
            }
        }
        return min;
    }
}
