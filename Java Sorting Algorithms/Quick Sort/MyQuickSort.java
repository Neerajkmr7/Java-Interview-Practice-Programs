
public class MyQuickSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyQuickSort sorter = new MyQuickSort();
        int[] input = {24,2,45,20,56,75,2,56,99,53,12};
        int length = input.length;
        sorter.quickSort(0, length - 1,input);
        //sorter.sort(input);
        for(int i:input){
            System.out.print(i);
            System.out.print(" ");
        }
	}

	private void quickSort(int lowerIndex, int higherIndex, int[] input) {
		// TODO Auto-generated method stub
		int i = lowerIndex;
		int j = higherIndex;
		int pivot = input[(lowerIndex+higherIndex)/2];
		int temp=0;
		
		while(i < j){
			while(input[i] <pivot){
				i++;
			}
			while(input[j] > pivot){
				j--;
			}
			if(i<=j){
				temp = input[i];
				input[i] = input[j];
				input[j] = temp;
				i++;
				j--;
			}
		}
		//Call Quick sort recursively
		
		if(lowerIndex < j){
			quickSort(lowerIndex,j, input);
		}
		if(i < higherIndex){
			quickSort(i,higherIndex, input);
		}
	}

}
