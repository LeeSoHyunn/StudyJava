package _0322;
import java.io.File;
import java.io.FileReader;

public class F03_fileReaderEx {

	public static void main(String[] args) {

		File file = new File("D:/Filetest/test.txt");
		
		FileReader in = null;
		
		char[] cbuf = new char[100];
		
		try {
			in = new FileReader(file);  //기준 데이터가 char임..
			String content ="";
			while(true) {
//				int data = in.read(); //한글자값을 반환
//				System.out.printf("%X", data); //%X or %x는 16진수 표현, %o는 8진수 표현 //글자하나가 2바이트
//				System.out.print((char)data);
//				if(data == -1) {
//					break;
//				}
				
				int data = in.read(cbuf); //버퍼를 사용하게 되면 data 반환값은 char의 갯수. 글자수를 기준으로 함
				System.out.println(data);
				if(data != -1)  content = new String(cbuf, 0, data);
				else break;
				System.out.println(content);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {in .close();} catch(Exception e) {}
			//reader -> char단위로 읽어들임  input -> 바이트단위로 읽어들임
		}

	}

}
