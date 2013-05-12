package main;

public class ListNode {

	public ListNode nextlink;
	public Object data;
	
	
	public ListNode(Object data){
		this.data = data;
	}
	
	public void insertAfter (Object item){
		ListNode temp = nextlink;//Temp värde för länk n
		nextlink = new ListNode(item);//Skapa en ny nod
		//nextlink.data = item;//Sätt in datan i den nya noden
		nextlink.nextlink = temp;//Länk n + 1 ska vara lika med datan från n
		
	}
	
	public Object findData(int position){/*Måste returnera ett object för att kunna vara rekursiv. 
											Då den måste kunna returnera både en int och nästa noden */
		if (position == 1){
			return this.data;
		} else if (position < 1 || nextlink == null){ /*On nästa position är null så har vi nått slutet.
		 											Om position < 1 så finns inga noder med den positionen */
		 											
			return null;
		} else {
			return nextlink.findData(position - 1);//Rekursiv som fortsätter att kalla sig själv sålänge det finns data i listan
		}
		
	}
	
	public void printData(ListNode firstNode){
		ListNode temp = firstNode;
		while (temp != null){
			System.out.println(temp.data);
			temp = temp.nextlink;
		}
	}
	
	

}
