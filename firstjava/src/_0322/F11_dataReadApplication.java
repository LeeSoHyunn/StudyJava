package _0322;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.FileInputStream;

public class F11_dataReadApplication {

	public static void main(String[] args) {
		// 리드로 말고 리드바이트로 읽어야됨
		//DataRead
		
		FileInputStream fis = null;
		DataInputStream dis = null;
		
		try {
			fis = new FileInputStream("customer.data");
			dis = new DataInputStream(fis);
			String name = null;      //null값이 기본값이라
			while((name = dis.readUTF()) != null) {
				System.out.println(name);
				System.out.println(dis.readChar());
				System.out.println(dis.readUTF());
				System.out.println(dis.readInt()); //형변환 필요없이 읽을 수 잇음
				
			}
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
