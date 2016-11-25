/**
 * @author shadow
 * @Date 2016年8月18日下午7:45:32
 * @Fun
 **/
package inheritance;

import java.util.Properties;

public class MainTest {
	public static void main(String[] args) {
		Parcel3 parcel3 = new Parcel3();
		Contents contents = parcel3.cont();
		System.out.println(contents.value());
		
		Destination destination = parcel3.dest("Hello");
		System.out.println(destination.readLabel());
		
		Properties properties = System.getProperties();
		properties.list(System.out);
	}
}
