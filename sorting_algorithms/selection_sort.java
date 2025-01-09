class selection_sort {
    public static void main(String[] args) {
        int arr[]  = {4,8,9,6,5,2,7,3,1,0};
        int size = arr.length;
        
        int min = 0; 
        for (int i = 0; i < size - 1; i++) {
            for (int j = i + 1; j < size ; j++) {
                if (arr[i] > arr[j]) {
                    min = arr[j];
                    arr[j] = arr[i];
                    arr[i] = min;
                }
            }
        }
        
        for (int i = 0; i < size; i++) {
            System.out.println(arr[i]);
        }
    }
}