import java.util.Scanner;

public class MaximumConsecutiveOnes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements of the array: ");

        //To store the elements of the array
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        int maxCount = 0; // to store the maximum count of consecutive ones
        int count = 0; // to store the current count of consecutive ones

        for(int i = 0; i < n; i++){
            if(arr[i] == 1){
                count++;
                maxCount = Math.max(count, maxCount); // update the maximum count if the current count is greater
            }else{
                count = 0;
            }
        }
        System.out.println("The maximum number of consecutive ones is: " + maxCount);
    }
}
