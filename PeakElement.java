package BinarySearch;

public class PeakElement {
    public static int peakEleBruteForce(int[] arr, int n) {

        if (arr[0] >= arr[1])
          return arr[0];
    
        for (int i = 1; i < n - 1; i++)
          if (arr[i] >= arr[i - 1] && arr[i] >= arr[i + 1])
            return arr[i];
    
        return arr[n - 1];
      }
    public static void main(String[] args) {
        int[] arr = {3, 5, 4, 1, 1};
        int n = arr.length;
    
        System.out.println("Peak Element is " + peakEleBruteForce(arr, n));
    }
    
}
