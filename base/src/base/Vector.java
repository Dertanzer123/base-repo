package base;

abstract public class Vector {

	public static Vector3 Vsum(Vector3 V1,Vector3 V2)
	{
		return new Vector3(V1.x+V2.x,V1.y+V2.y,V1.z+V2.z);
	}
	public static Vector3 CrossP(Vector3 V1,Vector3 V2) 
	{
		
		return	new Vector3(V1.y*V2.z-V1.y*V2.z,V1.z*V2.x-V1.z*V2.x,V1.x*V2.y-V1.x*V2.y);
	}
	public static double DotP(Vector3 V1,Vector3 V2) 
	{
		
		return V1.x*V2.x+V1.y*V2.y+V1.z*V2.z;
	} 
}
class Vector3
{
public double x;
public double y;
public double z;
 
public Vector3(double x,double y,double z) {
	
	this.x=x;
	this.y=y;
	this.z=z;
	
}


public double lenght() 
{
return Math.sqrt(x*x+y*y+z*z);	
}
public Vector3 reverse() 
{
	return new Vector3(-x,-y,-z);
}
public Vector3 normalized() 
{
	return new Vector3(x/lenght(),y/lenght(),z/lenght());
}
}