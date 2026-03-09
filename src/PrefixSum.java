import java.util.Scanner;

public class PrefixSum {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        //Step 1: Create a prefix sum array
        int PrefixSum[] = new int[n];
        PrefixSum[0] = arr[0];
        for(int i = 1; i<n ; i++){
            PrefixSum[i] = PrefixSum[i-1] + arr[i];
        }

        //Step 2: Print the prefix sum array
        System.out.println("The prefix sum of the array is: ");
        for(int i = 0; i<n; i++){
            System.out.print(PrefixSum[i] + " ");
        }

        //Step 3: Calculate the range sum
        System.out.println("Enter the left Starting index: ");
        int left = sc.nextInt();
        System.out.println("Enter the right ending index: ");
        int right = sc.nextInt();

        //Step 4: Calculate the range sum using the prefix sum array
        int rangeSum;
        if(left == 0){
            rangeSum = PrefixSum[right];
        }else{
            rangeSum =PrefixSum[right] - PrefixSum[left-1];
        }
        System.out.println("The range sum is: " + rangeSum);

    }
}
