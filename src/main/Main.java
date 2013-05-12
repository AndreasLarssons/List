package main;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Object [] dataList = {10,5,6,8,"adaw"};//data som sätts in i noderna
		
		ListNode l1 = new ListNode(dataList[0]), l2 = new ListNode(dataList[1]), l3 = new ListNode(dataList[2]);
		l1.nextlink = l2;
		l2.nextlink = l3;
		l3.nextlink = null;
		l1.printData(l1);
		l1.insertAfter(50);
		l1.printData(l1);

		
		
			
		
		
	}
	
	
}
