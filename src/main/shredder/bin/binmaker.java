package main.shredder.bin;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Random;

public class binmaker {
	Random rd = new Random();
	void repran(File file) {
		try {
			byte[] fileContent = Files.readAllBytes(file.toPath());
			rd.nextBytes(fileContent);
			consolelog("Shredfile:\t" + file.toPath());
			Files.write(file.toPath(), fileContent);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	void consolelog(String tolog) {
		System.out.println(tolog);
	}
	public void compfile(String arg) {
		File file = new File(arg);
		if(file.exists()) {
			consolelog("Proceed:\t" + file.toPath());
			try {
				repran(file);
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else {
			consolelog("File \"" + file.toPath() +"\" does not exist!");
			return;
		}
	}
}
