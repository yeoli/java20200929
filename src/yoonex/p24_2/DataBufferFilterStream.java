package yoonex.p24_2;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class DataBufferFilterStream {
	public static void main(String[] args) throws IOException {
		OutputStream out = new FileOutputStream("data.txt");
		BufferedOutputStream bufFilterOut = new BufferedOutputStream(out);
		DataOutputStream dataFilterOut = new DataOutputStream(bufFilterOut);
		
		dataFilterOut.writeInt(275);
		dataFilterOut.writeDouble(45.79);
		dataFilterOut.close();
		
		InputStream in = new FileInputStream("data.txt");
		BufferedInputStream bufFilterIn = new BufferedInputStream(in);
		DataInputStream dataFilterIn = new DataInputStream(bufFilterIn);
		int num1 = dataFilterIn.readInt();
		double num2 = dataFilterIn.readDouble();
		dataFilterIn.close();
		
		System.out.println(num1);
		System.out.println(num2);
	}
}
