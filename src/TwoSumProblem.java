import java.util.Arrays;
import java.util.Scanner;

public class TwoSumProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements of the array: ");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter the target sum: ");
        int target = sc.nextInt();

        Arrays.sort(arr);

        int left = 0;
        int right = n - 1;
        boolean found = false;

        while(left < right){
            int sum = arr[left] + arr[right];
            if(sum == target){
                found = true;
                break;
            }else if(sum > target){
                right--;
            }else if(sum < target){
                left++;
            }
        }

        if(found == true){
            System.out.println("The two sum found " + arr[left] + " and " + arr[right] + " = " + target);
        }else{
            System.out.println("No pair found!");
        }

    }
}
