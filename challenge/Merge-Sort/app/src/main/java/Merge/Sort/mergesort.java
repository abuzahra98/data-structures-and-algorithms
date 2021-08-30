package Merge.Sort;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class mergesort {



    public ArrayList<Integer>  mergeSort(ArrayList<Integer> arr)
    {
        int n=arr.size();
        ArrayList<Integer> left = new ArrayList<>();
        ArrayList<Integer> right = new ArrayList<>();
        ArrayList<Integer> Result = new ArrayList<>();
        if(n>1)
        {
            int mid=n/2;

            for(int i=0;i<mid;i++)
            {
             left.add(arr.get(i));
            }

            for(int i=mid;i<n;i++)
            {
                right.add(arr.get(i));
            }

            mergeSort(left);
            mergeSort(right);
            Result.addAll(merge(left,right,arr));
        }
        return Result;


    }
    public ArrayList<Integer> merge(ArrayList<Integer> left, ArrayList<Integer> right, ArrayList<Integer> arr ) {
        int i = 0;
        int j = 0;
        int k = 0;

        while(i < left.size() && j < right.size()){
            if(left.get(i) < right.get(j)){
                arr.set(k, left.get(i));
                i++;
                k++;
            }else{
                arr.set(k, right.get(j));
                j++;
                k++;
            }
        }
        while(j < right.size()){
            arr.set(k, right.get(j));
            j++;
            k++;
        }
        while(i < left.size()){
            arr.set(k, left.get(i));
            i++;
            k++;
        }
        return arr;

    }
}
