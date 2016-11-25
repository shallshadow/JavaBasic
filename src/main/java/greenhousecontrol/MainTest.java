/**
 * @author shadow
 * @Date 2016年8月10日下午10:05:36
 * @Fun
 **/
package greenhousecontrol;

public class MainTest {
	public static void main(String[] args) {
		GreenhouseControls gc = new GreenhouseControls();
		long eventTime = System.currentTimeMillis();
		gc.addEvent(gc.new Restart(eventTime));
		gc.run();
	}
}
