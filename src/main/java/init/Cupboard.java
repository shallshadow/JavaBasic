/**
 * @author shadow
 * @Date 2016年8月14日下午8:22:01
 * @Fun
 **/
package init;

public class Cupboard {
	Bowl b3 = new Bowl(3);
	static Bowl b4 = new Bowl(4);

	public Cupboard() {
		// TODO Auto-generated constructor stub
		System.out.println("Cupboard()");
		b4.f(2);
	}

	void f3(int market) {
		System.out.println("Cupboard.f3(" + market + ")");
	}
	
	static Bowl b5 = new Bowl(5);
}
