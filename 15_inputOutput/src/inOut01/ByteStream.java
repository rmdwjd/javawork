	package inOut01;

import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 바이트 기반 스트림
		//바이트 스트림  1byte를 전송함
		FileOutputStream fout = null;
		
		try {
			fout = new FileOutputStream("a_byte.txt");
			fout.write(62);
			fout.write('b');
			
			byte[] arr = {97, 99, 100};
			fout.write(arr);
			
		} catch (IOException e) {
			// TODO: handle exception
		}

	}

}
