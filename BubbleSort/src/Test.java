public class Test {
    public static void main(String[] args) {
        int arr[] = {5,8,6,4,2};

        for(int i=0; i< arr.length-1; i++){
            for(int j=0; j< arr.length-i-1; j++){
                if(arr[j] > arr[j+1]){
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        Bubble_Sort.PrintArray(arr);
    }
}
