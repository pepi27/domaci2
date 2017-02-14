package paket1;

import java.util.ArrayList;
import java.util.List;

public class Automobil {
	
	static int idCounter;

	private int id, godiste;
	private double cena;
	private String naziv;
	private ArrayList<String> oprema = new ArrayList<String>();
	private Model model; 

	Automobil() {
		idCounter++;
		id = idCounter;
		
	}

	public int getId() {
		return id;
	}

	public int getGodiste() {
		return godiste;
	}

	public void setGodiste(int godiste) {
		this.godiste = godiste;
	}

	public double getCena() {
		return cena;
	}

	public void setCena(double cena) {
		this.cena = cena;
	}

	public String getNaziv() {
		return naziv;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}

	public List<String> getOprema() {
		return oprema;
	}

	public void setOprema(ArrayList<String> oprema) {
		this.oprema = oprema;
	}

	public Model getModel() {
		return model;
	}

	public void setModel(Model model) {
		this.model = model;
	}


}
