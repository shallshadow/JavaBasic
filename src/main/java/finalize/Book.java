/**
 * @author shadow
 * @Date 2016年8月14日下午8:09:58
 * @Fun
 **/
package finalize;

public class Book {
	boolean checkedOut = false;
	public Book(boolean checkOut) {
		// TODO Auto-generated constructor stub
		this.checkedOut = checkOut;
	}
	
	void checkIn(){
		checkedOut = false;
	}
	
	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		//super.finalize();
		if(checkedOut){
			System.out.println("Error:checked out.");
		}
	}
}
