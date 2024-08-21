package java_collections_and_DSA;
import java.util.*;
class Node{
	int data;
	Node next;
	Node head;
	Node(int data){
		this.data=data;
	}
}

public class linked_list_Creation {
	static Node head=null;
	static Node last=null;
	public static void create(int val) {
		if(head==null) {
			Node n=new Node(val);
			head=n;
			last=n;
		}
		else {
			Node n=new Node(val);
			last.next=n;
			last=n;
		}
		 
	}

	public static void main(String[] args) {
		 Scanner obj=new Scanner(System.in);
		 int n=obj.nextInt();
		 while(n!=0) {
			 create(obj.nextInt());
			 n--;
		 }
		 Node temp=head;
		 while(temp!=null) {
			 System.out.print(temp.data+"-->");
			 temp=temp.next;
		 }
		 System.out.print("null");
	}

}
