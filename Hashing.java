/* 
import java.util.Scanner;

class Hashing {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter size of array: ");
        int size = scan.nextInt();
        int arr[] = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.print("Enter new item: ");
            arr[i] = scan.nextInt();
        }

        int hash[] = new int[13];
        for (int i = 0; i < 13; i++) {
            hash[i] = 0;
        }
        for (int i = 0; i < size; i++) {
            hash[arr[i]] += 1;
        }

        for (int i = 0; i < 3; i++) {
            System.out.println("Enter search key: ");
            int n = scan.nextInt();
            System.out.println("key: " + n + " freq: " + hash[n]);

        }
    }
}
 */

 //for characters

import java.util.Scanner;

class Hashing {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("\n Enter String: ");
        String str = scan.nextLine(); 

        int hash[] = new int[256];
        for (int i = 0; i < 256; i++) {
            hash[i] = 0;
        }
        
        for (int i = 0; i < str.length(); i++) {
            hash[str.charAt(i)] += 1;
        }
        
        System.out.print("\n Enter character for search count: ");
        char charSearch = scan.nextLine().charAt(0);
        
        System.out.println("Character: " + charSearch + "Frequency: " + hash[charSearch]);
    
    }
}  