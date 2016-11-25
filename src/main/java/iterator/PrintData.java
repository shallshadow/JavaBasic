/**
 * @author shadow
 * @Date 2016年8月19日下午9:25:20
 * @Fun
 **/
package iterator;

import java.util.Enumeration;

public class PrintData {
	static void print(Enumeration<Object> E){
		while (E.hasMoreElements()) {
			Object object = (Object) E.nextElement();
			System.out.println(object.toString());
		}
	}
}
