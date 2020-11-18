
public class RightTriangle {
	public double a;
	public double b;
	private static int id = 0;
	private int myId;
	private String name;
	RightTriangle(){
		a = 1;
		b = 1;
		myId = id++;
	}
	RightTriangle(int a, int b){
		this.a = a;
		this.b = b;
		myId = id++;
	}
	public int getId() {
		return myId;
	}
	public void setName(String name) {
		this.name = name+" triangle";
	}
	public String getName(){
		return name;
	}
	public double calcHyp() {
		return Math.sqrt(Math.pow(a, 2)+Math.pow(b, 2));
	}
	public double calcArea() {
		return a*b/2;
	}
}
