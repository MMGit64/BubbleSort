public class BubbleSort {
	
	public static void BubbleSort(double [] list) {
		
		boolean needNextPass = true;
		
		for (int k = 1; k < list.length && needNextPass; k++) {	
			
			needNextPass = false;					//This in case the array is already sorted, the next pass would no longer be needed
		
			for(int i = 0; i < list.length - k; i++) {
				
				if(list[i] > list[i + 1]) {				//If the number immediately preceding the next is larger than that next number
					
					double temp = list[i];				//Swap list[i] with list[i +1]
					list[i] = list[i + 1];
					list[i + 1] = temp;
					
					needNextPass = true;				//Need Next Pass
				}
			}
		}
	}

	public static void main(String[] args) {
		
		double[] numList = {45, 4.3, 23, 12, 13.5};
		
		System.out.println("Before Bubble Sorting:");
		
		for(double i : numList) {
			System.out.println(i + " ");
		}
		
		System.out.println("After Bubble Sorting");
		
		BubbleSort(numList);
		
		for(double i : numList) {
			System.out.println(i + " ");
		}
	
	}

}
