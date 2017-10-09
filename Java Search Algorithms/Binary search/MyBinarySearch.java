
public class MyBinarySearch {

	private int binarySearch(int[] arr, int key) {
		// TODO Auto-generated method stub
		int start = 0;
		int end = arr.length-1;
		while(start < end){
			int mid = (start+end)/2;
			if(key == arr[mid]){
				return mid;
			}
			if(key<arr[mid]){
				//start = 0;
				end = mid-1;
			}else{
				start = mid+1;
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyBinarySearch mbs = new MyBinarySearch();
        int[] arr = {2, 4, 6, 8, 10, 12, 14, 16};
        System.out.println("Key 14's position: "+mbs.binarySearch(arr, 14));
        int[] arr1 = {6,34,78,123,432,900};
        System.out.println("Key 432's position: "+mbs.binarySearch(arr1, 432));
	}

}
