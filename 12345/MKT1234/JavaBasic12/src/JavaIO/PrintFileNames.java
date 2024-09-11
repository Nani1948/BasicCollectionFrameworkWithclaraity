package JavaIO;

import java.io.File;
import java.util.Arrays;

public class PrintFileNames {

	public static void main(String[] args) {
		String path="/Users/knand/Downloads";
		// Create an object of an class and pass the path as an arguments.
		File file=new File(path);
		
		//List of files using listFiles() method.
		File downloadDir[] =file.listFiles();
		Arrays.sort(downloadDir);
		for (File e:downloadDir) {
			if(e.isFile()) {
				System.out.println("File:"+e.getName() +" "+e.getAbsolutePath());
			}else if(e.isDirectory()) {
				System.out.println("Directory:"+e.getName()+" "+e.getAbsolutePath());
			}
			System.out.println("Not Known:"+e.getName()+" "+e.getAbsolutePath());
		}
		
		
	}

}
