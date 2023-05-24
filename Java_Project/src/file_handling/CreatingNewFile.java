package file_handling;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class CreatingNewFile {

	public static void main(String[] args) {
		
		String path = "C:\\Users\\Hp\\Desktop\\sample.txt";
		// 1. using file
		File file = new File(path);
		try {
			boolean flag = file.createNewFile();
			if (flag) {
				System.out.println("File is created");
			} else {
				System.out.println("File is already exists...");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		// 2. using fileoutputstream along with scanner to enter text in file
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("enter file name with location path :");
			String fileName = sc.nextLine();
			
			FileOutputStream fos = new FileOutputStream(fileName, true);
			
			System.out.println("Enter file content");
			String content = sc.nextLine();
			byte b[] = content.getBytes();
			fos.write(b);
			fos.close();
			System.out.println("file is saved..");
			sc.close();
			
		} catch (Exception e) {
			System.out.println("some exception has occured..");
			e.printStackTrace();
		}
		
		System.out.println("-------------");
		// 3. java nio package:
		try {
			Path pathLocation = Paths.get("C:\\Users\\Hp\\Desktop\\sample2.txt");
			Path newPath = Files.createFile(pathLocation);
			System.out.println("File is created at : "+newPath);
			
		} catch (Exception e) {
			System.out.println("some exception has occured..");
			e.printStackTrace();
		}
		
	}

}
