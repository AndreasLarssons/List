package main;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Object [] dataList = {10,5,6,6,"adaw"};//data som sätts in i noderna
		List list = new List();
		list.createList(dataList);//skapa listan med noder
		
		ListNode[] listOfNodes = null;
		listOfNodes = list.getList();//Hämta listan av noder
		for (int i = 1; i < listOfNodes.length + 1 ; i++){
			System.out.println("Data " +listOfNodes[0].findData(i));//Hämta data med start från nod 1
		}
		listOfNodes[0].insertAfter(50);//Sätt in data efter nod 1 med värde 50
		System.out.println("Inserted 50 after first node");
		
		for (int i = 1; i < listOfNodes.length + 2 ; i++){
			System.out.println("Data " +listOfNodes[0].findData(i));
		}

	}

}
