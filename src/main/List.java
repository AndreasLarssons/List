package main;

public class List {

	public List(){
		
	}
	private ListNode[] listOfNodes;
	public void createList(Object[] data){
		listOfNodes = new ListNode[data.length];
		
		for (int i = 0; i < data.length; i++){
			listOfNodes[i] = new ListNode();//Skapa nya noder till varje data
			listOfNodes[i].data = data[i]; // l�gg in data i varje nod
		}
		
		for (int x = 0; x < listOfNodes.length; x++){ 
			
			System.out.println("Inserted " + listOfNodes[x].data);
			if (x >= listOfNodes.length - 1){
				listOfNodes[x].nextlink = null; //Om nod x �r den sista noden ska n�sta nod vara null
				
			} else {
				
				listOfNodes[x].nextlink = listOfNodes[x + 1]; //L�gg in noder i listan
				
			}
			
		}	
	}
	
	public ListNode[] getList(){
		return listOfNodes; // H�mta listan av noder
	}
	
}
