
package trap;

/**
 * @fun 类型自动转换
 * @author shadow E-mail:zyydqpi@163.com
 * @Date 2016年8月23日下午8:02:15
 * @version 1.0
 * @since
 **/
public class AutoAdvance {
	public static void main(String[] args) {
		// 表达式类型的自动提升
		System.out.println("Hello!" + 'a' + 7);
		System.out.println('a' + 7 + "Hello!");

		// 复合赋值运算符包含了一个隐式类型转换
		short value = 5;
		//编译不通过
		//value = value - 2;
		//因为系统有一个隐式类型转换，将会发生精度丢失。
		value += 200000;
		//等价于 
		//value = (short) (value + 200000);
		System.out.println("value : " + value);
		//for、while或do循环中的重复执行语句不能是一条单独的局部变量定义语句
		//下例中，去掉花括号将无法通过编译
		for(int i = 0; i< 100; i++){
			Integer it = new Integer(i);
		}
		
		//instanceof运算符有一个限制，其操作数的编译时类型必须是
		//1.要么与后面的类相同
		//2.要么是后面类的父类
		//3.要么是后面类的子类
		Object str = "123";
		Math math = (Math) str;
		//编译不通过
		//System.out.println(math instanceof str);
		
	}
}
