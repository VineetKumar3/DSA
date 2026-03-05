import java.util.Scanner;
public class CheckSubsetOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the first array : ");
        int n = sc.nextInt();
        int arr1[] = new int[n];

        System.out.print("Enter the elements of the first array : ");
        for(int i = 0 ; i < n ; i++) {
            arr1[i] = sc.nextInt();
        }

        System.out.print("Enter the size of the Second array : ");
        int m = sc.nextInt();
        int arr2[] = new int[m];
        System.out.print("Enter the elements of the second array : ");
        for(int i = 0 ; i < m ; i++) {
            arr2[i] = sc.nextInt();
        }

        boolean isSubset = true;
        for(int i =0; i<m ; i++){
            boolean found = false;
            for(int j = 0; j<n ;j++){
                if(arr1[j] == arr2[i]){
                    found = true;
                    break;
                }
            }
            if(!found){
                isSubset = false;
                break;
            }

        }
        if(isSubset ==  true){
            System.out.println("The second array is a subset of the first array");
        }else {
            System.out.println("The second array is not a subset of the first array");
        }
    }
}
