package InternPack;

import java.util.ArrayList;
import java.util.ListIterator;

public class ModifyingListUsingArrayList {

	public static void main(String[] args) {
		ArrayList<String> arrayList = new ArrayList<String>();
		arrayList.add("Java");
		arrayList.add("C#");
		arrayList.add("Javascript");
		arrayList.add("Python");
		arrayList.add("10");
		arrayList.add("Golang");
		System.out.println(arrayList);
		
		ListIterator<String> listIterator = arrayList.listIterator();
		int count = 0;
		while(listIterator.hasNext()) {
			Object obj = listIterator.next();
			count++;
			if(count == 2) {
				listIterator.add("Scala");
			}
			else if(obj.equals("Javascript")){
				listIterator.set("PHP");
			}
			else if(obj.equals("10")) {
				listIterator.remove();
			}
			
		}
		System.out.println("modified list is :"+arrayList);
		

	}

}
