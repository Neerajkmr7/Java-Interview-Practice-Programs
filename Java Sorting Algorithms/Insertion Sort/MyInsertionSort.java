
public class MyInsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[] arr1 = {10,34,2,56,7,67,88,42};
	        int[] arr2 = doInsertionSort(arr1);
	        for(int i:arr2){
	            System.out.print(i);
	            System.out.print(", ");
	        }
	}

	private static int[] doInsertionSort(int[] arr1) {
		// TODO Auto-generated method stub
		int temp = 0;
		for(int i=1;i<arr1.length; i++){
			for(int j=i;j>0;j--){
				if(arr1[j]<arr1[j-1]){
					temp = arr1[j];
					arr1[j] = arr1[j-1];
					arr1[j-1] = temp;
				}
			}
		}
		return arr1;
	}

}
