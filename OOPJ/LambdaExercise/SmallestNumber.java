import java.util.function.BiPredicate;

public class SmallestNumber {

	public static void main(String[] args) {
		
		BiPredicate<Integer, Integer> b = (x, y) -> x < y;
		
		int arr[] = { 7, 6, 3, 12, 15, 25, 55, 512, 45, 4, 60 };
		int min = arr[0];
		
		for (int i = 0; i < arr.length; i++) {
			
			if (b.test(arr[i], min)) {
				min = arr[i];
			}
			
		}

		System.out.println(min);
	}

}
