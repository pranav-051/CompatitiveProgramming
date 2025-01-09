//here always add didSwap condition for making time complexity O(n); 

class bubble_sort {
    public static void main(String[] args) {
       // int arr[] = { 1, 5, 2, 8, 3, 4, 6, 9, 7 };
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int max;
        int n = arr.length;
        int didSwap = 0; 
        
        for (int i = n - 1; i >= 0; i--) {
            for (int j = 0; j <= i - 1; j++) {
                if (arr[j + 1] < arr[j]) {
                    max = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = max;
                    
                    didSwap = 1; 
                }
            }
            if (didSwap == 0) {
                break;
            }
            System.out.println("Runs");
        }
        
        for (int i : arr) {
            System.out.println(i);
        }

    }
}