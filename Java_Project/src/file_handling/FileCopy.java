package file_handling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy {

	public static void main(String[] args) {
		
		copyFile();
	}
	
	public static void copyFile() {
		
		File file = new File("C:\\Users\\Hp\\Desktop\\sample.docx");
		File opFile = new File("C:\\Users\\Hp\\Desktop\\sample-copy.docx");
		
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		try {
			fis = new FileInputStream(file);
			fos = new FileOutputStream(opFile);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		try {
			System.out.println(fis.available());
		} catch (IOException e) {
			e.printStackTrace();
		}
		int i = 0;
		try {
			while ((i = fis.read()) !=-1) {
				fos.write(i);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		finally {
			//close the streams
			if (fis !=null) {
				try {
					fis.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
				if (fos !=null) {
					try {
						fos.close();
					} catch (IOException e) {
						e.printStackTrace();
					}
					System.out.println("File is copied");
				}
			}
		}
	}

}
