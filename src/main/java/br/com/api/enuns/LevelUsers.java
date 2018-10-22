package br.com.api.enuns;

public enum LevelUsers {

	F("free"),
	B("basico"),
	P("premium"),
	A("administrator");
	
	private String levelUser;
	
	 LevelUsers (String levelUser) {
		this.levelUser = levelUser;
	}
	 
	 private String getLevelUser() {
		 return this.levelUser;
	 }
}
