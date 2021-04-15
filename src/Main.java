import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

import javax.swing.SwingUtilities;
// 저장햇당



/////아이고 좋아
public class Main {

	private static final int PORT = 4900;
	public static void main(String[] args) {
		try {
			Socket socket = new Socket("localhost", PORT);
			DataInputStream dis = new DataInputStream(socket.getInputStream());
			DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
			System.out.println("접속 완료");
			SwingUtilities.invokeLater(new Runnable() {
				@Override
				public void run() {
					new GUI_Login(dos, dis);					
				}
			});
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
// 안녕하세요 
//  반갑습니다
