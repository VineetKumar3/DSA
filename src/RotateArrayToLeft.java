import java.util.Scanner;
public class RotateArrayToLeft {

    // Function to reverse a portion of the array
    static void ReverseArray(int arr[], int left, int right){
        while(left < right){
            int temp = arr[left];
            arr[left] =  arr[right];
            arr[right] = temp;

            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.print("Enter the elements of the array : ");

        for(int i = 0 ; i<n ; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter how many steps you want to rotate the array : ");
        int p = sc.nextInt();

        // Step 1: Reverse the first p elements
        ReverseArray(arr, 0, p-1);
        // Step 2: Reverse the remaining n-p elements
        ReverseArray(arr, p , n-1);
        // Step 3: Reverse the whole array
        ReverseArray(arr, 0, n-1);

        System.out.println("The rotated array is : ");
        for(int i = 0 ; i<n ; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
