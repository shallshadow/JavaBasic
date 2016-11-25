/**
 * @author shadow
 * @Date 2016年8月17日下午7:26:20
 * @Fun
 **/
package enclosure2;

import enclosure.Cookie;

public class Dinner extends Cookie {
	public Dinner() {
		// TODO Auto-generated constructor stub
		System.out.println("Dinner constructor.");
	}
	
	
	
	public static void main(String[] args) {		
		Dinner dinner = new Dinner();
		dinner.foo();
		
	}
}
