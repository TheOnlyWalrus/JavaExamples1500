package bintree;

public class Node
{
	int value;
	Node[] parents = new Node[2];
	
	public Node(int value, Node parent1, Node parent2)
	{
		this.value = value;
		this.parents[0] = parent1;
		this.parents[1] = parent2;
	}
	
	public int getValue()
	{
		return this.value;
	}
	
	public int traverse()
	{
		System.out.println(this.getValue());
		
		if (this.parents[0] != null)
		{
			System.out.println(this.parents[0].traverse());
		}
		if (this.parents[1] != null)
		{
			System.out.println(this.parents[1].traverse());
		}
		
		return -1;
	}
	
	public int traverse(int depth)
	{
		String spaces = "";
		
		for (int i = 0; i < depth;)
		{
			spaces += " ";
		}
		
		System.out.println(spaces + this.getValue());
		
		if (this.parents[0] != null)
		{
			System.out.println(spaces + this.parents[0].traverse(depth - 1));
		}
		if (this.parents[1] != null)
		{
			System.out.println(spaces + this.parents[1].traverse(depth - 1));
		}
		
		return -1;
	}
}
