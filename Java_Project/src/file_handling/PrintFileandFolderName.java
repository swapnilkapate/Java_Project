package file_handling;

import java.io.File;
import java.util.Arrays;

public class PrintFileandFolderName {

	public static void main(String[] args) {
		// to print list of files and folders in E directory 
		String path = "E:\\Downloads";
		
		File file = new File(path);
		
		File downloadDir[] = file.listFiles();
		
		Arrays.sort(downloadDir);
		
		for ( File e : downloadDir) {
			if(e.isFile()) {
			System.out.println("File : "+e.getName());
			} else if (e.isDirectory()) {
				System.out.println("Dir : "+ e.getName());
			} else {
				System.out.println("Unknown : "+e.getName());
			}
		}

	}

}
