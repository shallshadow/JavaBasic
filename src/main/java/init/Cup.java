/**
 * @author shadow
 * @Date 2016年8月14日下午8:54:36
 * @Fun
 **/
package init;

public class Cup {
	public Cup(int market) {
		// TODO Auto-generated constructor stub
		System.out.println("Cup(" + market + ")");
	}

	void f(int market) {
		System.out.println("f(" + market + ")");
	}
}

class Cups{
	static Cup cup1;
	static Cup cup2;
	
	static{
		cup1 = new Cup(1);
		cup2 = new Cup(2);
		System.out.println("static Cup init.");
	}
	
	public Cups() {
		// TODO Auto-generated constructor stub
		System.out.println("Cups()");
	}
}
