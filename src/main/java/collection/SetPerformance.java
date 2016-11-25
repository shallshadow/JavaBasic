
package collection;

import java.util.Set;

/**
 *
 * @author shadow E-mail:zyydqpi@163.com
 * @Date 2016年8月20日下午9:07:24
 * @version 1.0
 * @since 
 **/
public class SetPerformance {
	private static final int REFS = 200;
	private abstract static class Tester{
		
		String name;		
		public Tester(String name) {
			// TODO Auto-generated constructor stub
			this.name = name;
		}
		abstract void test(Set<String> s, int size);
	}
	
	private static Tester[] testers = {
			new Tester("add") {
				
				@Override
				void test(Set<String> s, int size) {
					// TODO Auto-generated method stub
					for(int i = 0; i < REFS; i++){
						
					}
				}
			},
	};
}
