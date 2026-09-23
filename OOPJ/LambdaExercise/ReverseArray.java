import java.util.function.Function;

public class ReverseArray {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		Function<int[], int[]> a = (arr1) -> {
			int result[] = new int[arr1.length];

			for (int i = 0; i < arr.length; i++) {
				result[arr.length - 1 - i] = arr1[i];
			}
			
			return result;
		};

		int[] reversed = a.apply(arr);
		
		for(int i : reversed) {
			System.out.println(i);
		}
	}

}
