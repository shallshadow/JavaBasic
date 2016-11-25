
package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Random;
import java.util.TreeSet;

/**
 *
 * @author shadow E-mail:zyydqpi@163.com
 * @Date 2016年8月20日下午8:06:07
 * @version 1.0
 * @since
 **/
public class SimpleCollection {
	public static void main(String[] args) {
		// Collection<Integer> collection = new ArrayList<>();
		// for(int i = 0; i < 10; i++){
		// collection.add(new Integer(i));
		// }
		//
		// for(Iterator<Integer> iterator = collection.iterator();
		// iterator.hasNext();){
		// System.out.println(iterator.next());
		// }

		TreeSet<Integer> treeSet = new TreeSet<>();
		Random random = new Random();
		for (int i = 0; i < 10; i++) {
			Integer integer = new Integer(random.nextInt(10));
			System.out.println("Integer : " + integer);
			treeSet.add(integer);
		}

		fill(treeSet, 10);
	}

	public static Collection<?> fill(Collection<?> collection, int size) {
		for (Iterator<?> iterator = collection.iterator(); iterator.hasNext();) {
			System.out.println(iterator.next());
		}
		return null;
	}
}
