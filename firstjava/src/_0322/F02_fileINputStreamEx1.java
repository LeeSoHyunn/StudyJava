package _0322;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class F02_fileINputStreamEx1 {

	public static void main(String[] args) {
		
		InputStream fis = null; //I.o입출력
		
		try {
			//FileInputStream(읽을 파일 경로) 객체 생성
			File file = new File("D:/Filetest/test.txt");
			fis = new FileInputStream(file);
			
			//버퍼공간
			byte[] buffer = new byte[100]; //100바이트씩 읽어들임
			String content = "";
			//데이터 읽기 1번
			
//			while(true) {
//				int data = fis.read(buffer); //주어진 버퍼에 데이터를 담아서 처리
//				int data = fis.read(); //1바이트씩 읽기
//				System.out.println((char)data);  //read() 1바이트 단위로 읽고있음.. 근데 char는 2바이트
//				System.out.println(data);
				//버퍼공간이 있어야지만 내용이 출력
				
				//데이터 읽기가 끝날때.. -1인 경우(-1가 아니면 계속 진행)
//				if(data != -1) content = new String(buffer, 0, data); //진행
//				else break;  //끝
//				System.out.println(content);
//				if(data == -1) break;
//			}
			
			//다른 방식으로 읽기 2번
			int readCount = fis.read(buffer);//처음 블럭 읽기
			while(readCount != -1) {
				String data = new String(buffer, 0, readCount); //데이터 처리..
				System.out.println(data);
				readCount = fis.read(buffer); //다음 블럭 읽기
			}
			
		} catch (FileNotFoundException e) {
			System.out.println("해당 경로의 파일을 찾을 수 없습니다.");
		}catch (IOException e) {
			System.out.println("파일을 읽을 수 없습니다.");
		}finally {
			//객체정리
			try {fis.close();} catch(Exception e2) {e2.printStackTrace();}
			//fis는 입출력이라 닫아야됨
			
			//출력햇을때 처음숫자 - 읽어들인 반환타입 48바이트씩 읽음
			//더이상 내용이없을때 -1
		}
		
		

	}

}
