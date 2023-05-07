class largestelement{
    public static int lgest(int[] arr){
        int max = arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,2};
        int n = lgest(arr);
        System.out.println(n);
    }
}