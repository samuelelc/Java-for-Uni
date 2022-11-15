package prg.es6;

public class Plane{
	private Point3D p1;
	private Point3D p2;
	private Point3D p3;

	//COSTRUTTORI:
	public Plane(){}

	public Plane(Point3D p1, Point3D p2, Point3D p3){
		this.setAllPoints(p1, p2, p3);
	}

	public Plane(int x1, int y1, int z1, int x2, int y2, int z2, int x3, int y3, int z3){
		this.setPositionAllPoints(x1, y1, z1, x2, y2, z2, x3, y3, z3);
	}

	//METODI:
	public Plane setP1(Point3D p1){
		this.p1.setXYZ(p1.getX(), p1.getY(), p1.getZ());
		return this;
	}

	public Plane setP2(Point3D p2){
		this.p2.setXYZ(p2.getX(), p2.getY(), p2.getZ());
		return this;
	}

	public Plane setP3(Point3D p3){
		this.p3.setXYZ(p3.getX(), p3.getY(), p3.getZ());
		return this;
	}

	public Plane setAllPoints(Point3D p1, Point3D p2, Point3D p3){
		return this.setP1(p1).setP2(p2).setP3(p3);
	}

	public Plane setPositionP1(int x, int y, int z){
		this.p1.setXYZ(x, y, z);
		return this;
	}

	public Plane setPositionP2(int x, int y, int z){
		this.p2.setXYZ(x, y, z);
		return this;
	}

	public Plane setPositionP3(int x, int y, int z){
		this.p3.setXYZ(x, y, z);
		return this;
	}

	public Plane setPositionAllPoints(int x1, int y1, int z1, int x2, int y2, int z2, int x3, int y3, int z3){
		return this.setPositionP1(x1, y1, z1).setPositionP2(x2, y2, z2).setPositionP3(x3, y3, z3);
	}

	public Point3D getP1(){
		return this.p1;
	}

	public Point3D getP2(){
		return this.p2;
	}

	public Point3D getP3(){
		return this.p3;
	}	

	public int getXP1(){
		return this.p1.getX();
	}

	public int getYP1(){
		return this.p1.getY();
	}

	public int getZP1(){
		return this.p1.getZ();
	}

	public int getXP2(){
		return this.p2.getX();
	}

	public int getYP2(){
		return this.p2.getY();
	}

	public int getZP2(){
		return this.p2.getZ();
	}

	public int getXP3(){
		return this.p3.getX();
	}

	public int getYP3(){
		return this.p3.getY();
	}

	public int getZP3(){
		return this.p3.getZ();
	}	

	public String toString(){
		return "Plane: " + p1.toString() + " " + p2.toString()+ " " + p3.toString();
	}

	public Plane toPrint(){
		System.out.println(this.toString());
		return this;
	}
}