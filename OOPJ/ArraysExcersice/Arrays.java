public class Arrays {

    public static void main(String args[]) {

//        System.out.println("Enter the size of an array : ");
//
//        int n = ConsoleInput.getInt();
//
//        int arr[] = new int[n];
//
//        System.out.println("Enter the Elements of an array : ");
//
//        for (int i = 0; i < n; i++) {
//            arr[i] = ConsoleInput.getInt();
//        }
//        
//        System.out.println("Enter the size of an array : ");
//
//        int m = ConsoleInput.getInt();
//
//        int arr1[] = new int[m];
//
//        System.out.println("Enter the Elements of an array : ");
//
//        for (int i = 0; i < m; i++) {
//            arr1[i] = ConsoleInput.getInt();
//        }
        
 //       findCommon(arr , arr1);

//        int[] sorted = sortArray(arr);
//
//        System.out.println("Sorted Array :");
//
//        for (int i = 0; i < n; i++) {
//            System.out.println(sorted[i]);
//        }

//        int sum = sumArray(arr);
//        System.out.println("Sum of array is : " + sum);
//        
//        int avg = avgArray(sum , arr);
//        System.out.println("Average of an array is  : " + avg);
//        
//        int copy[] = copyArray(arr);
//        System.out.println("Copied array : ");
//        for (int i = 0; i < n; i++) {
//         System.out.print(copy[i]+" ");

  //      }
  //      minMaxValue(arr);
        
//        int reversed[] = reverseArray(arr);
//        System.out.println("Reversed array : ");
//        for (int i = 0; i < reversed.length; i++) {
//        	System.out.print(reversed[i]+" ");
//       
//        }
        
 //       findDuplicate(arr);
    	
    	ComplexNumber[] arr = new ComplexNumber[5];
        for (int i = 0; i < arr.length; i++) {

            arr[i] = new ComplexNumber();

            System.out.println("Enter number1 for object " + (i + 1) + ":");
            int n1 = ConsoleInput.getInt();

            System.out.println("Enter number2 for object " + (i + 1) + ":");
            int n2 = ConsoleInput.getInt();

            arr[i].setNum1(n1);
            arr[i].setNum2(n2);
        }

        System.out.println("\nResults:");

        for (int i = 0; i < arr.length; i++) {

            int result = arr[i].computeComplexNumber();

            System.out.println(
                "Object " + (i + 1) +" : " + arr[i].getNum1() +" * " + arr[i].getNum2() +" = " + result );
        }
    
        
}

    static int[] sortArray(int[] arr) {

        int temp = 0;

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr.length; j++) {

                if (arr[i] > arr[j]) {

                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                   
                }
            }
        }

        return arr;
    }
    
    static int sumArray(int[] arr) {
    	int sum =0 ;
    	for (int i = 0; i < arr.length; i++) {
            sum+= arr[i];
        }

    	return sum;
    }
    
    static  int avgArray(int sum , int[] arr) {
    	
    	int avg = 0;
    	avg = sum/arr.length;
    	return avg;
    	
    }
    
    static int[] copyArray(int []arr) {
    	int copy[] = new int[arr.length];
    	for (int i =0 ; i< arr.length; i++) {
    		copy[i] = arr[i];
    	}
    	
    	return copy;    
    	}
    
    
    static void minMaxValue(int arr[]) {
    	int max = arr[0];
    	int min = arr[0];
    	for(int i=0; i< arr.length; i++) {
    		if (arr[i] > max ) {
    			max = arr[i];
    		}
    		if(arr[i] < min ) {
    			min = arr[i];
    		}
    		
    	}
    	
    	System.out.println("MAximum value is : " +max + " Minimum value is "+min);
    }
    
    static int[] reverseArray(int[] arr) {
    	int reversedArray[] = new int[arr.length];
    	int j =0;
    	for(int i=arr.length-1 ; i>=0 ; i--) {
    		
    		reversedArray[j]= arr[i]; 
    		j++;
    	}
    	return reversedArray;
    }
    
    static void findDuplicate(int[] arr) {
    	System.out.print("Duplicate elements are : ");
    	for(int i =0 ; i< arr.length ; i++) {
    		for(int j=i+1 ; j< arr.length; j++) {
    			if (arr[i] == arr[j]) {
    				System.out.print(arr[j] + " ");
    			}
    		}
    	}
    }
    
    static void findCommon(int[] arr, int[] arr1) {
    	
    	System.out.print("Common elements are : ");
    	for (int i=0 ; i< arr.length; i++) {
    		for (int j = 0 ; j<arr1.length; j++) {
    			if(arr[i] == arr1[j]) {
    				System.out.print(arr1[j]+" ");
    			}
    		}
    	}
    }
}
