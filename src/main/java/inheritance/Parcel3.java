/**
 * @author shadow
 * @Date 2016年8月18日下午7:41:47
 * @Fun
 **/
package inheritance;

public class Parcel3 {	
	
	public static class PDestination implements Destination{
		private String label;
		public PDestination(String whereTo) {
			// TODO Auto-generated constructor stub
			this.label = whereTo;
		}
		
		@Override
		public String readLabel() {
			// TODO Auto-generated method stub
			return label;
		}
	}
	
	public Destination dest(String s){
		return new PDestination(s);
	}
	static class PContents extends Contents{
		private int i = 11;

		@Override
		public int value() {
			// TODO Auto-generated method stub
			return i;
		}
	}
	public Contents cont(){
		return new PContents();
	}
	
}
