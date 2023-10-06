
public class MyArray {
	private int[] array;

	public MyArray(int[] array) {
		this.array = array;
	}

	// To find the index of the target in the array. If the target
	// is not found in the array, then the method returns -1.
	// Input: int[] array = {12, 10, 9, 45, 2, 10, 10, 45}, 45
	// Output: 3
	public int iterativeLinearSearch(int target) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] == target) {
				return i;
			}
		}
		return -1;
	}

	// To find the index of the target in the array. If the target
	// is not found in the array, then the method returns -1.
	// Input: int[] array = {12, 10, 9, 45, 2, 10, 10, 45}, 15
	// Output: -1
	public int recursiveLinearSearch(int target) {
		return recursiveLinearSearchHelper(target, array.length - 1);
	}

	private int recursiveLinearSearchHelper(int target, int position) {
		if (position < 0)
			return -1;
		if (array[position] == target) {
			return position;
		}
		return recursiveLinearSearchHelper(target, position - 1);
	}

	// To find the index of the target in the sorted array. If the target is
	// not found in the array, then the method returns -1.
	public int iterativeBinarySearch(int target) {
		int low = 0, high = array.length - 1;
		while (low <= high) {
			int mid = (low + high) / 2;
			if (array[mid] == target)
				return mid;
			if (array[mid] > target) {
				high = mid - 1;
			} else {
				low = mid + 1;
			}
		}
		return -1;
	}

	// To find the index of the target in the sorted array. If the target is not
	// found in the array, then the method returns -1.
	public int recursiveBinarySearch(int target) {
		// TODO
		return recursiveBinarySearchHelper(target, 0, array.length-1);
	}

	private int recursiveBinarySearchHelper(int target, int low, int high) {
		
		if (low > high) {
			return -1;
		} else {
			int mid = (low + high) / 2;
			if (array[mid] == target) {
				return mid;
			}
			else if (array[mid] > target) {
				return recursiveBinarySearchHelper(target, low, mid-1);
			}else
				return recursiveBinarySearchHelper(target, mid+1, high);
			}
			
		}
	

	public static void main(String[] args) {
		MyArray t1 = new MyArray(new int[] { 2, 4, 6, 8 });
		System.out.println(t1.iterativeLinearSearch(6));
		System.out.println(t1.recursiveLinearSearch(6));
		System.out.println(t1.iterativeBinarySearch(8));
		System.out.println(t1.recursiveBinarySearch(8));
	}
}
