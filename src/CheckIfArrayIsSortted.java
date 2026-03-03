import java.util.Scanner;
public class CheckIfArrayIsSortted {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");

        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements of the array: ");

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        boolean sorted = true;

        for(int i = 1; i<n ; i++){
            if(arr[i]<arr[i-1]){
                sorted = false;
                break;
            }
        }
        System.out.println("the array is sorted: " + sorted);

    }
}
