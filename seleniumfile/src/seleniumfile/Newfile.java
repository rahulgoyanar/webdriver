package seleniumfile;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.testng.annotations.Test;

public class Newfile {

	@Test
	public void profile() throws IOException {
		File f = new File("D://SeleniumStuff//temp.text");
		f.createNewFile();
		FileWriter w = new FileWriter("D://SeleniumStuff//temp.text");
		BufferedWriter out = new BufferedWriter(w);
		out.write("Hello rahul Welcome");
		out.newLine();
		out.write("                     ");
		out.newLine();
		out.write("Happy holi ");
		out.flush();
		// to read the text file
		FileReader r = new FileReader("D://SeleniumStuff//temp.text");
		BufferedReader br = new BufferedReader(r);
		String x = "";
		while ((x = br.readLine()) != null) {
			System.out.println(x);
	}

	}

}
