package paket1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

import paket1.Automobil;

public class Test {
	
	static ArrayList<Automobil> oglas = new ArrayList<Automobil>();
	static ArrayList<Model> modeli = new ArrayList<Model>();


	public static void main(String[] args) {
		
		Model m1 = new Model();
		m1.setNazivModela("Dzip");
		Model m2 = new Model();
		m2.setNazivModela("Karavan");
		Model m3 = new Model();
		m3.setNazivModela("Limuzina");
		
		modeli.add(m1);
		modeli.add(m2);
		modeli.add(m3);
		
		Automobil a1 = new Automobil();
		a1.setNaziv("Opel");
		a1.setCena(1000);
		a1.setGodiste(1985);
		a1.getOprema().add("cd");
		a1.getOprema().add("dvd");
		a1.getOprema().add("alarm");
		a1.getOprema().add("ac");
		a1.getOprema().add("eps");
        a1.setModel(m1);		

		Automobil a2 = new Automobil();
		a2.setNaziv("Bmw");
		a2.setCena(15200);
		a2.setGodiste(2011);
		a2.getOprema().add("alarm");
		a2.getOprema().add("airbag");
		a2.getOprema().add("klima");
		a2.getOprema().add("esp");
		a2.getOprema().add("gps");
		a2.setModel(m2);

		Automobil a3 = new Automobil();
		a3.setNaziv("Toyota");
		a3.setCena(8900);
		a3.setGodiste(2011);
		a3.getOprema().add("esp");
		a3.getOprema().add("parking");
		a3.getOprema().add("felne");
		a3.getOprema().add("zimske gume");
		a3.getOprema().add("dvd");
		a3.setModel(m3);

		Automobil a4 = new Automobil();
		a4.setNaziv("Audi");
		a4.setGodiste(2014);
		a4.setCena(32750);
		a4.getOprema().add("alarm");
		a4.getOprema().add("airbag");
		a4.getOprema().add("gps");
		a4.getOprema().add("auto-pilot");
		a4.getOprema().add("parking senzor");
		a4.setModel(m2);
		
		Automobil a5 = new Automobil();
		a5.setNaziv("Honda");
		a5.setGodiste(2014);
		a5.setCena(27800);
		a5.getOprema().add("dvd");
		a5.getOprema().add("maglenke");
		a5.getOprema().add("tempomat");
		a5.getOprema().add("putni racunar");
		a5.getOprema().add("proximity sensor");
		a5.setModel(m3);

		oglas.add(a1);
		oglas.add(a2);
		oglas.add(a3);
		oglas.add(a4);
		oglas.add(a5);

		// Glavni loop
		int menuItem = -1;

		while (menuItem != 0) {
			menuItem = menu();
			switch (menuItem) {
			case 1:
				prikaziSveOglase();
				break;
			case 2:
				filterGodina();
				break;
			case 3:
				prikaziOglasDetaljno();
				break;
			case 4:
				izmenaOglasa();
				break;
			case 5:
				filterCena();
				break;
			case 6:
				filterOprema();
				break;
			case 7:
				izmeniOpremu();
				break;
			case 8:
				dodajOpremu();
				break;
			case 9:
				izlistajModele();
				break;
			case 0:
				break;
			default:
				System.out.println("Nepostojeci unos.");
				break;
			}
		}

	}

	// Funkcija broj 9
	private static void izlistajModele() {
		for (Automobil auto : oglas) {
			
				System.out.println(
						auto.getId() + " " + auto.getNaziv() + " " + auto.getGodiste() + " " + auto.getCena() + " e - " + auto.getModel().getNazivModela());
			
		}
		
	}

	// Ako je izbor broj 1
	private static void prikaziSveOglase() {
		System.out.println("\n## Svi oglasi ##\n");
		for (Automobil auto : oglas) {
			System.out.println(auto.getId() + " " + auto.getNaziv() + " " + auto.getCena() + " e");
		}
	}

