package base;

import java.util.List;
import base.Vector;

public class mesh {

	private List<Triangle> triangles;
	
	public Vector3 origin;
	
	mesh(Vector3 origin)
	{
		this.origin=origin;
	}
	
	public void AddTriangle(Triangle input) 
	{
		triangles.add(input);
		
	}
	public void AddMesh(mesh input) 
	{
		for(int i=0;i<input.size();i++) {
		triangles.add(input.GetTriangle(i));
		}
	}
	public Triangle GetTriangle(int index) 
	{
		return triangles.get(index);
	}
	public int size() 
	{
		return triangles.size();
	}
}
