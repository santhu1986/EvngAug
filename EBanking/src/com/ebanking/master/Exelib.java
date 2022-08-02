package com.ebanking.master;

import java.io.IOException;

public class Exelib {

	public static void main(String[] args) throws IOException 
	{
		//Instance Class
		
		Library LB=new Library();
	
		String RVal=LB.OpenApp("http://122.175.8.158/ranford2");
		System.out.println(RVal);
		LB.AdminLgn("Admin","Mq$ystems@");
		RVal=LB.Branches();
		System.out.println(RVal);
	}

}
