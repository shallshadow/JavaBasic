
package bitoperation;
/**
 *
 * @author shadow 
 * @Date 2016年9月10日上午10:04:21
 * @version 1.0
 * @since 
 **/
public class LearnBit {
	public static void main(String[] args) {
		int n = 152;
		//右移
		n = n >> 1;
		System.out.println("n >> 1 : " + n);
		//左移
		n = n << 1;
		System.out.println("n << 1 : " + n);
		n = n << 2;
		System.out.println("n << 2 = " + n + ", n * 2^2 : " + (152 * 2 * 2));
		n = n >> 2;
		n = n << 3;
		System.out.println("n << 3 = " + n + ", n * 2^2^2 : " + (152 * 2 * 2 * 2));
		
		//无符号右移
		int un = 123456;
		System.out.println("un >>> 1 : " + (un >>> 1));
		//没有无符号左移
		//System.out.println("un <<< 1 : " + (un <<< 1));
		
		n = n >> 32;
		System.out.println("n >> 32 : " + n);
		
		n = n << 32;
		System.out.println("n << 32 : " + n);
		
	    int s = Integer.MAX_VALUE;
	    //按位与
	    System.out.println("s & 1 : " + (s & 1) );
	    //按位或
	    System.out.println("s | 1 : " + (s | 1) );
	    //按位移或
	    System.out.println("s ^ 1 : " +(s ^ 1));
	    //取反
	    System.out.println("~s : " +  ~s);
	    
	}
}
