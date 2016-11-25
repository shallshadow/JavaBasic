
package trap;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

/**
 *
 * @author shadow
 * @Date 2016年8月31日下午10:02:26
 * @version 1.0
 * @since
 **/
public class CollectionTrag {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("one");
		list.add("two");
		list.add("three");
		list.add("four");
		Iterator<String> iterator = list.iterator();
		while (iterator.hasNext()) {
			String string = (String) iterator.next();
			if (string.equals("two")) {
				iterator.remove();
			} else {
				//System.out.println(string);
			}
		}

		Vector v = new Vector();
		v.add("one");
		v.add("two");
		v.add("three");
		v.add("four");
		Enumeration enume = v.elements();
		while (enume.hasMoreElements()) {
			String s = (String) enume.nextElement();
			if (s.equals("two"))
				v.remove("two");
			else {
				System.out.println(s);
			}
		}
		System.out.println("What's really there...");
		enume = v.elements();
		while (enume.hasMoreElements()) {
			String s = (String) enume.nextElement();
			System.out.println(s);
		}
	}
}
