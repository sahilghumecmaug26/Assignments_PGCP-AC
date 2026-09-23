import java.util.Arrays;
import java.util.Comparator;
	
public class LambdaExercise {

	public static void main(String[] args) {


			// Problem 1 
		
		String[] names = {"Sahil","Rohan","Rohit","Rutuj","Sagar" };
		
		Comparator<String> c = (a, b) -> a.compareTo(b);

		Arrays.sort(names,c);
//		
		for (String a : names) {
			System.out.println(a);
		}


    
	}

}
