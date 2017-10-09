import java.util.Arrays;

public class MyArrayList {
	
	private Object[] myList;
	private int actSize = 0;
	
	public MyArrayList(){
		myList = new Object[10];
	}
	
	public void add(Object obj){
		if(actSize >= 5){
			increaseArraySize();
		}
		myList[actSize] = obj;
		actSize++;
	}
	
	public Object remove(int index){
		if(index<actSize){
			Object obj = myList[index];
			myList[index] =null;
			while(index<actSize){
				myList[index] = myList[index+1];
				myList[index+1] = null;
				index++;
			}
			actSize--;
			return obj;
		}else{
			throw new ArrayIndexOutOfBoundsException();
		}
	}
	
	public Object get(int index){
		if(index <actSize){
			return myList[index];
		}else{
			
			throw new ArrayIndexOutOfBoundsException();
		}
		
	}
	
	public int size(){
		return actSize;
	}

	private void increaseArraySize() {
		// TODO Auto-generated method stub
		myList = Arrays.copyOf(myList, myList.length*2);
		System.out.println("arrayLenght increase to :"+myList.length*2);
	}
	
	public static void main(String a[]){
        MyArrayList mal = new MyArrayList();
        mal.add(new Integer(2));
        mal.add(new Integer(5));
        mal.add(new Integer(1));
        mal.add(new Integer(23));
        mal.add(new Integer(14));
        for(int i=0;i<mal.size();i++){
            System.out.print(mal.get(i)+" ");
        }
        mal.add(new Integer(29));
        System.out.println("Element at Index 5:"+mal.get(5));
        System.out.println("List size: "+mal.size());
        System.out.println("Removing element at index 2: "+mal.remove(2));
        for(int i=0;i<mal.size();i++){
            System.out.print(mal.get(i)+" ");
        }
    }

}