	// Funkcija broj 2
	private static void filterGodina() {
		System.out.println("\n## Filter po godini ##");
		Set<Integer> set = new HashSet<Integer>();
		for (Automobil auto : oglas) {
			set.add(auto.getGodiste());
		}

		int izbor;
		Scanner input = new Scanner(System.in);
		System.out.println();
		System.out.println("Odaberite jedno od godista: " + set);
		izbor = input.nextInt();

		if (!set.contains(izbor)) {
			System.out.println("Ne postoji navedeno godiste");
		} else {
			for (Automobil auto : oglas) {
				if (auto.getGodiste() == izbor)
					System.out.println(auto.getId() + " " + auto.getNaziv() + " " + auto.getGodiste() + " "
							+ auto.getCena() + " e");
			}
		}

	}

	// Funkcija broj 3
	private static void prikaziOglasDetaljno() {

		System.out.println("\n## Svi oglasi - Detaljan prikaz ##\n");
		for (Automobil auto : oglas) {
			System.out.println(auto.getId() + " " + auto.getNaziv() + " " + auto.getCena() + " e");
		}
		int izbor;
		Scanner input = new Scanner(System.in);
		System.out.println();
		System.out.println("Prikazi detaljan prikaz za oglas broj: ");
		izbor = input.nextInt();

		for (Automobil auto : oglas) {
			if (auto.getId() != izbor)
				continue;
			else
				System.out.println(auto.getId() + " " + auto.getNaziv() + " " + auto.getCena() + " e "
						+ auto.getOprema() + " " + auto.getModel().getNazivModela());
		}

	}

	// Funkcija broj 4
	private static void izmenaOglasa() {
		System.out.println("\n## Izmeni oglas ##\n");
		int izbor;
		Scanner input = new Scanner(System.in);
		System.out.println("1.Izmeni kategoriju");
		System.out.println("2.Izmeni opremu");
		System.out.println("3.Dodaj oglas");
		System.out.println("4.Ukloni oglas");
		System.out.println("5.Izmeni model");
		System.out.println("6.Dodaj Model");
		System.out.println("7.Ukloni Model");
		izbor = input.nextInt();
		switch (izbor) {
		case 1:
			function_4_1();
			break;
		case 2:
			function_4_2();
			break;
		case 3:
			dodajOglas();
			break;
		case 4:
			ukloniOglas();
			break;
		case 5:
			izmeniModel();
			break;
		case 6:
			dodajModel();
			break;
		case 7:
			ukloniModel();
			break;
			
		default:
			System.out.println("Nepostojeca naredba.");
			break;
		}

	}

	private static void ukloniModel() {
		System.out.println("\n## Ukloni model ##\n");
		System.out.println("Trenutni modeli : ");
		for(Model m : modeli) {
			System.out.println(m.getId() + ". " + m.getNazivModela());
		}
		System.out.println("\nOvde upisati broj modela za uklanjanje : ");
		Scanner input = new Scanner(System.in);
		int izbor = input.nextInt();
		
		Iterator<Model> itr = modeli.iterator();
		while (itr.hasNext()) {
		    Model model = itr.next();
		    if (model.getId() == izbor)
		    {
		    	itr.remove();
		    	System.out.println("Novi model sa nazivom " + model.getNazivModela() + " je uspesno uklonjen");
		    }
		} 
	}

	private static void dodajModel() {
		System.out.println("\n## Dodaj novi model ##\n");
		System.out.println("Trenutni modeli : ");
		for(Model m : modeli) {
			System.out.println(m.getNazivModela());
		}
		System.out.println("\nOvde upisati novi model : ");
		Scanner input = new Scanner(System.in);
		String noviModel = input.nextLine();
		
		Model mGen = new Model();
		mGen.setNazivModela(noviModel);
		modeli.add(mGen);
		System.out.println("Novi model sa nazivom " + mGen.getNazivModela() + " je uspesno dodat");
		
	}

