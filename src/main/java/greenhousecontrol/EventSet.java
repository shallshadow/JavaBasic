/**
 * @author shadow
 * @Date 2016年8月10日下午8:13:55
 * @Fun	 Along with Event, the generic framework for all control systems.	
 **/
package greenhousecontrol;

import java.util.ArrayList;

public class EventSet extends ArrayList<Event> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3208835324423922749L;

	private int index = 0;
	
	public Event getNext(){
		if(size() == 0){
			return null;
		}
		if(index >= size()){
			index = 0;
		}
		return this.get(index++);
	}	
}
