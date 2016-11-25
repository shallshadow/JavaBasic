/**
 * @author shadow
 * @Date 2016年8月14日下午8:20:56
 * @Fun
 **/
package init;

public class StaticInitialization {
	public static void main(String[] args) {
//		System.out.println("Create Table Class in main()");
//		new Table();
		System.out.println("--------");
		System.out.println("Creating new Cupboard() in main()");
		new Cupboard();
		System.out.println("Creating new Cupboard() in main()");
		new Cupboard();
		System.out.println("-------");
		//t2.f2(1);
		//t3.f3(1);
		t2 = new Table();
		t3 = new Cupboard();
	}
	
	static Table t2 = null;
	static Cupboard t3 = null;
}

/**
 * 类初始化过程：
 *  1.当static函数或数据成员首次被访问时，java直译器(inter Preter)必须查找环境变量classpath所指定的位置，找出其所在的类(.class)。
 *  2.当class被装载后，会产生一个Class对象，它的所有static初始化动作会被执行起来。而且只会执行一次，即在Class对象首次被加载的时候。
 *  3.当你new对象时，建构过程会先为Dog对象在heap上分配足够的存储空间。
 *  4.存储空间会被清为零，并自动将对象内所有隶属基本型别设为缺省值，并将references设为null。
 *  5.执行所有出现于数据定义处的初始化动作。
 *  6.执行构造函数。
 * 
 * */
