/**
 * @author shadow
 * @Date 2016年8月17日下午7:24:58
 * @Fun
 **/
package enclosure;

public class Cookie {
	static{
		System.out.println("Cookie");
	}
	
	public Cookie() {
		// TODO Auto-generated constructor stub
		System.out.println("Cookie constructor.");
	}
	
	protected void foo(){
		System.out.println("Foo");
	}
}
