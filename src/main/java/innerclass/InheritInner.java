/**
 * @author shadow
 * @Date 2016年8月10日下午7:23:23
 * @Fun  当你需要继承一个内部类，你需要在构造函数中传入该内部类的外部类，并调用它的构造函数。
 **/
package innerclass;

public class InheritInner extends WithInner.Inner {
	public InheritInner(WithInner wi) {
		// TODO Auto-generated constructor stub
		wi.super();
	}

	public void test() {
		System.out.println("InheritInner");
	}

	public static void main(String[] args) {
		WithInner withInner = new WithInner();
		InheritInner inheritInner = new InheritInner(withInner);
		inheritInner.test();
	}
}

class WithInner {
	class Inner {
	}
}
