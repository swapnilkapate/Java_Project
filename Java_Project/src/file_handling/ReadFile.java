package file_handling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;

public class ReadFile {

	public static void main(String[] args) {

		String path = "C:\\Users\\Hp\\Desktop\\sample.txt";
		// 1. using fileinputstream
		FileInputStream fi = null;
		try {
			File file = new File(path);
			fi = new FileInputStream(file);
			System.out.println("Content is :");
			int c = 0;
			while ((c = fi.read()) != -1) {
				System.out.print((char) c);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				fi.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		System.out.println("--------------");
		// 2. using file reader
		FileReader fr = null;
		try {
			fr = new FileReader(path);
			System.out.println("Content is :");
			int c = 0;
			while ((c = fr.read()) != -1) {
				System.out.print((char) c);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				fi.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}

}
