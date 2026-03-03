import java.util.Scanner;

public class MoveZerosToEnd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // YOUR LOGIC HERE
        int j = 0;// Pointer to track the position of non-zero elements

        // Move non-zero elements to the j position
        for(int i=0 ; i <n ; i++){
            if(arr[i] != 0){
                arr[j] = arr[i];
                j++;
            }
        }

        // Fill remaining elements with 0
        while (j < n){
            arr[j] = 0;
            j++;
        }

        // PRINTING THE ARRAY
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
