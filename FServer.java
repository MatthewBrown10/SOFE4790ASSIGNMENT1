import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class FServer implements Runnable {
	
	
	public Socket conn;
	public static ServerSocket ss;
	
	
	
	public static void main(String[] args)  throws Exception{
		FServer rn = new FServer();
		ss = new ServerSocket(3500);
		Thread t = new Thread(rn);
		t.start();
		
		}
	
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		
		try {
			InputStream inputByte = conn.getInputStream();
			BufferedInputStream input = new BufferedInputStream(inputByte);
			PrintWriter out = new PrintWriter(conn.getOutputStream());
			int code = input.read();
			
			
			if(code == 1)
			{
				
				while(true) {
					try {
						System.out.println("Waitng for connections");
						conn = ss.accept();
						

						System.out.println("Accepted a connection from: " + conn.getRemoteSocketAddress());
						
					
						
						BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream()));
						BufferedReader br2 =  new BufferedReader(new FileReader("C:\\Users\\matth\\eclipse-workspace\\D_Project\\src\\second.txt"));
						StringBuilder sb = new StringBuilder();
						
						String str1 = br.readLine();
						String str2 = "";
						String [] cmp = str1.split(" ");
						String[] cmp2;
						
						System.out.println(str1);
						
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
				        
				      
				        
				        ArrayList<String> myList3 = new ArrayList<String>();
				        
				        for(String temp : myList1)
				        {
				        	if(myList2.contains(temp))
				        	{
				        		myList3.add(temp);
				        	}
				        }
				        
				        LinkedHashSet<String> hashSet = new LinkedHashSet<>(myList3);
						ArrayList<String> NoDuplicates = new ArrayList<>(hashSet);
						
						double param1 =  NoDuplicates.size();
						double param2 = myList2.size();
						
						double percentage = (double) (param1/param2);
						
						
						
						
						
						
						System.out.println(Math.round(percentage * 100.00) / 100.00);
			
					
						
						
					br2.close();
			}
					catch(Exception e)
		{
			System.out.println(e.toString());
		}
				}
			}
			else if(code == 2)
			{
				
			}

}
		catch(Exception e)
		{
			System.out.println(e.toString());
		}
}
}