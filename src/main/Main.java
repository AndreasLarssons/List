package main;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Object [] dataList = {10,5,6,6,"adaw"};//data som s�tts in i noderna
		List list = new List();
		list.createList(dataList);//skapa listan med noder
		
		ListNode[] listOfNodes = null;
		listOfNodes = list.getList();//H�mta listan av noder
		for (int i = 1; i < listOfNodes.length + 1 ; i++){
			System.out.println("Data " +listOfNodes[0].findData(i));//H�mta data med start fr�n nod 1
		}
		listOfNodes[0].insertAfter(50);//S�tt in data efter nod 1 med v�rde 50
		System.out.println("Inserted 50 after first node");
		
		for (int i = 1; i < listOfNodes.length + 2 ; i++){
			System.out.println("Data " +listOfNodes[0].findData(i));
		}

	}

}
