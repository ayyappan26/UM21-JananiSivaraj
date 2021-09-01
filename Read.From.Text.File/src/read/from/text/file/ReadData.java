package read.from.text.file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadData {

	public void readFromTextFile() {
		File myfile = new File("D:\\DEV\\readmyfile.txt");
		// BufferedReader br=new BufferedReader(new FileReader(myfile));

		/*
		 * If we simply add the above line system will mandate us to handle exception "
		 * file not found.
		 * 
		 */

		BufferedReader br = null;

		/*
		 * here we braked object creation line to 2 lines creting reference with null
		 * and then object. because if we put like BufferedReader br=new
		 * BufferedReader(new FileReader(myfile)); in same line inside try block code
		 * will be unreachable. scope of br then will be only inside try block. so we
		 * are crating br outside try block and summa initializing with null.
		 * 
		 * 
		 */
		try {
			br = new BufferedReader(new FileReader(myfile));
			String s;
			while ((s = br.readLine()) != null) { // this line throws IO exception which need to handle

				System.out.println(s);
			}
		} catch (FileNotFoundException f) {
			System.out.println("file not found exception caught");

		} catch (IOException e) {
			System.out.println("IO Exception caught");
		}
		/*
		 * also we don't need to catch file not found exception and IO exception 2
		 * times.handlig IO exception itself will resolve the file not found exception.
		 * because filenotfound exception id child of IOexception. so this parent can
		 * handle those 2 exceptions. So if we remove file not found, then this wont
		 * throw any error. becaue IO handled it.
		 */

	}

}
