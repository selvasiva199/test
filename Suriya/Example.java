package Suriya;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Example {
	public static void main(String[] args) throws IOException {
		File a=new File("D:\\New folder/siva doc.txt") ;
		FileInputStream b=null;
		b=new FileInputStream(a);
		int c=0;
		while((c=b.read())!=-1) {
			System.out.println(c);
		}
		b.close();
	}
}
