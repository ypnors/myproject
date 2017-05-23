package oo.io;

import java.io.FileOutputStream;

public class SimpleWrite {

	public static void main(String[] args ){
		try{
			FileOutputStream fos=new FileOutputStream("data.txt");
			fos.write(98);
			fos.flush();
			fos.close();
			
		}catch()){
			
		}
	}
}
