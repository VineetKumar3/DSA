import java.util.Scanner;

public class RemoveDuplicateFromSortedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array:");

        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements of the array:");

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        int arr2[] = new int[n]; // to store the unique elements
        int j = 0; // to keep track of the index of arr2

        arr2[0] = arr[0]; // the first element is always unique

        for(int i = 1; i < n; i++){
            if(arr[i] != arr2[j]){
                j++;
                arr2[j] = arr[i];
            }
        }

        System.out.print("The elements of the array are:");
        for(int i = 0; i <= j; i++){
            System.out.print(arr2[i] + " ");
        }
    }
}