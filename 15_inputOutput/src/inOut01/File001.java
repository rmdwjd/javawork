package inOut01;

import java.io.File;
import java.io.IOException;

public class File001 {

	public static void main(String[] args) {
		// 간단한 파일만들때
		try {
			File f1 = new File("test.txt");
			f1.createNewFile();
			
			File f2 = new File("C:/Users/에듀인에듀/test");
			f2.createNewFile();
			
			File folderMk = new File("Cl/Users/에듀인에듀/temp");
			folderMk.mkdir();
			
			File f3 = new File("C:/Users/에드인에듀/temp/test02.txt");
			f3. createNewFile();
			
			System.out.println("파일이 존재하는가? "+f1.exists());
			System.out.println("test03.txt 파일이 존재하는가?" + new File("test03.txt").exists());
			
		} catch (IOException e) {
			
			
		}

	}

}
