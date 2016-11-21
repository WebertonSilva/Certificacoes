package Excercise;
import java.io.FileNotFoundException;
import java.io.IOException;
public class Whiz {

	public static void main(String[] args) {
		try{
			metodo();
		}catch(FileNotFoundException e){
			System.out.println("Caught " + e);
		}catch (IOException i) {
			// TODO: handle exception
			System.out.println("Caught " + i);
		}
	}
	
	public static void metodo() throws IOException{
		throw new IOException();		
	}
}
