/**
 * @author shadow
 * @Date 2016年8月10日下午8:20:37
 * @Fun
 **/
package greenhousecontrol;

public class GreenhouseControls extends Controller {

	private boolean light = false;
	private boolean water = false;
	private String thermostat = "Day";

	private class LightOn extends Event {
		public LightOn(long eventTime) {
			// TODO Auto-generated constructor stub
			super(eventTime);
		}

		@Override
		public void action() {
			// TODO Auto-generated method stub
			// put hardware control code here to physically turn on the light.
			light = true;
		}

		@Override
		public String decription() {
			// TODO Auto-generated method stub
			return "Light is on";
		}
	}

	private class LightOff extends Event {

		public LightOff(long eventTime) {
			super(eventTime);
			// TODO Auto-generated constructor stub
		}

		@Override
		public void action() {
			// TODO Auto-generated method stub
			light = false;
		}

		@Override
		public String decription() {
			// TODO Auto-generated method stub
			return "Light is Off";
		}
	}
	
	public class Restart extends Event{

		public Restart(long eventTime) {
			super(eventTime);
			// TODO Auto-generated constructor stub
		}

		@Override
		public void action() {
			// TODO Auto-generated method stub
			long tm = System.currentTimeMillis();	
			addEvent(new LightOff(tm + 2000));		
			addEvent(new LightOn(tm + 1000));
			
		}

		@Override
		public String decription() {
			// TODO Auto-generated method stub
			return "Restart system";
		}
		
	}
	

	public static void main(String[] args) {
		GreenhouseControls gc = new GreenhouseControls();
		long eventTime = System.currentTimeMillis();
		gc.addEvent(gc.new Restart(eventTime));
		gc.run();
	}

}
