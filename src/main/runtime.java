package main;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

import main.shredder.main.shred;


public class runtime {
	String readString(InputStream is) throws IOException {
		  char[] buf = new char[2048];
		  Reader r = new InputStreamReader(is, "UTF-8");
		  StringBuilder s = new StringBuilder();
		  while (true) {
		    int n = r.read(buf);
		    if (n < 0)
		      break;
		    s.append(buf, 0, n);
		  }
		  return s.toString();
		}
	public void internrt() throws IOException {
		System.out.println(readString(getClass().getResourceAsStream("/main/welcome.txt")));
	}
	public static void main(String[] args) {
		try {
			new runtime().internrt();
		}catch(Exception e) {
			e.printStackTrace();
		}
		new shred().mainapp(args);
	}
}
