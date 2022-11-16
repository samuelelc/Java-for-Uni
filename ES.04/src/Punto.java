package prg.es5;
import java.lang.Math;

public class Punto{
	public String name;
	public double x;
	public double y;

	public Punto(){

	}

	public Punto(String s){
		name = s;
	}

	public Punto(double a, double b){
		x = a;
		y = b;
	}

	public Punto(String s, double a, double b){
		name = s;
		x = a;
		y = b;
	}

	public void moveTo(double a, double b){
		x = a;
		y = b;
	}

	public String toString(){
		return "( "+x+" , "+ y + " )";
	}

	public boolean equals(Punto p){
		/*if(x == p.x && y == p.y)*/if(Math.abs(this.distance(p))<1E-5){	//con double non si fanno confronti ==
			return true;
		} else {
			return false;
		}
	}

	public double distance(Punto p){
		return Math.sqrt(Math.pow(x-p.x, 2) + Math.pow(y-p.y, 2));
	}
}