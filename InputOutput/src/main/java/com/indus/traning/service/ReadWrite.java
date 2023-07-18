package com.indus.traning.service;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ReadWrite {

public  ReadWrite(String src, String dest){
	FileInputStream in = null;
	FileOutputStream out = null;
	try {
		in = new FileInputStream("C:\\Indus\\Workspaces\\Traning\\InputOutput\\src\\main\\resources\\InputFile.txt");
		
			out = new FileOutputStream("C:\\Indus\\Workspaces\\Traning\\InputOutput\\src\\main\\resources\\OutputFile.txt");
		
		
		int c;
		while((c=in.read())!= -1) {
			out.write(c);
		}
	}catch (Exception e) {
		e.printStackTrace();
	}
		finally {
			if (in != null) {
				try {
					in.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if (out != null) {
				try {
					out.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	}


	
}
}
}
