/**
 * @author shadow
 * @Date 2016年8月14日下午7:54:52
 * @Fun
 **/
package finalize;

import java.util.Scanner;

public class Garbage {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		while (!Chair.f) {
			new Chair();
			new String("To take up space");
		}
		
		System.out.println("After all Chairs have been created:\n"
				+ "total created = " + Chair.created + ",total finalized = " + Chair.finalized);
		
		String command = new Scanner(System.in).nextLine();
		if(command.equals("gc")){
			System.out.println("System.gc()");
			System.gc();
		}else if(command.equals("finalize")){
			System.out.println("runFinalization()");
			System.runFinalization();
		}
	}
}
