/**
 * @author shadow
 * @Date 2016年8月13日下午7:51:40
 * @Fun
 **/
package io;

import java.io.File;

public class MakeDirectories {
	private final static String usage = 
			"Usage:MakeDirectories path1 ...\n" +
			"Creates each path\n" + 
			"Usage:MakeDirectories -d path1 ...\n"
			+ "Delete each path\n"
			+ "Usage:MakeDirectories -r path1 path2\n"
			+ "Renames from path1 to path2 \n";
	
	private static void usage(){
		System.out.println(usage);
		System.exit(1);
	}
	
	private static void fileData(File f){
		String message = " Absolute path: " + f.getAbsolutePath() +
				"\n Can read: " + f.canRead() + 
				"\n Can write:" + f.canWrite();
		System.out.println(message);
		
		if(f.isFile()){
			System.out.println("It's a file.");
		}else if(f.isDirectory()){
			System.out.println("It's a directory.");
		}
	}
	
	public static void main(String[] args) {
		if(args.length < 1){
			usage();
		}
		
		/**
		 * 简单选择逻辑执行代码
		 */
	}
	
}
