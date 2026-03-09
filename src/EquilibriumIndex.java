import java.util.Scanner;

public class EquilibriumIndex {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements of the array: ");
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        // Calculate the prefix sum of the array
        int prefixSum[] = new int[n];
        prefixSum[0] = arr[0];
        for(int i = 1; i<n; i++){
            prefixSum[i] = prefixSum[i-1] + arr[i];
        }

        // Print the prefix sum of the array
        System.out.println("The prefix sum is : ");
        for(int i = 0; i<n; i++){
            System.out.print(prefixSum[i] + " ");
        }

        // Find the equilibrium index
        for(int j = 0; j<n; j++){
            int leftSum = prefixSum[j] - arr[j];
            int rightSum = prefixSum[n-1] - prefixSum[j];
            if(leftSum == rightSum){
                System.out.println("\nThe equilibrium index is: " + j);
            }
        }
    }
}
