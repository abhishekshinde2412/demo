import java.util.ArrayList;
import java.util.Collections;
class Item{
	
		int itemid ;
		String itemname;
		
		Item(int itemid,String itemname ){
			this.itemid= itemid;
			this.itemname= itemname;
		}
		
		public String toString(){
			return itemid+" "+itemname;
		}
		/*@Override 
		public boolean equals(Object o){
			if (o instanceof Item){
				Item i=(Item)o;
				if (this.itemid.equals(i.itemid)&& 
				this.itemname.equals(i.itemname)){
				return true
				}
			}
			return false;
		}*/
		//@Override 
		//public int CompareTo (Ideme){
		//	return this.itemid.compareTo(e.itemid);
		//}
	
	
	public static void main (String[] args){
		
		ArrayList<Item> arr= new ArrayList<Item>();
		
		Item A1 = new Item(1,"item1");
		Item A2 = new Item(2,"item2");
		Item A3 = new Item(3,"item3");
		System.out.println("Adding the Items");
		arr.add(A1);
		arr.add(A2);
		arr.add(A3);
	
	    System.out.println(arr);
		System.out.println();
		
		System.out.println("Remove the one Item");
		
		arr.remove(0);
		System.out.println(arr);
		
		//Collections.sort(arr);
	   // System.out.println(arr);
		
	}
}

