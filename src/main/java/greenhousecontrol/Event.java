/**
 * @author shadow
 * @Date 2016年8月10日下午8:11:11
 * @Fun	 The common methods for any control event.
 **/
package greenhousecontrol;

public abstract class Event {
	private long evtTime;
	public Event(long eventTime){
		this.evtTime = eventTime;
	}
	
	public boolean ready(){
		return System.currentTimeMillis() >= evtTime;
	}
	
	abstract public void action();
	abstract public String decription();
}
