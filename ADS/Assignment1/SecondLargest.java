import java.util.Scanner;

public class SecondLargest {
    public static void main(String[] args) {

        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of an array : ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the elements of array : ");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            if (arr[i] > max) {
                secondMax = max;
                max = arr[i];
            }
            if (arr[i] < max && arr[i] > secondMax) {
                secondMax = arr[i];
            }
        }

        System.out.println("Second largest element is : " + secondMax);

    }
}
