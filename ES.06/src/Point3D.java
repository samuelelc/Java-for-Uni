package prg.es6;
import prg.es5.Point2D;

public class Point3D extends Point2D{
	private int z;

	//COSTRUTTORI:
	public Point3D(){}

	public Point3D(int x, int y, int z){
		this.setXYZ(x, y, z);
	}

	//METODI:
	public Point2D setZ(int z){
		this.z = z;
		return this;
	}

	public Point2D setXYZ(int x, int y, int z){
		this.setXY(x, y);
		this.setZ(z);
		return this;
	}

	public int getZ(){
		return this.z;
	}

	public String toString(){
		return "(" + this.getX() + ", " + this.getY() + ", " + this.getZ() + ")";
	}
}