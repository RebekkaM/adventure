package adventure_westphal_540707;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {

	private static Raum raum = new Raum();

	public static void main(String [] args) throws IOException {
		einlesen();
		System.out.println(RaumSpeicher.getAlleRaume());
    }
	
	private static void einlesen() throws IOException {
		int[] raumInt = new int[5];
		BufferedReader br = new BufferedReader(new FileReader("./src/Raumaufbau.txt"));
	    br.readLine(); /* Überschrift wird eingelesen und nichts damit gemacht */
		for (String line; (line = br.readLine()) != null;) {
	        String raumString[] = line.split(":");
	        for(int i = 0; i < raumString.length; ++i){raumInt[i] = Integer.parseInt(raumString[i]);}
	        raum.setRaum(raumInt);
	        RaumSpeicher.save(raum);
		}
	}
}
