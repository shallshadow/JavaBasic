
package trap;

import java.util.Collection;

/**
 *
 * @author shadow 
 * @Date 2016年8月31日下午10:17:32
 * @version 1.0
 * @since 
 **/
public class Generic<T extends CollectionTrag> {
	T some;
	public Generic(T some) {
		// TODO Auto-generated constructor stub
		this.some = some;
	}

	public static <M> M getSomeThing(Collection<M> some){
		return null;
	} 
	
	public static void main(String[] args) {
		Generic<CollectionTrag> generic = new Generic<CollectionTrag>(new CollectionTrag());
	}
}
