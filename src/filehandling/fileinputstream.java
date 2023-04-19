package filehandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class fileinputstream {
	public static void main(String[] args) {
		//fileInputStreanDemo();
		//fileWriterDemo();
		//bufferDemo();
		fileReaderDemo();
	}
 static void fileInputStreanDemo() {
	 int i;
	 File myfile=new File("C:\\Users\\mrajendra\\readhello.txt");
	 try {
		 FileInputStream fis =new FileInputStream(myfile);
		 System.out.println("file opened ");
		 System.out.println("---------------");
		 while((i=fis.read()) !=-1) {
			 System.out.print((char)i);
		 }
		 fis.close();
	 }catch(FileNotFoundException e) {
          System.out.println("exception occured"+e.getMessage());
	 } catch (IOException e) {
	
		e.printStackTrace();
	}
 }
 
static void fileOutputStreamDemo() {
	 int i;
	 File myfile=new File("C:\\Users\\mrajendra\\readhello.txt");
	 try {
		 FileOutputStream fos =new FileOutputStream(myfile);
		 System.out.println("file opened ");
		 System.out.println("---------------");
		
		 String data="from the program";
		 byte[] databyteArray=data.getBytes();
		 fos.write(databyteArray);
		 fos.close();
		
		 
		 fos.close();
	 }catch(FileNotFoundException e) {
          System.out.println("exception occured"+e.getMessage());
	 } catch (IOException e) {
	
		e.printStackTrace();
	}
 }
 
 static void fileWriterDemo() {
	
		 int i;
		 File myfile=new File("C:\\Users\\mrajendra\\readhello.txt");
		 try {
			 FileWriter fw =new FileWriter(myfile);
			 System.out.println("file opened ");
			 System.out.println("---------------");
		fw.write("using file writer to write\n");
		fw.write("using file writer to write one more line");
		
		fw.close();
		 }catch(FileNotFoundException e) {
	          System.out.println("exception occured"+e.getMessage());
		 } catch (IOException e) {
		
			e.printStackTrace();
		}
	 }
 
 static void fileReaderDemo() {
		
	 int i;
	 File myfile=new File("C:\\Users\\mrajendra\\readhello.txt");
	 try {
		 FileReader fr =new FileReader(myfile);
		 System.out.println("file opened ");
		 System.out.println("---------------");
		 while((i=fr.read()) !=-1) {
			 System.out.print((char)i);
		 }
		 fr.close();
	 }catch(FileNotFoundException e) {
          System.out.println("exception occured"+e.getMessage());
	 } catch (IOException e) {
	
		e.printStackTrace();
	}
 }
 
 static void bufferDemo() {
	 int i;
	 File myfile=new File("C:\\Users\\mrajendra\\readhello.txt");
	 try {
		 FileReader fr=new FileReader(myfile);    
         BufferedReader br=new BufferedReader(fr);    
    
         while((i=br.read())!=-1){  
         System.out.print((char)i);  
         }  
         br.close();    
         fr.close();  
		;
	 }catch(FileNotFoundException e) {
          System.out.println("exception occured"+e.getMessage());
	 } catch (IOException e) {
	
		e.printStackTrace();
	}
 }
 
 }

