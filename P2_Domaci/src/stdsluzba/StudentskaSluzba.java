package stdsluzba;

import java.util.ArrayList;

public class StudentskaSluzba {

	public static void main(String[] args) {
		
		ArrayList<Integer> nastavniciIdentifikatori = new ArrayList<Integer>();
		ArrayList<String> nastavniciImena = new ArrayList<String>();
		ArrayList<String> nastavniciPrezimena = new ArrayList<String>();
		ArrayList<String> nastavniciZvanje = new ArrayList<String>();
		
		ArrayList<Integer> studentiIdentifikatori = new ArrayList<Integer>();
		ArrayList<String> studentiIndexi = new ArrayList<String>();
		ArrayList<String> studentiImena = new ArrayList<String>();
		ArrayList<String> studentiPrezimena = new ArrayList<String>();
		ArrayList<String> studentiGrad = new ArrayList<String>();

		//Sadrzaj csv fajla koji cuva podatke o studentima i njihovim ocenama
			String textStudenti = "1,E1 01/2011,Srđanov,Konstantin,Loznica\n"
							    + "2,E1 02/2012,Baki,Strahinja,Novi Sad\n"
							    + "3,E1 03/2013,Trajković,Nebojša,Inđija\n"
							    + "4,E2 01/2011,Sekulić,Miloš,Vršac\n"
							    + "5,E2 02/2012,Askin,Vuk,Novi Sad\n"
							    + "6,E2 03/2013,Kalinić,Marko,Sombor\n"
							    + "7,E2 04/2011,Marko,Panić,Zrenjanin"; 	  
			
			String textProfesori = "1,Petar,Petrović,Docent\n"
					             + "2,Jovan,Jovanović,Docent\n"
					             + "3,Marko,Marković,Asistent\n"
					             + "4,Nikola,Nikolić,Redovni Profesor\n"
					             + "5,Lazar,Lazić,Asistent";
			
			String predmeti =      "1,Matematika\n"
					             + "2,Fizika\n"
					             + "3,Elektrotehnika\n"
					             + "4,Informatika";
			
			String[] sviRedoviStudent = textStudenti.split("\n"); 
			String[] sviRedoviProfesor = textProfesori.split("\n"); 
			String[] sviRedoviPredmet = predmeti.split("\n");
			
			//pod 1
			System.out.println("1. U\u010Ditaj podatke");
			ucitajPodatkeNastavnik(sviRedoviProfesor, nastavniciIdentifikatori, nastavniciImena, nastavniciPrezimena, nastavniciZvanje);
			ucitajPodatkeStudenata(sviRedoviStudent, studentiIdentifikatori, studentiIndexi, studentiImena, studentiPrezimena, studentiGrad);
			
			//pod 2
			System.out.println("\n\n2. Ispi\u0161i sve podatke");
			ispisiSvePodatkeNastavnika(nastavniciIdentifikatori, nastavniciImena, nastavniciPrezimena, nastavniciZvanje);
			ispisiSvePodatkeStudenta(studentiIdentifikatori, studentiIndexi, studentiImena, studentiPrezimena, studentiGrad);
			ispisiSveStudenteSaSmeraE2(studentiImena, studentiPrezimena, studentiIndexi);
		
	}
	
	public static void ucitajPodatkeNastavnik(String [] sviRedoviProfesor, ArrayList<Integer> nastavniciIdentifikatori, 
			ArrayList<String> nastavniciImena, ArrayList<String> nastavniciPrezimena, 
			ArrayList<String> nastavniciZvanje){
		
		System.out.println("\n\nNASTAVNICI---------------------------------");
		for (int i = 0; i < sviRedoviProfesor.length; i++) {
			System.out.println("\n************************************");
			System.out.println("Red ->" + sviRedoviProfesor[i]);
			
			String [] nastavnikPodaciTekst = sviRedoviProfesor[i].split(",");
//			System.out.println("Preuzimanje i ispis podataka o nastavniku");
			
			nastavniciIdentifikatori.add(Integer.parseInt(nastavnikPodaciTekst[0]));
			nastavniciImena.add(nastavnikPodaciTekst[1]);
			nastavniciPrezimena.add(nastavnikPodaciTekst[2]);
			nastavniciZvanje.add(nastavnikPodaciTekst[3]);
		}
		
		
		
	}
	public static void ispisiSvePodatkeNastavnika(ArrayList<Integer> nastavniciIdentifikatori, 
			ArrayList<String> nastavniciImena, ArrayList<String> nastavniciPrezimena, 
			ArrayList<String> nastavniciZvanje) {
		
		System.out.println("\n\nNASTAVNICI---------------------------------");
		for (int i = 0; i < nastavniciIdentifikatori.size(); i++) {
			System.out.println("Nastavnik " + nastavniciImena.get(i) + " " + nastavniciPrezimena.get(i) + " sa id " 
					+ nastavniciIdentifikatori.get(i) + " ima zvanje " + nastavniciZvanje.get(i));
		}
	}
	
	public static void ucitajPodatkeStudenata( String[] sviRedoviStudent, ArrayList<Integer> studentiIdentifikatori,
	    ArrayList<String> studentiIndexi, ArrayList<String> studentiImena, 
		ArrayList<String> studentiPrezimena, ArrayList<String> studentiGrad) {
		
		System.out.println("\n\nStudenti---------------------------------");
		for (int i = 0; i < sviRedoviStudent.length; i++) {
			System.out.println("\n************************************");
			System.out.println("Red ->" + sviRedoviStudent[i]);
			
			String [] studentPodaciTekst = sviRedoviStudent[i].split(",");
			
			studentiIdentifikatori.add(Integer.parseInt(studentPodaciTekst[0]));
			studentiIndexi.add(studentPodaciTekst[1]);
			studentiImena.add(studentPodaciTekst[2]);
			studentiPrezimena.add(studentPodaciTekst[3]);
			studentiGrad.add(studentPodaciTekst[4]);
		}
	}
	
	public static void ispisiSvePodatkeStudenta(ArrayList<Integer> studentiIdentifikatori, 
			ArrayList<String> studentiIndexi, ArrayList<String> studentiImena, 
			ArrayList<String> studentiPrezimena, ArrayList<String> studentiGrad) {
		
		System.out.println("\n\nStudenti---------------------------------");
		for (int i = 0; i < studentiIdentifikatori.size(); i++) {
			System.out.println("Student " + studentiImena.get(i) + " " + studentiPrezimena.get(i) + " sa id " 
					+ studentiIdentifikatori.get(i) + " ima broj indeksa " + studentiIndexi.get(i) + " rodjen je u " + studentiGrad.get(i));
		}
	}
	
	public static void ispisiSveStudenteSaSmeraE2(ArrayList<String> studentiImena, ArrayList<String> studentiPrezimena, ArrayList<String> pocetnaSlovaPredmeta) {
		System.out.println("\n\nStudenti sa smera Racunarstvo i Informatika---------------------------------");
		for(int i = 0; i < studentiImena.size(); i++) {
			if(pocetnaSlovaPredmeta.get(i).startsWith("E2"))
				System.out.println("Student " + studentiImena.get(i) + " " + studentiPrezimena.get(i) + " studira smer RII." );
		}
	}
}
