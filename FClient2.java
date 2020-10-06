import java.io.*;
import java.net.Socket;
import java.util.*;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class FClient2 {
	public static void main(String[] args) throws Exception {
	
		
		
		
		//JOptionPane.showMessageDialog(null, "Welcome to File Service Application");
		
		//String response = JOptionPane.showInputDialog("Type in Number to select Service");
		//int input = Integer.parseInt(response);
		
		System.out.println("1.Plagarism Detector");
		System.out.println("2.File Info");
		byte code;
		
//		input = Integer.parseInt(response);
//		
//		if(input == 1)
//		{
			try {
				
				//This information is the socket connection and the reader and streeam used to take user input and send data to the server
				Socket socket = new Socket();
				socket = new Socket("127.0.0.1", 3500);
				BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in));
				BufferedOutputStream output = new BufferedOutputStream(socket.getOutputStream());
				code = 0;
				output.write(code);
				
				PrintWriter wr = new PrintWriter(socket.getOutputStream(), true);
				
				
				//FileInputStream fr = new FileInputStream()
				System.out.println("Name of File1?");
				String input1 = userInput.readLine();
				File file = new File(input1);
				FileInputStream fr = new FileInputStream(file);
				//byte[] b = new byte[(int) file.length()];
				byte[] b = new byte[50];
				//fr.read(b,0,b.length);
				fr.read(b);
				//output.write(b,0,b.length);
				output.write(b);
				
				fr.close();
				
		
				
				
				
				
				
				
				
				
				
				
		output.close();
				
//				System.out.println("Type in name of file 2");
//				file2 = sc.nextLine();
//				File fileTwo = new File(file2);
//				DataOutputStream check2 = new DataOutputStream(socket.getOutputStream());
//				FileInputStream fp2 = new FileInputStream(file2);
//				byte[] buf2 = new byte[(int) fileTwo.length()];
//				
//				
//			
//				fp.close();
//				while(fp2.read(buf2) > 0)
//				{
//					check.write(buf2);
//				
////					
////					
//			}
//				check2.flush();
//				fp2.close();
//				
//				check.close();
//				check2.close();
//				
				
		
		
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		
		//THIS PORTION OF CODE WAS SUPPOSE TO IMPLEMENT MY SECOND FUNCTION BUT IT WOULD NOT. iT WAS TO SEND DATA TO THE SERVER TO ACQUIRE INFORMATION ABOUT A FILE
	}
//		else if(input == 2)
//		{
//			try {
//			Scanner sc2 = new Scanner(System.in);
//			Socket socket = new Socket();
//			socket = new Socket("127.0.0.1", 3500);
//			BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in));
//			BufferedOutputStream output = new BufferedOutputStream(socket.getOutputStream());
//		
//		    
//			//FileInputStream fr = new FileInputStream()
//			System.out.println("Name of File1?");
//			String input1 = userInput.readLine();
//			File file = new File(input1);
//			FileInputStream fr = new FileInputStream(file);
//			//byte[] b = new byte[(int) file.length()];
//			byte[] b = new byte[50];
//			//fr.read(b,0,b.length);
//			fr.read(b);
//			//output.write(b,0,b.length);
//			output.write(b);
//			
//			fr.close();
//			
//	
//		    
//		}
//			catch(Exception e)
//			{
//				System.out.println(e.toString());
//			}
//
//}

		
	}
