package java_collections_and_DSA;
import java.util.*;
class node{
	int data;
	node next;
	node(int data){
		this.data=data;
	}
}
public class Middle_of_Linked_List {
	static node head=null;
	static node last=null;
	public static void create(int val) {
		node n=new node(val);
		if(head==null) {
			head=n;
			last=head;
		}
		else {
			last.next=n;
			last=last.next;
		}
	}

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		int n=obj.nextInt();
		while(n!=0) {
			create(obj.nextInt());
			n--;
		}
		node temp=head;
		while(temp!=null) {
			System.out.print(temp.data+"-->");
			temp=temp.next;
		}
		System.out.println("null");
		node r=head,t=head;
		while(r!=null && r.next!=null) {
			r=r.next.next;
			t=t.next;
		}
		System.out.println(t.data);
	}

}
