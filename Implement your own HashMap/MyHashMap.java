import java.util.ArrayList;
import java.util.List;

public class MyHashMap {
	
	class Container{
		Object key;
		Object value;
		public void insert(Object key,Object value){
			this.key = key;
			this.value = value;
		}
	}
	private Container container;
	private List<Container> recordLsit;
	
	public MyHashMap(){
		this.recordLsit = new ArrayList<Container>();
	}
	
	public void put(Object k, Object v){
		this.container = new Container();
		container.insert(k, v);
		/*for(int i=0; i<recordLsit.size();i++){
			Container c1=recordList.get(i);
		}*/
		for(Container c1 : recordLsit ){
			if(c1.key.equals(k)){
				recordLsit.remove(c1);
				break;
			}
		}
		recordLsit.add(container);
	}
	
	public Object get(Object k){
		for(Container c1 : recordLsit ){
			if(c1.key.equals(k)){
				return c1.value;
			}
		}
		return null;
	}
	
	public static void main(String args[]){
		MyHashMap hm = new MyHashMap();
		hm.put("1", "1");
        hm.put("2", "2");
        hm.put("3", "3");
        System.out.println(hm.get("3"));
        hm.put("3", "4");
         
        System.out.println(hm.get("1"));
        System.out.println(hm.get("3"));
        System.out.println(hm.get("8"));
	}

}
