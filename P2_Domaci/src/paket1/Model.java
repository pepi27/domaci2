package paket1;

public class Model {

	private int id; 
	private String nazivModela;
	
	
	static int idCounter;
	
	public Model() {
		idCounter++;
		id = idCounter;
		
	}
	
	public String getNazivModela() {
		return nazivModela;
	}

	public void setNazivModela(String nazivModela) {
		this.nazivModela = nazivModela;
	}

	public int getId() {
		return id;
	}
	
}