	private static void izmeniModel() {
		System.out.println("\n## Izmeni model odredjenog automobila ##\n");
		System.out.println("Odaberi broj modela za izmenu : \n");
		for(Automobil auto : oglas) {
			System.out.println(auto.getId() + ". " + auto.getNaziv() + " " + auto.getCena() + " " + auto.getGodiste() + " " + auto.getModel().getNazivModela());
		}
		int izbor;
		Scanner input = new Scanner(System.in);
		izbor = input.nextInt(); 
		
		for(Automobil auto : oglas) {

			if(izbor != auto.getId()) 
				continue;
			else {
				System.out.println("Promeni model " + izbor);
				System.out.println("Zameni sa modelom broj : \n");
				
				for(Model model : modeli) {
					System.out.println(model.getId() + ". " + model.getNazivModela());
				}

				Scanner input2 = new Scanner(System.in);
				int izbor2 = input2.nextInt(); 
				auto.setModel(modeli.get(izbor2-1));
			}
		}

	}

	// Funkcija broj 5
	private static void filterCena() {
		System.out.println("\n## Filter po ceni ##\n");
		int izbor;
		Scanner input = new Scanner(System.in);
		System.out.println("1.Cena od-do");
		System.out.println("2.Cena veca od ");
		System.out.println("3.Cena manja od ");

		izbor = input.nextInt();

		switch (izbor) {
		case 1:
			function_5_1();
			break;
		case 2:
			function_5_2();
			break;
		case 3:
			function_5_3();
			break;
		default:
			System.out.println("Nepostojeca komanda.");
			break;
		}

	}

	// Funkcija broj 6
	private static void filterOprema() {
		System.out.println("\n## Pretrazi po opremi ##\n");
		Set<String> set = new HashSet<String>();

		System.out.println("Odaberite jedan od pojmova: ");
		for (Automobil auto : oglas) {
			for (int i = 0; i < auto.getOprema().size(); i++)
				set.add(auto.getOprema().get(i));
		}

		System.out.println(set);

		Scanner input = new Scanner(System.in);
		String match = input.nextLine();
		for (Automobil auto : oglas) {
			for (int i = 0; i < auto.getOprema().size(); i++)
				if(match.equalsIgnoreCase(auto.getOprema().get(i)))
					System.out.println(auto.getNaziv() + " " + auto.getOprema());
		}
		
	}

	// Funkcija broj 7
	private static void izmeniOpremu() {
		System.out.println("\n## Izmeni kompletnu opremu ##\n");
		
		int izbor;
		Scanner input = new Scanner(System.in);
		for (Automobil auto : oglas) {
			System.out.println(
					auto.getId() + ". " + auto.getNaziv() + " " + auto.getGodiste() + " " + auto.getCena() + " e");

		}

		System.out.println("\nOdaberite broj modela za izmenu opreme: ");
		izbor = input.nextInt();
		for (Automobil auto : oglas) {
			if (auto.getId() != izbor) {
				continue;
			} else {
				System.out.println("Unesite novu opremu i potvrdite, za prekid unesite 0");
				Scanner inputOprema = new Scanner(System.in);
				ArrayList<String> komplet = new ArrayList<>();
				String oprema = ""; 
				
				while(!oprema.equals("0")) {
					oprema = inputOprema.nextLine();
					if(oprema.equals("0"))
						continue;
					komplet.add(oprema);
					System.out.println("Ubaceno " + oprema);
				}

				auto.setOprema(komplet);

			}
		}
	}

	// Dugme broj 8
	private static void dodajOpremu() {
		System.out.println("\n## Dodaj opremu ##\n");
		
		int izbor;
		String novaOprema; 
		Scanner input = new Scanner(System.in);
		Scanner inputOprema = new Scanner(System.in);

		for (Automobil auto : oglas) {
			System.out.println(
					auto.getId() + ". " + auto.getNaziv() + " " + auto.getGodiste() + " " + auto.getCena() + " e");
		}

		System.out.println("\nOdaberite broj modela za dodavanje opreme: ");
		izbor = input.nextInt();
		for (Automobil auto : oglas) {
			if (auto.getId() != izbor) {
				continue;
			} else {
				System.out.println("Trenutna oprema : " + auto.getOprema());
				System.out.println("\nUnesite dodatnu opremu i potvrdite");
				novaOprema = inputOprema.nextLine();
				
				auto.getOprema().add(novaOprema);
				
				System.out.println("Trenutna oprema : " + auto.getOprema());
				
			}
		}	
	}

