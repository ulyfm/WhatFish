package us.noop.fish;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class FishData {
	
	private ArrayList<Fish> data = new ArrayList<Fish>();
	public static FishData me;
	public FishData(){
		me = this;
		try {
			Scanner sc = new Scanner(new File("fishdata.tsv"));
			sc.nextLine();
			while(sc.hasNextLine()){
				String[] str = sc.nextLine().split("\t");
				Fish f = new Fish(str[0], str[1], str[2], str[3], str[4], str[5]);
				data.add(f);
			}
			sc.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public ArrayList<Fish> getResults(String continent, String bodytype, String freshwater){
		ArrayList<Fish> ar = new ArrayList<Fish>();
		int i = 0;
		for(Fish f : data){
			if(f.bodytype.equals(bodytype) && f.continents.contains(continent) && (f.fwater.equals("b") || f.fwater.equals(freshwater))){
				ar.add(f);
			}
			i++;
		}
		return ar;
	}
}
