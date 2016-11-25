
package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

import org.w3c.dom.ls.LSException;

/**
 *
 * @author shadow E-mail:zyydqpi@163.com
 * @Date 2016年8月20日下午8:32:11
 * @version 1.0
 * @since
 **/
public class ListPerformance {
	private static final int REFS = 100;

	private abstract static class Tester {
		String name;
		int size;

		public Tester(String name, int size) {
			// TODO Auto-generated constructor stub
			this.name = name;
			this.size = size;
		}

		abstract void test(List<?> list);
	}
	
	public static void main(String[] args) {
		//test(new ArrayList<>());
		//test(new LinkedList<>());
		
		List<Character> list = new LinkedList<>();
		list.add('b');
		list.add('a');
		list.add('z');
		System.out.println(list);
	}

	@SuppressWarnings("unchecked")
	public static void test(List<?> list) {
		System.out.println("Testing " + list.getClass().getName());

		for (int i = 0; i < testers.length; i++) {
			fill((List<String>)list, testers[i].size);
			System.out.print(testers[i].name);
			long t1 = System.currentTimeMillis();
			testers[i].test(list);
			long t2 = System.currentTimeMillis();
			System.out.println(" : " + (t2 - t1));
		}

	}

	static void fill(Collection<String> collection, int size) {
		for (int i = 0; i < size; i++) {
			collection.add(i + "");
		}
	}

	private static Tester[] testers = { new Tester("get", 3000) {
		@Override
		void test(List<?> list) {
			// TODO Auto-generated method stub
			for (int i = 0; i < REFS; i++) {
				for (int j = 0; j < list.size(); j++) {
					list.get(j);
				}
			}
		}
	}, new Tester("iteration", 3000) {
		@Override
		void test(List<?> list) {
			// TODO Auto-generated method stub
			for (int i = 0; i < REFS; i++) {
				Iterator<?> iterator = list.iterator();
				while (iterator.hasNext()) {
					iterator.next();
				}
			}
		}
	}, new Tester("insert", 10000) {
		@Override
		void test(List<?> list) {
			// TODO Auto-generated method stub
			int half = list.size() / 2;
			String string = "Test";
			@SuppressWarnings("unchecked")
			ListIterator<String> iterator = (ListIterator<String>) list.listIterator(half);
			for (int i = 0; i < size * 10; i++) {
				iterator.add(string);
			}
		}
	}, new Tester("remove", 50000) {
		@Override
		void test(List<?> list) {
			// TODO Auto-generated method stub
			ListIterator<?> iterator = list.listIterator(3);
			while (iterator.hasNext()) {
				iterator.next();
				iterator.remove();
			}
		}
	} };
}
