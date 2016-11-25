/**
 * @author shadow
 * @Date 2016年8月18日下午8:44:58
 * @Fun
 **/
package finalize;

public class LivingCreature {
	Characteristic characteristic = new Characteristic(" is alive");
	public LivingCreature() {
		// TODO Auto-generated constructor stub
		System.out.println("LivingCreature()");
	}
	
	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("LivingCreature finalize");
		
		if(DoBaseFinalization.flag){
			try{
				super.finalize();
			}catch(Throwable t){
				t.printStackTrace();
			}
		}
		
	}
}
