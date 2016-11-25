/**
 * @author shadow
 * @Date 2016年8月10日下午8:15:27
 * @Fun
 **/
package greenhousecontrol;

public class Controller {
	private EventSet eSet = new EventSet();
	public void addEvent(Event e){
		eSet.add(e);
	}
	
	public void run(){
		Event event;
		
		while((event = eSet.getNext()) != null){
			if(event.ready()){
				event.action();
				System.out.println(event.decription());
				eSet.remove(event);
				event = null;
			}
		}
	}
}
