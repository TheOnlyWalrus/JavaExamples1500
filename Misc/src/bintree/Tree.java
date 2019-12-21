package bintree;

public class Tree
{
	Node[] nodes;
	
	public Tree(Node ...nodes)
	{
		this.nodes = nodes;
	}
	
	public void traverse()
	{
		for (Node node : this.nodes)
		{
			node.traverse();
		}
	}
}
