/**
 * @author shadow
 * @Date 2016年8月18日下午8:49:34
 * @Fun
 **/
package finalize;

public class Animal extends LivingCreature {
	Characteristic characteristic = new Characteristic(" has heart");
	
	public Animal() {
		// TODO Auto-generated constructor stub
		System.out.println("Animal()");
	}
	
	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("Animal finalize.");
		super.finalize();
	}
}
