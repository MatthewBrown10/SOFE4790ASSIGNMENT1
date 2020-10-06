import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class FServer2 implements Runnable {
	
	
	public Socket conn;
	public static ServerSocket ss;
	
	
	
	public static void main(String[] args)  throws Exception{
		FServer2 rn = new FServer2();
		ss = new ServerSocket(3500);
		Thread t = new Thread(rn);
		t.start();
		
		
		}
	
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		
		
			
			
			//System.out.println("Waitng for connections");
			
				
		
			
			
			//BufferedInputStream input = new BufferedInputStream(inputByte);
			//PrintWriter out = new PrintWriter(conn.getOutputStream());
			//int code = input.read();
			
			
//			if(code == 1)
//			{
				
				while(true) {
					try {
//						System.out.println("Waitng for connections");
//						conn = ss.accept();
//						
						System.out.println("Waitng for connections");
						conn = ss.accept();
						InputStream inputByte = conn.getInputStream();

						System.out.println("Accepted a connection from: " + conn.getRemoteSocketAddress()); // prints address of connected socked
						
					
						//Readers for read file from the socket and the filereader from the directory
						BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream()));
						BufferedReader br2 =  new BufferedReader(new FileReader("C:\\Users\\matth\\eclipse-workspace\\D\\src\\fifth.txt"));
						StringBuilder sb = new StringBuilder();
						
						// Using the string builder
						String str1 = br.readLine();
						String str2 = "";
						String [] cmp = str1.split(" ");
						String[] cmp2;
						
						System.out.println(str1);
						
						
						//Using the string builder, a new string is made from the file in the directory
				        while ((str2 = br2.readLine()) != null) {
				            sb.append(str2);
				            //sb.append("\n");
				        }
				        String text = sb.toString();
				        System.out.println(text);
				        
				        String hold1[] = str1.split("\\s+");
				        String hold2[] = text.split("\\s+");
				        
				        
				        
				        List<String> myList1 =  Arrays.asList(hold1);  
				        List<String> myList2 =  Arrays.asList(hold2);  
				        
				      
				        //This is to read the duplicate elements in each list and store them in an empty string
				        ArrayList<String> myList3 = new ArrayList<String>();
				        
				        for(String temp : myList1)
				        {
				        	if(myList2.contains(temp))
				        	{
				        		myList3.add(temp);
				        	}
				        }
				        
				        //The linkedHashset does not allow for duplicates and are removed upon instantiation
				        LinkedHashSet<String> hashSet = new LinkedHashSet<>(myList3);
						ArrayList<String> NoDuplicates = new ArrayList<>(hashSet);
						
						//Size of the number of duplicates in this array and the size of the second list
						double param1 =  NoDuplicates.size();
						double param2 = myList2.size();
						
						
						//This prints the percentage
						double percentage = (double) (param1/param2);
						
						
						
						
						
						
						System.out.println(Math.round(percentage * 100.00) / 100.00);
			
					
						
						
					br2.close();
			}
					catch(Exception e)
		{
			System.out.println(e.toString());
		}
//				}
//			}
//			else if(code == 2)
//			{
//				
//			}
}
}
}