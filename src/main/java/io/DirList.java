/**
 * @author shadow
 * @Date 2016年8月13日下午7:29:15
 * @Fun
 **/
package io;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;

public class DirList {
	public static void main(String[] args) {
		File path = new File(".");
		String[] list;
		if(args.length == 0)
			list = path.list();
		else
			list = path.list(filter(args[0]));
		Arrays.sort(list);
		
		for(int i = 0; i < list.length; i++){
			System.out.println(list[i]);
		}
	}
	
	//无名内隐类
	public static FilenameFilter filter(final String afn){
	
		return new FilenameFilter() {
			
			@Override
			public boolean accept(File dir, String name) {
				// TODO Auto-generated method stub
				String fileName = new File(name).getName();
				return fileName.indexOf(afn) != -1;
			}
		};
	}
}

class DirFilter implements FilenameFilter {

	String afn;

	public DirFilter(String afn) {
		// TODO Auto-generated constructor stub
		this.afn = afn;
	}

	@Override
	public boolean accept(File dir, String name) {
		// TODO Auto-generated method stub
		String f = new File(name).getName();
		return f.indexOf(afn) != -1;
	}

}