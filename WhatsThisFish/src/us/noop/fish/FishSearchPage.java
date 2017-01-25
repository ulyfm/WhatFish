package us.noop.fish;

import java.util.ArrayList;
import java.util.Arrays;

import us.noop.server.pages.Page;
import us.noop.server.response.RequestData;

public class FishSearchPage implements Page {

	@Override
	public byte[] getResponse(RequestData req) {
		StringBuilder sb = new StringBuilder();
		String[] a = req.getAddress().split("/");
		ArrayList<Fish> fishes = FishData.me.getResults(a[2], a[3], a[4]);
		sb.append(
				"<!DOCTYPE html><html><head><title>Search Results</title>" + 
		"<link rel='stylesheet' type='text/css' href='/fish.css'>" +
		"<link href='https://fonts.googleapis.com/css?family=Alegreya' rel='stylesheet'></head><body>" +
		"<h1><img src='/drivingthattrainhighoncocaine.svg' id='logo'><span id='title'>What's This Fish?</span></h1>");
		if(fishes.size() > 0){
			for(Fish f : fishes){
				sb.append("<h2>" + f.commonName + "</h2>" +
					"<i>" + f.scientificName + "</i>" + 
					"<img src='" + f.imgurl + "'></img>" +
					"<br><br>"
				);
			}
		}else{
			sb.append("<h1>You Have Found a New Fish!</h1>");
		}
		sb.append("</body></html>");
		return sb.toString().getBytes();
	}

	@Override
	public String getAddress() {
		return "/search/";
	}

	@Override
	public String mimeType() {
		return "text/html";
	}

}
