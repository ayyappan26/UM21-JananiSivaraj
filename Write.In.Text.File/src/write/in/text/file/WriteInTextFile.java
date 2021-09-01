package write.in.text.file;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteInTextFile {

	public void writeInTextFile() {
		File myfile = new File("D:\\DEV\\writemyfile.txt");
		BufferedWriter bw = null;
		try {
			bw = new BufferedWriter(new FileWriter(myfile));
			bw.write("hi enter in file");
			bw.close();// when we are done write to the file we should use close.
		} catch (IOException e) {
			System.out.println("caught IO Exception");

		}

	}

}