	// Funkcija 4.1
	private static void function_4_1() {

		int izbor;
		Scanner input = new Scanner(System.in);
		for (Automobil auto : oglas) {
			System.out.println(
					auto.getId() + ". " + auto.getNaziv() + " " + auto.getGodiste() + " " + auto.getCena() + " e");

		}

		System.out.println("\nOdaberite broj modela za izmenu: ");
		izbor = input.nextInt();

		for (Automobil auto : oglas) {
			if (auto.getId() != izbor) {
				continue;
			} else {
				System.out.println("1.Izmeni naslov");
				System.out.println("2.Izmeni cenu");
				System.out.println("3.Izmeni godiste");
				int noviIzbor;
				Scanner input2 = new Scanner(System.in);
				noviIzbor = input2.nextInt();
				switch (noviIzbor) {
				case 1:
					System.out.println("Unesite novi naslov");
					Scanner inputNaslov = new Scanner(System.in);
					String novNaslov = inputNaslov.nextLine();
					auto.setNaziv(novNaslov);
					break;
				case 2:
					System.out.println("Unesite novu cenu");
					Scanner inputCena = new Scanner(System.in);
					double novaCena = inputCena.nextDouble();
					auto.setCena(novaCena);
					break;
				case 3:
					System.out.println("Unesite novo godiste");
					Scanner inputGod = new Scanner(System.in);
					int novoGod = inputGod.nextInt();
					auto.setGodiste(novoGod);
					break;
				default:
					System.out.println("Nepoznata komanda");
					break;

				}
			}

		}
	}

	// Funkcija 4.2
	private static void function_4_2() {
		int izbor;
		Scanner input = new Scanner(System.in);
		for (Automobil auto : oglas) {
			System.out.println(auto.getId() + ". " + auto.getNaziv() + " " + auto.getOprema());

		}

		System.out.println("\nOdaberite broj modela za izmenu: ");
		izbor = input.nextInt();
		input.nextLine();

		for (Automobil auto : oglas) {
			if (auto.getId() != izbor) {
				continue;
			} else {
				// Ovde bi verovatno mogao neki loop -- while getOprema[].length
				// < 5 --
				Scanner input2 = new Scanner(System.in);
				System.out.println("Unesite novu opremu: ");
				auto.getOprema().clear();
				for(int i = 0; i < 5; i++) {
					auto.getOprema().add(i, input.nextLine());
				}
			}
		}
	}
	
	// Funkcija 4.3
	private static void ukloniOglas() {
		
		int izbor;
		Scanner input = new Scanner(System.in);
		for (Automobil auto : oglas) {
			System.out.println(auto.getId() + ". " + auto.getNaziv() + " " + auto.getGodiste() + " " + auto.getCena() + " e");

		}

		System.out.println("\n## Brisanje oglasa ##");
		System.out.println("\nOdaberite broj modela za brisanje: ");
		izbor = input.nextInt();

		
		Iterator<Automobil> itr = oglas.iterator();
		while (itr.hasNext()) {
		    Automobil auto = itr.next();
		    if (auto.getId() == izbor)
		    {
		    	int podIzbor;
				System.out.println("Da li ste sigurni da zelite da obrisete oglas ?\n");
				System.out.println("1.Da");
				System.out.println("2.Ne");
                podIzbor = input.nextInt();				
                
                if(podIzbor == 1)
                	itr.remove();
                else 
                	return; 
		    }
		}
	}

