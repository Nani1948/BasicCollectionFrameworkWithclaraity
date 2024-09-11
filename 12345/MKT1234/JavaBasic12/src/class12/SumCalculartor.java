package class12;

public class SumCalculartor {
	private int x;
	private int y;
    private String firstName="John";
    private String lastName="David";
    void display() {
    	System.out.println(x+y);
    }
   
    public void setModel(int x, int y) {
		this.x=x;
		this.y=y;
	}
public int getModel() {
	return this.x;
}
}