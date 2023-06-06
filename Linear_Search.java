package com.company.arrays;
public class Linear_Search {
    static int linearsearch(int[] arr, int n , int x){
        for(int i = 0 ; i<n ;i++){
            if(arr[i] == x){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,4,5,7,9};
        int n = arr.length;
        int x = 7;
        int result = linearsearch(arr,n,x);
        if(result==-1){
            System.out.println("element not present ");
        }
        else{
            System.out.println("element present at"+result);
        }
    }
}
