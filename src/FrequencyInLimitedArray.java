import java.util.Scanner;

public class FrequencyInLimitedArray {
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
        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }

        int count = 0;
        for(int i = 0; i < n; i++){
            if(arr[i] == 0){
                count++;
            }
        }
        if(count > 0){
            System.out.println("Frequency of zero is : " + count);
        }

        for(int i = 0; i < n; i++){
            if(arr[i] != 0){
                count = 1;
                for(int j = i+1; j < n; j++){
                    if(arr[i] == arr[j]){
                        count++;
                        arr[j] = 0;
                    }
                }
                System.out.println(arr[i] + " " + count);
            }
        }
    }
}
