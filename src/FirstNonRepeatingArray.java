import java.util.Scanner;

public class FirstNonRepeatingArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the elements of the array : ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("The original array : ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        //Step 1 Making the new array of same size
        int freq[] = new int[n+1];

        //Step 2 count frequency in indexes
        for(int i = 0; i<n ;i++){
            freq[arr[i]]++;
        }
        //Step 3 print the element that is 1 occuring first

        for(int j = 0 ; j < n ;j++){
            if(freq[arr[j]] == 1){
                System.out.print("The first non repeating element in the array is : " + arr[j]);
                break;
            }
        }

    }
}
