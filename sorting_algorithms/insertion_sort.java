class insertion_sort {
    public static void main(String[] args) {
        
        int arr[] = { 5, 6, 2, 9, 3, 5, 9, 4 };
        int size = arr.length;
        
        for (int i = 0; i <= size - 1; i++) {
            int j = i;

            while (j > 0 && arr[j - 1] > arr[j]) {
                int temp = arr[j - 1];
                arr[j - 1] = arr[j];
                arr[j] = temp;

                j--;
            }
        }
        
        for (int i : arr) {
            System.out.print(i+"\t");
        }
    }
}