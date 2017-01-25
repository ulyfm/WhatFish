var earl = "/search/";
function continent(num){
	earl = earl + num + "/";
	document.getElementById("continentquestion").style.display = "none";
	document.getElementById("bodyquestion").style.display = "block";
}
function bodyset(num){
	earl = earl + num + "/";
	document.getElementById("bodyquestion").style.display = "none";
	document.getElementById("freshwater").style.display = "block";
}
function water(cha){
	window.location = earl + cha;
}