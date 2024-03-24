package base;

import base.Vector;
import base.Vertex;


public class Triangle {

	public Vertex v1;
	public Vertex v2;
	public Vertex v3;
	
	private Vector3 normal;
	
	public Triangle(Vertex v1,Vertex v2,Vertex v3) 
	{
		this.v1=v1;
		this.v2=v2;
		this.v3=v3;
		
		
	}
	public void recalculatenormal() 
	{
		normal=Vector.CrossP(Vector.Vsum(v2.position,v1.position.reverse()),Vector.Vsum(v3.position,v1.position.reverse())).normalized();
		
	}
}
