package chap18.textbook.s180405;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;
import java.io.Writer;

public class FileCopy {
	public static void main(String[] args) throws Exception {
		String src = "src/chap18/textbook/s180405/FileCopy.java";
		String des = "file-copy.txt";
		
		//Reader, writer 사용해서 파일 복사
		
		Reader reader = new FileReader(src);
		Writer writer = new FileWriter(des);
		
		int s= 0;
		
		while((s=reader.read()) != -1) {			
			writer.write(s);
		}
		
		reader.close();
		writer.close();
		
	}
}
