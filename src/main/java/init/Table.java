/**
 * @author shadow
 * @Date 2016年8月14日下午8:18:37
 * @Fun
 **/
package init;

public class Table {
	static Bowl b1 = new Bowl(1);

	public Table() {
		// TODO Auto-generated constructor stub
		System.out.println("Table()");
		b1.f(1);
	}

	void f2(int market) {
		System.out.println("Table.f2(" + market + ")");
	}
	
	static Bowl b2 = new Bowl(2);
}
