package main.shredder.main;
import main.shredder.bin.binmaker;
public class shred {
	
	public void mainapp(String[] args) {
		binmaker hi = new binmaker();
		for (String arg : args) {
			hi.compfile(arg);
		}
	}
}
