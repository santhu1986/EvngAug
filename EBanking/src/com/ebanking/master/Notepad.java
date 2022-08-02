package com.ebanking.master;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Notepad {

	public static void main(String[] args) throws IOException 
	{
		//Instance Class
		
				Library Lb=new Library();
				
				Lb.OpenApp("http://122.175.8.158/ranford2");
			    Lb.AdminLgn("Admin","Mq$ystems@");
			 
			    //To get Test Data File Path
			    
			    String Fpath="D:\\Evngjuly\\EBanking\\src\\com\\ebanking\\testdata\\Role.txt";
			    
			    //Results File Path
			    
			    String Rpath="D:\\Evngjuly\\EBanking\\src\\com\\ebanking\\results\\Res_Role.txt";
			    String SD;
			    //To get Test Data File 
			    
			    FileReader FR=new FileReader(Fpath);
			    BufferedReader BR=new BufferedReader(FR);
			    String Sread=BR.readLine();
			    System.out.println(Sread);
			    
			    //To write Header
			    
			    FileWriter FW=new FileWriter(Rpath);
			    BufferedWriter BW=new BufferedWriter(FW);
			    BW.write(Sread);
			    BW.newLine();
			    
			   //Multiple Iterations ---- Loop
			    
			    while ((SD=BR.readLine())!=null) 
			    {
					System.out.println(SD);
					
					//Split
					
					String SR[]=SD.split("###");
					
					String Rname=SR[0];
					String Rtyp=SR[1];
					
					String Res=Lb.Role(Rname,Rtyp);
					System.out.println(Res);
					
					//Results
					
					BW.write(SD+"*^&%$^"+Res);
					BW.newLine();
					
				}
			
			    BW.close();
			    BR.close();
			}

}
