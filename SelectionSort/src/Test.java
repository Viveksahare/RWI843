public class Test {
    public static void main(String[] args) {
        int arr[] = {5,7,6,4,9};

        for(int i=0; i< arr.length-1; i++){
            int smallest = i;
            for(int j=i+1; j< arr.length; j++){
                if(arr[smallest] > arr[j]){
                    smallest = j;
                }
            }
            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp;;
        }
        Selection_Sort.PrintArray(arr);
    }
}
