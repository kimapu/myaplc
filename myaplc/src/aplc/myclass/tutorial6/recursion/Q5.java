package aplc.myclass.tutorial6.recursion;

public class Q5 {

	/**
	 * to find a maximum number from the given arr
	 */
	public static int maximum(int size, int[] arr) {
	    if (size == 1)
	        return arr[0];
	    return Math.max(arr[size - 1], maximum(size - 1, arr));
	}

	public static void main(String[] args) {

		int[] numArr = new int[]{2, 3, 1, 48, 6, 3, 8, 9};
		System.out.println(maximum(numArr.length, numArr));
		
	}
	
	
}
