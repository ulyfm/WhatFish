package us.noop.fish;

import us.noop.server.Main;

public class FishStart {
	public static void main(String... args){
		Main m = null;
		FishSetup fs = new FishSetup(m);
		m = new Main(fs);
		m.start();
	}
}
