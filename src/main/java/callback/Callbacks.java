/**
 * @author shadow
 * @Date 2016年8月10日下午7:52:31
 * @Fun
 **/
package callback;

public class Callbacks {
	public static void main(String[] args) {
		Callee1 callee1 = new Callee1();
		Callee2 callee2 = new Callee2();
		MyIncrement.f(callee2);
		Caller caller1 = new Caller(callee1);
		Caller caller2 = new Caller(callee2.getCallbackReference());
		caller1.go();
		caller1.go();
		caller2.go();
		caller2.go();
	}

}

class Callee1 implements Incrementable{	
	
	private int i = 0;	
	
	@Override
	public void increment() {
		// TODO Auto-generated method stub
		i++;
		System.out.println("Callee1 : " + i);
	}
}

class MyIncrement{
	public void increment(){
		System.out.println("Other operation");
	}
	
	public static void f(MyIncrement mi){
		mi.increment();
	}
}

/**
 *  If you class must implement increment() in some other way,you must use an inner class:
 * @author shadow
 *
 */
class Callee2 extends MyIncrement{
	private int i = 0;
	private void incr(){
		i++;
		System.out.println("incr : " + i);
	}
	
	private class Closure implements Incrementable{

		@Override
		public void increment() {
			// TODO Auto-generated method stub
			incr();
		}
		
	}
	
	Incrementable getCallbackReference(){
		return new Closure();
	}
}

class Caller{
	private Incrementable callbackReference;
	
	public Caller(Incrementable incrementable) {
		// TODO Auto-generated constructor stub
		this.callbackReference = incrementable;
	}
	
	void go(){
		callbackReference.increment();
	}
}
