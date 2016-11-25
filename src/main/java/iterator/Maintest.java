/**
 * @author shadow
 * @Date 2016年8月19日下午9:27:41
 * @Fun
 **/
package iterator;


import java.util.Hashtable;
import java.util.Vector;

public class Maintest {
	public static void main(String[] args) {
		Vector<Object> vector = new Vector<>();
		
		for(int i = 0; i < 5; i++){
			vector.add(new Mouse(i));
		}
		
		Hashtable<Integer, Object> hashtable = new Hashtable<>();
		for(int i = 0; i < 5; i++){
			hashtable.put(new Integer(i), new Hamster(i));
		}
		
		System.out.println("Vector");
		PrintData.print(vector.elements());
		
		System.out.println("Hashtable");
		PrintData.print(hashtable.elements());
	}
}
