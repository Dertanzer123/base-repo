package base;

public class LinkedList {

	private Node Head;
	
	public LinkedList() 
	{
		Head=null;
	}
	public void add(Object data)
	{
		if(Head==null)
		{
			Head=new Node(data);
			
		}
		else 
		{
			Node temp= Head;
			while(temp.getLink()!=null)
			{
				temp=temp.getLink();
			}
			Node lastnode=new Node(data);
			temp.setLink(lastnode);
		}
		
		
	}
	
	
	public void Display()
	{
		Node temp=Head;
		
		while(temp!=null) //if not work change with checking link
		{
			System.out.print((int)temp.getData()+">>(-___-)<<");
			temp=temp.getLink();
		}
		
		
	}
	public int Size() 
	{
		Node temp=Head;
		int size=0;
		while(temp!=null) 
		{
			temp=temp.getLink();
			size++;
		}
		return size;
		
	}
	public float findVariance()
	{
		if(Size()==0)
		{
			return 0;
		}
		float mean=0;
		Node temp=Head;
		float float1=0;
		while(temp!=null) 
		{
			mean+=(int)temp.getData();
			temp=temp.getLink();
		}
		mean=(float)mean/Size();
		 temp=Head;
		while(temp!=null) 
		{
			float1+=(Math.pow(( mean-(int)temp.getData()),2));
			temp=temp.getLink();
		}
		return float1/Size();
		
	}
}
