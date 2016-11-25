/**
 * @author shadow
 * @Date 2016年8月18日下午9:00:28
 * @Fun
 **/
package finalize;

import java.util.BitSet;
import java.util.Hashtable;
import java.util.Scanner;
import java.util.Vector;

public class Frog extends Amphibian {
	Vector<Object> vector = new Vector<>();
	BitSet bitSet = null;
	Hashtable<Object,Frog> some;
	
	public Frog() {
		// TODO Auto-generated constructor stub
		System.out.println("Frog()");
	}
	
	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("Frog finalize");
		if(DoBaseFinalization.flag){
			try {
				super.finalize();
			} catch (Throwable e) {
				// TODO: handle exception]
				e.printStackTrace();
			}			
		}
	}
	
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		String arg = new Scanner(System.in).nextLine();
		if(arg.equals("finalize")){
			DoBaseFinalization.flag = true;
		}else{
			System.out.println("not finalizing bases");
		}
		
		new Frog();
		System.out.println("bye!");
		//Must do this to guarantee that all finalizers will be called.
		System.gc();
	}
}
