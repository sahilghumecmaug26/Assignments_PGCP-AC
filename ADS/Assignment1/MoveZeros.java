import java.util.Scanner;

public class MoveZeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of an array : ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the elements of array : ");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int pos = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                arr[pos] = arr[i];
                pos++;
            }

        }

        while (pos < arr.length) {
            arr[pos] = 0;
            pos++;
            
        }

        System.out.println("Array after moving zeros to end : ");
        for (int a : arr) {
            System.out.print(a + " ");
        }
    }
}
