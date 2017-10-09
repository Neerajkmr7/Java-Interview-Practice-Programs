public class MyBubbleSort {

	public void bubbleSort(int[] array) {
		// TODO Auto-generated method stub
		int n = array.length;
		//for(int i=n; i>0;i--){
		for(int i=0; i<n;i++){
			for(int x=0;x<n-1;x++){
				if(array[x] > array[x+1]){
					swapNumbers(x,x+1,array);
				}
			}
			printNumbers(array);
		}
	}

	private void printNumbers(int[] array) {
		// TODO Auto-generated method stub
		for(int k=0;k<array.length;k++){
			System.out.print(array[k]+",");
		}
		System.out.println("\n");
	}

	private void swapNumbers(int i, int j, int[] array) {
		// TODO Auto-generated method stub
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp; 

	}


	public static void main(String args[]){
		int[] array={4, 2, 9, 6, 23, 12, 34, 0, 1};
		MyBubbleSort mbs = new MyBubbleSort();
		System.out.println("Bubble Sort:");
		mbs.bubbleSort(array);
	}


}
