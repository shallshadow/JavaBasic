package innerclass;
/**
 * @author shadow
 * @Date 2016年8月10日下午7:29:51
 * @Fun  继承一个outer class，不会发生在inner class身上。
 * 		 当明确BigEgg中的Yolk类继承自Egg中的Yolk时，会覆写其函数。
 **/
public class BigEgg extends Egg {
	public class Yolk extends Egg.Yolk{
		public Yolk() {
			// TODO Auto-generated constructor stub
			System.out.println("BigEgg.Yolk");
		}
		
		public void Test(){
			System.err.println("BigEgg.Yolk.Test()");
		}
	}
	
	public BigEgg() {
		// TODO Auto-generated constructor stub
		System.out.println("New BigEgg.");
		yolk = new Yolk();
		yolk.Test();
	}
	
	public static void main(String[] args) {
		new BigEgg();
	}
}

class Egg{
	protected class Yolk{
		public Yolk(){
			System.out.println("Egg.Yolk()");
		}
		
		public void Test(){
			System.err.println("Egg.Yolk.Test()");
		}
	}
	

	
	protected Yolk yolk;
	public Egg(){
		System.out.println("New Egg");
		yolk = new Yolk();
	}
}