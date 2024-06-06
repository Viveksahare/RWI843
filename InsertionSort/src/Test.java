public class Test {
    public static void main(String[] args) {
        int arr[] = {8,9,6,4,2,7};

        for(int i=1; i< arr.length; i++){
            int current = arr[i];
            int j = i-1;
            while (j >= 0 && current < arr[j]){
                arr[j+1] = arr[j];
                j--;
            }
            //placement
            arr[j+1] = current;
        }
        Insertion_Sort.PrintArray(arr);
    }
}