	// Funkcija 4.4 
	private static void dodajOglas() {
		System.out.println("\n## Dodaj novi oglas ##\n");
		
		System.out.println("Unesite model vozila : " );
		int i = 0;
		for(Model m : modeli) {
			++i;
			System.out.println(i +"." + m.getNazivModela());
		}

		Scanner inputModel = new Scanner(System.in);
		int izbor = inputModel.nextInt();
		
		System.out.println("Unesite naslov vozila: ");
		Scanner inputNaslov = new Scanner(System.in);
		String naslov = inputNaslov.nextLine();
		
		System.out.println("Unesite godiste vozila: ");
		Scanner inputGodiste = new Scanner(System.in);
		int godiste = inputGodiste.nextInt();
		//inputGodiste.nextLine();
		
		System.out.println("Unesite cenu vozila: ");
		Scanner inputCena = new Scanner(System.in);
		double cena = inputCena.nextDouble();
		inputCena.nextLine();
		
		System.out.println("Unesite opremu koje vozilo poseduje: ");
		Scanner inputOprema = new Scanner(System.in);
		String oprema = inputCena.nextLine();
		
		Automobil generic = new Automobil();
		
		generic.setModel((modeli.get(izbor-1)));
		generic.setNaziv(naslov);
		generic.setGodiste(godiste);
		generic.setCena(cena);
		generic.getOprema().add(oprema);
		
		oglas.add(generic);
		
		System.out.println("\n Vozilo uspesno uneto");
		
	}
	
	
	// Funkcija 5.1
	private static void function_5_1() {
		System.out.println("Unesite donju granicu: ");
		Scanner inLowCost = new Scanner(System.in);
		double low = inLowCost.nextDouble();
		System.out.println("Unesite gornju granicu: ");
		Scanner inHighCost = new Scanner(System.in);
		double high = inHighCost.nextDouble();

		for (Automobil auto : oglas) {
			if (auto.getCena() >= low && auto.getCena() <= high) {
				System.out.println(
						auto.getId() + " " + auto.getNaziv() + " " + auto.getGodiste() + " " + auto.getCena() + " e");
			}
		}
	}

	// Funkcija 5.2
	private static void function_5_2() {
		System.out.println("Unesite minimalnu cenu vozila: ");
		Scanner input = new Scanner(System.in);
		double cena = input.nextDouble();

		for (Automobil auto : oglas) {
			if (auto.getCena() >= cena) {
				System.out.println(
						auto.getId() + " " + auto.getNaziv() + " " + auto.getGodiste() + " " + auto.getCena() + " e");
			}
		}

	}

	// Funkcija 5.3
	private static void function_5_3() {
		System.out.println("Unesite maksimalnu cenu vozila: ");
		Scanner input = new Scanner(System.in);
		double cena = input.nextDouble();

		for (Automobil auto : oglas) {
			if (auto.getCena() <= cena) {
				System.out.println(
						auto.getId() + " " + auto.getNaziv() + " " + auto.getGodiste() + " " + auto.getCena() + " e");
			}
		}
	}

	// Funkcija menu koja vraca izbor nazad u loop
	private static int menu() {

		int choice;
		Scanner input = new Scanner(System.in);
		System.out.println("\n## Glavni Meni ##\n");
		System.out.println("0. Ugasiti program");
		System.out.println("1. Prikaz svih oglasa");
		System.out.println("2. Ispis oglasa po godini proizvodnje");
		System.out.println("3. Ispis oglasa detaljno");
		System.out.println("4. Izmene po oglasima");
		System.out.println("5. Ispis oglasa po ceni");
		System.out.println("6. Ispis oglasa po opremi");
		System.out.println("7. Izmeni opremu");
		System.out.println("8. Dodaj Opremu");
		System.out.println("9. Izlistaj modele");
		System.out.println();
		System.out.println("Unesite izbor: ");

		if (input.hasNextInt()) {
			choice = input.nextInt();

		} else {
			System.out.println("\nMorate uneti broj.");
			choice = -1;
		}

		return choice;
	}

}

