
public class MergeSort {

	void merge(int[] arr,int start,int mid,int end){
		
		//find sizes of two subarrays to be merged
		int n1 = mid - start + 1;
		int n2 = end - mid;
		
		//create new Temp array
		int left[] = new int[n1];
		int right[] = new int[n2];
		
		/*Copy data to temp arrays*/
        for (int i=0; i<n1; ++i)
        	left[i] = arr[start + i];
        for (int j=0; j<n2; ++j)
        	right[j] = arr[mid + 1+ j];
        
        /* Merge the temp arrays */
        
        // Initial indexes of first and second subarrays
        int i = 0, j = 0;
     // Initial index of merged subarry array
        int k = start;
        
        while(i<n1 && j<n2){
        	if(left[i] <= right[j] ){
        		arr[k] = left[i];
        		i++;
        	}else{
        		arr[k] = right[j];
        		j++;
        	}
        	k++;
        }
        
        /* Copy remaining elements of left[] if any */
        while (i < n1)
        {
            arr[k] = left[i];
            i++;
            k++;
        }
 
        /* Copy remaining elements of right[] if any */
        while (j < n2)
        {
            arr[k] = right[j];
            j++;
            k++;
        }
		
	}
	
	void mergeSort(int[] arr,int start,int end){
		if(start < end){
			//Find middle index
			int middle = (start+end)/2;
			
			//sort the two halves
			mergeSort(arr,start,middle);
			mergeSort(arr,middle+1,end);
			
			//merge the sorted halves
			merge(arr,start,middle,end);
		}
		
	}
	
	/* A utility function to print array of size n */
    static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
	
	// Driver method
    public static void main(String args[])
    {
        int arr[] = {12, 11,9,15,3, 13, 5, 6, 7};
 
        System.out.println("Given Array");
        printArray(arr);
 
        MergeSort ob = new MergeSort();
        ob.mergeSort(arr, 0, arr.length-1);
 
        System.out.println("\nSorted array");
        printArray(arr);
    }
}
