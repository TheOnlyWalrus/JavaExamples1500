package bintree;

public class Test
{
	public static void main(String[] args)
	{
		Node node1 = new Node(2, null, null);
		Node node2 = new Node(3, null, null);
		Node node3 = new Node(4, node1, node2);
		
		Tree tree = new Tree(node3);
		tree.traverse();
	}
}
