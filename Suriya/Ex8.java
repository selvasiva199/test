package Suriya;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ex8 {
	public static void main(String[] args)throws IOException {
		try {
		File f=new File("C:\\\\Users\\\\NEW LIFE\\\\OneDrive - dmedpharma.in\\\\Desktop\\\\SURI.txt");
		FileReader fr=new FileReader(f);
		int temp=0;
		while((temp=fr.read())!=-1) {
			System.out.print((char)temp);
		}catch(FileNotFoundException fe) {
			
		}
		}
		System.out.println("success");
	}
}
