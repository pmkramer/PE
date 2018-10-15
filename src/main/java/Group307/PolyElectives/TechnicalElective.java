package Group307.PolyElectives;

public class TechnicalElective {
	private String title, description, language = "java";
	private long kind = 0; 
	
	TechnicalElective() {
		
	}
	
	TechnicalElective(String t, String d) {
		title = t;
		description = d;
	}
	
	public String getTitle() {
		return title;
	}
	
	public String getDescr() {
		return description;
	}
	
	public String getLang() {
		return language;
	}
	
	public long getKind() {
		return kind;
	}
	
	
	
}
