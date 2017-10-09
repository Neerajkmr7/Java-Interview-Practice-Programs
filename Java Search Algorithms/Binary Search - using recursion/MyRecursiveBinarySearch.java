import java.util.Collections;

public class MyRecursiveBinarySearch {
	
	
	private static int recursiveBinarySearch(int[] arr1, int start, int end, int key) {
		// TODO Auto-generated method stub
		if(start < end){
			int midIndex = (start +end)/2;
			if(key == arr1[midIndex]){
				return midIndex;
			}
			if(key > arr1[midIndex]){
				return recursiveBinarySearch(arr1,midIndex+1,end,key);
			}else /*if(key < arr1[midIndex])*/{
				return recursiveBinarySearch(arr1,start,midIndex,key);
			}
			/*else{
				return midIndex;
			}*/
		}
		return -(start+1);
	}
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = {2,45,234,567,876,900,976,999};
        int index = recursiveBinarySearch(arr1,0,arr1.length,500);
        System.out.println("Found 45 at "+index+" index");
        index = recursiveBinarySearch(arr1,0,arr1.length,999);
        System.out.println("Found 999 at "+index+" index");
        index = recursiveBinarySearch(arr1,0,arr1.length,876);
        System.out.println("Found 876 at "+index+" index");
	}

}
