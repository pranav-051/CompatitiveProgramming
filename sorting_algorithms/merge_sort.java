
class merge_sort {

    public static void merge(int[] arr, int low, int mid, int high) {
        int temp[] = new int[high - low + 1];
        int left = low;   // Start of the left subarray
        int right = mid + 1; // Start of the right subarray
        int index = 0;    // Index for the temporary array

        // Merge the two subarrays
        while (left <= mid && right <= high) {
            if (arr[left] <= arr[right]) {
                temp[index++] = arr[left++];
            } else {
                temp[index++] = arr[right++];
            }
        }

        // Copy remaining elements from the left subarray
        while (left <= mid) {
            temp[index++] = arr[left++];
        }

        // Copy remaining elements from the right subarray
        while (right <= high) {
            temp[index++] = arr[right++];
        }

        // Copy sorted elements back to the original array
        for (int i = 0; i < temp.length; i++) {
            arr[low + i] = temp[i];
        }
    }

    public static void mS(int[] arr, int low, int high) {
        if (low < high) {
            int mid = (low + high) / 2;
            mS(arr, low, mid);       // Sort left half
            mS(arr, mid + 1, high); // Sort right half
            merge(arr, low, mid, high); // Merge both halves
        }
    }

    public static void mergeSort(int[] arr, int size) {
        mS(arr, 0, size - 1);
    }

    public static void main(String[] args) {
        int arr[] = {1, 4, 7, 2, 5, 8, 3, 6, 9, 0};
        int size = arr.length;

        System.out.println("Original Array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();

        mergeSort(arr, size);

        System.out.println("Sorted Array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
