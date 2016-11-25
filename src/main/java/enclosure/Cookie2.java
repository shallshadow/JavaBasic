/**
 * @author shadow
 * @Date 2016年8月18日下午8:35:33
 * @Fun
 **/
package enclosure;

public class Cookie2 extends Cookie {
	static {
		System.out.println("Cookie2");
	}
	
	public static void main(String[] args) {
		Cookie2 cookie2 = new Cookie2();
		cookie2 = new Cookie2();
		cookie2 = new Cookie2();
	}
}
