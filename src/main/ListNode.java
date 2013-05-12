package main;

public class ListNode {

	public ListNode nextlink;
	public Object data;
	
	
	public ListNode(Object data){
		this.data = data;
	}
	
	public void insertAfter (Object item){
		ListNode temp = nextlink;//Temp v�rde f�r l�nk n
		nextlink = new ListNode(item);//Skapa en ny nod
		//nextlink.data = item;//S�tt in datan i den nya noden
		nextlink.nextlink = temp;//L�nk n + 1 ska vara lika med datan fr�n n
		
	}
	
	public Object findData(int position){/*M�ste returnera ett object f�r att kunna vara rekursiv. 
											D� den m�ste kunna returnera b�de en int och n�sta noden */
		if (position == 1){
			return this.data;
		} else if (position < 1 || nextlink == null){ /*On n�sta position �r null s� har vi n�tt slutet.
		 											Om position < 1 s� finns inga noder med den positionen */
		 											
			return null;
		} else {
			return nextlink.findData(position - 1);//Rekursiv som forts�tter att kalla sig sj�lv s�l�nge det finns data i listan
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
