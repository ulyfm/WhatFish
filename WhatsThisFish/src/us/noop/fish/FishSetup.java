package us.noop.fish;

import java.io.File;

import us.noop.server.Main;
import us.noop.server.Server;
import us.noop.server.ServerSetup;
import us.noop.server.pages.StaticFilePage;

public class FishSetup implements ServerSetup {
	private Main main;
	public FishSetup(Main m){
		main = m;
	}
	@Override
	public void setUpServer(Server s) {
		FishData fd = new FishData();
		s.addPage(new FishSearchPage());
		s.addPage(new StaticFilePage(main, "/drivingthattrainhighoncocaine.svg", new File("drivingthattrainhighoncocaine.svg"), "image/svg+xml"));
		s.addPage(new StaticFilePage(main, "/fish.css", new File("fish.css"), "text/css"));
		s.addPage(new StaticFilePage(main, "/fish.js", new File("fish.js"), "application/javascript"));
		s.addPage(new StaticFilePage(main, "/index.html", new File("index.html"), "text/html"));
		s.addPage(new StaticFilePage(main, "/", new File("index.html"), "text/html"));
		s.addPage(new StaticFilePage(main, "/continents.gif", new File("continents.gif"), "image/gif"));
		s.addPage(new StaticFilePage(main, "/bluefish.png", new File("bodytypes/bluefish.png"), "image/png"));
		s.addPage(new StaticFilePage(main, "/BWSorubim.png", new File("bodytypes/BWSorubim.png"), "image/png"));
		s.addPage(new StaticFilePage(main, "/flounder_summer.png", new File("bodytypes/flounder_summer.png"), "image/png"));
		s.addPage(new StaticFilePage(main, "/marlin_blue.png", new File("bodytypes/marlin_blue.png"), "image/png"));
		s.addPage(new StaticFilePage(main, "/shark_mako.png", new File("bodytypes/shark_mako.png"), "image/png"));
		s.addPage(new StaticFilePage(main, "/trevally_giant.png", new File("bodytypes/trevally_giant.png"), "image/png"));
	}

}
