
package trap;
/**
 *
 * @author shadow 
 * @Date 2016年8月31日下午9:38:42
 * @version 1.0
 * @since 
 **/
public class Common {
	private static final int END = Integer.MAX_VALUE;
	private static final int START = END - 10;
	
	public static void main(String[] args) {
		for(int i = -10; i < 10; i++){
			System.out.println( i + " : " + isOdd(i));
		}
		
		//浮点数相减，结果为0.10000000000000009，原因不详
		System.out.println(2.0f-1.9f);
		
		//交换，不能实现交换，因为java运算符顺序是从左到右的，应该这么写：y=(x^=(y^x))^y;
		int x = 2010;
		int y = 2012;
		//x^=y^=x^=y;//错误
		//y=(x^=(y^=x))^y;//正确
		y = y ^ x;
		x = x ^ y;
		y = x ^ y;
		System.out.println("X = "+ x + ", Y = " + y);
		
		//int类型的i计数器溢出，无限循环
		int count = 0;
		for(int i = START; i < END; i++){
			System.out.println("I : " + i);
			count++;
			System.out.println(count);
		}
		
		//计数器问题,（运算符优先级问题）
		int minutes = 0;
		for(int ms = 0; ms < 60 * 60 * 1000; ms++){
			if(ms % (60 * 1000) == 0){
				minutes++;
			}
		}
		System.out.println("minutes : " + minutes);
		
		System.out.println("Decision : " + decision());
 	}
	/**
	 * 一般情况下，不管怎么说try/catch代码块中，finally总是最后被执行的。
	 * @return
	 */
	public static boolean decision(){
		try{
			return true;
		}finally{
			return false;
		}
	}
	
	/**
	 * 查找奇数
	 * @param i
	 * @return
	 */
	public static boolean isOdd(int i){
		return i % 2 != 0;
	}
}
