package us.noop.fish;

public class Fish {
	
	public String commonName;
	public String scientificName;
	public String continents;
	public String bodytype;
	public String fwater;
	public String imgurl;
	public static int fid = 0;
	public int pid;
	
	public Fish(String c, String s, String co, String b, String f, String i){
		commonName = c;
		scientificName = s;
		continents = co;
		bodytype = b;
		fwater = f;
		imgurl = i;
		pid = fid;
		fid++;
	}
}
