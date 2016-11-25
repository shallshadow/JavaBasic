/**
 * @author shadow
 * @Date 2016年8月18日下午8:43:01
 * @Fun
 **/
package finalize;

public class Characteristic {
	String string;
	public Characteristic(String string) {
		// TODO Auto-generated constructor stub
		this.string = string;
		System.out.println("Creating Characteristic " + string);
	}
	
	@Override
	protected void finalize() {
		System.out.println("finalizing Characteristic " + string);
	}
}
