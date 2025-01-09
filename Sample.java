
class Sample 
{
    public static void main(String[] args) {
        int arr[] = { 5, 6, 1, 2, 7, 4, 5, 1, 9 };

        int min = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    min = arr[j];
                    arr[j] = arr[i];
                    arr[i] = min;
                }
            }
        }

        for (int i : arr) {
            System.out.println(i);
        }
    }
    
}