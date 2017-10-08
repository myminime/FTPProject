/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ftp;

/**
 *
 * @author JustSonny
 */
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Move {
    
    public static void main(String[] args)
    {

    	InputStream inStream = null;
	OutputStream outStream = null;

    	try{

    	    File afile =new File("G:\\asal\\coba.txt");
    	    File bfile =new File("G:\\tujuan");

    	    inStream = new FileInputStream(afile);
    	    outStream = new FileOutputStream(bfile);

    	    byte[] buffer = new byte[1024];

    	    int length;
    	    //copy the file content in bytes
    	    while ((length = inStream.read(buffer)) > 0){

    	    	outStream.write(buffer, 0, length);

    	    }

    	    inStream.close();
    	    outStream.close();

    	    //delete the original file
    	    afile.delete();

    	    System.out.println("File is copied successful!");

    	}catch(IOException e){
    	    e.printStackTrace();
    	}
    }   
}
