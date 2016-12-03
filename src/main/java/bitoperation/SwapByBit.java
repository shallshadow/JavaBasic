package bitoperation;
/**
 *
 * @author shadow 
 * @Date 2016年9月10日下午3:52:03
 * @version 1.0
 * @since 
 **/
public class SwapByBit {
	public static void main(String[] args) {

	}
	/**
	 * 使用异或操作来交换数据
	 */
	public static void swap(){
		int a = Integer.MAX_VALUE;
		int b = Integer.MIN_VALUE;
		
//		a = a ^ b;
//		b = a ^ a;
//		a = b ^ a;
//		
//		System.out.printf("%b\n", a);
		
		System.out.println("a : " + Integer.toBinaryString(a));
		System.out.println("b : " + Integer.toBinaryString(b));
		a = a ^ b;
		System.out.println("a ^ b : " + Integer.toBinaryString(a));
		b = a ^ b;		
		System.out.println("b = a ^ b : " + Integer.toBinaryString(b));
		a = a ^ b;
		System.out.println("a = a ^ b : " + Integer.toBinaryString(a));
		
		
	}
}
