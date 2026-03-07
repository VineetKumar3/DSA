import java.util.Scanner;

public class BuyAndSellStock {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of days: ");
        int n = sc.nextInt();
        int arr [] = new int[n];
        System.out.println("Enter the stock prices for each day: ");
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        int minPrice = arr[0];
        int maxProfit = 0;

        for(int i = 1; i<n; i++){
            if(arr[i] < minPrice){
                minPrice = arr[i];
            }else if((arr[i] - minPrice) > maxProfit ){
                maxProfit = arr[i] - minPrice;
            }
        }
        //Loop will run for the full array and compare to all index and at the
        //exit of the loop the max value that we will get is the answer
        System.out.println("The maximum profit is " + maxProfit);
    }
}
