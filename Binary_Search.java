package com.company.arrays;
public class Binary_Search {
    static int binarysearch(int[] arr ,int l , int r , int x){
        if(r>=l){
            int mid = l+(r-1)/2;
            if(arr[mid] == x){
                return mid;
            }
            if(arr[mid] > x){
                return binarysearch(arr , l ,mid-1,  x);
            }
            else{
                return binarysearch(arr,mid+1,r,x);
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,4,6,7,9,12};
        int x  = 2;
        int n = arr.length;
        int result = binarysearch(arr,0,n-1,x);
        if(result == -1){
            System.out.println("not present");
        }
        else{
            System.out.println("present at index"+ result);
        }
    }
}
