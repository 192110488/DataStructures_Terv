import java.util.*;
class TreeNode{
	TreeNode root;
	TreeNode left;
	TreeNode right;
	int data;
	TreeNode(int data){
		this.data=data;
	}
}

public class tree_mirror_image {
	public static void main(String[] args) {
		TreeNode root=new TreeNode(10);
		root.left=new TreeNode (20);
		root.right=new TreeNode(30);
		root.left.left=new TreeNode(40);
		root.left.right=new TreeNode(50);
		root.right.left=new TreeNode(60);
		root.right.right=new TreeNode(70);
		root.right.left.right=new TreeNode(80);
		List<Integer> a=new ArrayList<>();
		mirror(root);
		inOrder(root,a);
		System.out.println(a);
		
		
		TreeNode root1=new TreeNode(10);
		root1.left=new TreeNode (30);
		root1.right=new TreeNode(20);
		root1.left.left=new TreeNode(70);
		root1.left.right=new TreeNode(60);
		root1.right.left=new TreeNode(50);
		root1.right.right=new TreeNode(40);
		root1.left.right.left=new TreeNode(80);
		List<Integer> b=new ArrayList<>();
		inOrder(root1,b);
		System.out.println(b);
		
		if(a.equals(b))
		{
			System.out.println("true");
		}
		else
		{
			System.out.println("false");
		}
		
	
	}
	public static TreeNode inOrder(TreeNode root, List<Integer> a)
	{
		if(root==null)
		{
			return null;
		}
		inOrder(root.left,a);
		a.add(root.data);
		inOrder(root.right,a);
		return root;
	}
	
	public static TreeNode mirror(TreeNode root) {
		if(root==null) return null;
		mirror(root.left);
		mirror(root.right);
		TreeNode t=root.left;
		root.left=root.right;
		root.right=t;
		return root;
		
	}

}
