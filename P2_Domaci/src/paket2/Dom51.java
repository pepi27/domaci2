package paket2;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Dom51 {

	public static void main(String[] args) throws ParseException {

		String[][][] raspored = new String[3][][];
		raspored[0] = new String[8][8]; // ponedeljak 8 predavanja
		raspored[1] = new String[4][8]; // utorak 4 predavanja
		raspored[2] = new String[6][8]; // sreda 6 predavanja

		String[] kabinetiPon = new String[raspored[0].length];
		String[] predavaciPon = new String[raspored[0].length];
		int[] odSatPon = new int[raspored[0].length];
		int[] doSatPon = new int[raspored[0].length];
		String[] vremePocetakSat = new String[raspored[0].length];
		String[] vremePocetakMin = new String[raspored[0].length];
		String[] vremeKrajSat = new String[raspored[0].length];
		String[] vremeKrajMin = new String[raspored[0].length];
		String[] vremeOdPon = new String[raspored[0].length];
		String[] vremeDoPon = new String[raspored[0].length];

		// String time = "15:30";
		// DateFormat sdf = new SimpleDateFormat("hh:mm");
		// Date date = sdf.parse(time);
		// System.out.println("Time: " + sdf.format(date));

		String[] kabinetiUto = new String[raspored[1].length];
		String[] predavaciUto = new String[raspored[1].length];
		int[] odSatUto = new int[raspored[1].length];
		int[] doSatUto = new int[raspored[1].length];
		String[] vremePocetakSatUto = new String[raspored[1].length];
		String[] vremePocetakMinUto = new String[raspored[1].length];
		String[] vremeKrajSatUto = new String[raspored[1].length];
		String[] vremeKrajMinUto = new String[raspored[1].length];
		String[] vremeOdUto = new String[raspored[1].length];
		String[] vremeDoUto = new String[raspored[1].length];

		String[] kabinetiSre = new String[raspored[2].length];
		String[] predavaciSre = new String[raspored[2].length];
		int[] odSatSre = new int[raspored[2].length];
		int[] doSatSre = new int[raspored[2].length];

		int pauzaMin = 15;
		int loznicaSat = 3;

		// PONEDELJAK
		// Ponedeljak predavanje 1.
		raspored[0][0][0] = "L6";
		raspored[0][0][1] = "Zeljko Vukovic";
		raspored[0][0][2] = "7";
		raspored[0][0][3] = "00";
		raspored[0][0][4] = "8";
		raspored[0][0][5] = "30";
		raspored[0][0][6] = "Internet mreze";
		raspored[0][0][7] = "Novi Sad";

		// PONEDELJAK
		// Ponedeljak predavanje 2.
		raspored[0][1][0] = "MI2";
		raspored[0][1][1] = "Zeljko Vukovic";
		raspored[0][1][2] = "9";
		raspored[0][1][3] = "45";
		raspored[0][1][4] = "11";
		raspored[0][1][5] = "15";
		raspored[0][1][6] = "Internet mreze";
		raspored[0][1][7] = "Novi Sad";

		// PONEDELJAK
		// Ponedeljak predavanje 3.
		raspored[0][2][0] = "L6";
		raspored[0][2][1] = "Sinisa Nikolic";
		raspored[0][2][2] = "17";
		raspored[0][2][3] = "30";
		raspored[0][2][4] = "19";
		raspored[0][2][5] = "00";
		raspored[0][2][6] = "Internet mreze";
		raspored[0][2][7] = "Novi Sad";

		// PONEDELJAK
		// Ponedeljak predavanje 4.
		raspored[0][3][0] = "PC6";
		raspored[0][3][1] = "Aleksandar Kaplar";
		raspored[0][3][2] = "17";
		raspored[0][3][3] = "30";
		raspored[0][3][4] = "20";
		raspored[0][3][5] = "00";
		raspored[0][3][6] = "Web Programiranje";
		raspored[0][3][7] = "Novi Sad";

		// PONEDELJAK
		// Ponedeljak predavanje 5.
		raspored[0][4][0] = "PC5";
		raspored[0][4][1] = "Sinisa Nikolic";
		raspored[0][4][2] = "9";
		raspored[0][4][3] = "45";
		raspored[0][4][4] = "10";
		raspored[0][4][5] = "15";
		raspored[0][4][6] = "Sistemi bazirani na znanju";
		raspored[0][4][7] = "Novi Sad";

		// PONEDELJAK
		// Ponedeljak predavanje 6.
		raspored[0][5][0] = "PC5";
		raspored[0][5][1] = "Sinisa Nikolic";
		raspored[0][5][2] = "15";
		raspored[0][5][3] = "15";
		raspored[0][5][4] = "17";
		raspored[0][5][5] = "45";
		raspored[0][5][6] = "Sistemi bazirani na znanju";
		raspored[0][5][7] = "Novi Sad";

		// PONEDELJAK
		// Ponedeljak predavanje 7.
		raspored[0][6][0] = "K1";
		raspored[0][6][1] = "Aleksandar Kaplar";
		raspored[0][6][2] = "9";
		raspored[0][6][3] = "00";
		raspored[0][6][4] = "11";
		raspored[0][6][5] = "45";
		raspored[0][6][6] = "Web Programiranje";
		raspored[0][6][7] = "Loznica";

		// PONEDELJAK
		// Ponedeljak predavanje 8.
		raspored[0][7][0] = "K2";
		raspored[0][7][1] = "Aleksandar Kaplar";
		raspored[0][7][2] = "12";
		raspored[0][7][3] = "15";
		raspored[0][7][4] = "15";
		raspored[0][7][5] = "00";
		raspored[0][7][6] = "Web Programiranje";
		raspored[0][7][7] = "Loznica";

		// UTORAK
		// Utorak predavanje 1.
		raspored[1][0][0] = "MI2";
		raspored[1][0][1] = "Zeljko Vukovic";
		raspored[1][0][2] = "10";
		raspored[1][0][3] = "30";
		raspored[1][0][4] = "11";
		raspored[1][0][5] = "59";
		raspored[1][0][6] = "Internet Mreze";
		raspored[1][0][7] = "Novi Sad";

		// UTORAK
		// Utorak predavanje 2.
		raspored[1][1][0] = "MI2";
		raspored[1][1][1] = "Valentin Penca";
		raspored[1][1][2] = "9";
		raspored[1][1][3] = "45";
		raspored[1][1][4] = "11";
		raspored[1][1][5] = "15";
		raspored[1][1][6] = "Web Programiranje";
		raspored[1][1][7] = "Novi Sad";

		// UTORAK
		// Utorak predavanje 3.
		raspored[1][2][0] = "PCA";
		raspored[1][2][1] = "Milan Segedinac";
		raspored[1][2][2] = "14";
		raspored[1][2][3] = "45";
		raspored[1][2][4] = "16";
		raspored[1][2][5] = "00";
		raspored[1][2][6] = "XML i Web Servisi";
		raspored[1][2][7] = "Novi Sad";

		// UTORAK
		// Utorak predavanje 4.
		raspored[1][3][0] = "PC3";
		raspored[1][3][1] = "Milan Segedinac";
		raspored[1][3][2] = "16";
		raspored[1][3][3] = "10";
		raspored[1][3][4] = "17";
		raspored[1][3][5] = "30";
		raspored[1][3][6] = "Web Programiranje";
		raspored[1][3][7] = "Novi Sad";

		// SREDA
		// Sreda predavanje 1.
		raspored[2][0][0] = "L6";
		raspored[2][0][1] = "Sinisa Nikolic";
		raspored[2][0][2] = "12";
		raspored[2][0][3] = "30";
		raspored[2][0][4] = "16";
		raspored[2][0][5] = "00";
		raspored[2][0][6] = "Objektno Programiranje";
		raspored[2][0][7] = "Novi Sad";

		// SREDA
		// Sreda predavanje 2.
		raspored[2][1][0] = "L3";
		raspored[2][1][1] = "Sinisa Nikolic";
		raspored[2][1][2] = "7";
		raspored[2][1][3] = "00";
		raspored[2][1][4] = "8";
		raspored[2][1][5] = "30";
		raspored[2][1][6] = "Internet Mreze";
		raspored[2][1][7] = "Novi Sad";

		// SREDA
		// Sreda predavanje 3.
		raspored[2][2][0] = "MI2";
		raspored[2][2][1] = "Zeljko Vukovic";
		raspored[2][2][2] = "10";
		raspored[2][2][3] = "30";
		raspored[2][2][4] = "12";
		raspored[2][2][5] = "00";
		raspored[2][2][6] = "Internet Mreze";
		raspored[2][2][7] = "Novi Sad";

		// SREDA
		// Sreda predavanje 4.
		raspored[2][3][0] = "L3";
		raspored[2][3][1] = "Sinisa Nikolic";
		raspored[2][3][2] = "10";
		raspored[2][3][3] = "30";
		raspored[2][3][4] = "12";
		raspored[2][3][5] = "00";
		raspored[2][3][6] = "Internet Mreze";
		raspored[2][3][7] = "Novi Sad";

		// SREDA
		// Sreda predavanje 5.
		raspored[2][4][0] = "MI2";
		raspored[2][4][1] = "Zeljko Vukovic";
		raspored[2][4][2] = "11";
		raspored[2][4][3] = "30";
		raspored[2][4][4] = "13";
		raspored[2][4][5] = "00";
		raspored[2][4][6] = "Internet Mreze";
		raspored[2][4][7] = "Novi Sad";

		// SREDA
		// Sreda predavanje 6.
		raspored[2][5][0] = "L6";
		raspored[2][5][1] = "Zeljko Vukovic";
		raspored[2][5][2] = "14";
		raspored[2][5][3] = "00";
		raspored[2][5][4] = "15";
		raspored[2][5][5] = "30";
		raspored[2][5][6] = "XML i Web Servisi";
		raspored[2][5][7] = "Novi Sad";

		// 3 dana
		for (int i = 0; i < raspored.length; i++) {
			// 18 predavanja
			for (int j = 0; j < raspored[i].length; j++) {
				// 144 string/celija
				for (int k = 0; k < raspored[i][j].length; k++) {
					// System.out.println(raspored[i][j][k]);

				}
			}
		}

		// Kabineti ponedeljak

		for (int i = 0; i < raspored[0].length; i++) {
			kabinetiPon[i] = raspored[0][i][0];
			// System.out.println(kabinetiPon[i]);
		}

		// Poceci predavanja ponedeljak

		for (int i = 0; i < raspored[0].length; i++) {

			odSatPon[i] = Integer.parseInt(raspored[0][i][2]);
			doSatPon[i] = Integer.parseInt(raspored[0][i][4]);

			vremePocetakSat[i] = raspored[0][i][2];
			vremeKrajSat[i] = raspored[0][i][4];
			vremePocetakMin[i] = raspored[0][i][3];
			vremeKrajMin[i] = raspored[0][i][5];

			vremeOdPon[i] = vremePocetakSat[i] + ":" + vremePocetakMin[i];
			vremeDoPon[i] = vremeKrajSat[i] + ":" + vremeKrajMin[i];

			// System.out.println(vremeOdPon[i] + " od");
			// System.out.println(vremeDoPon[i] + " do");
		}

		// Predavaci ponedeljak
		for (int i = 0; i < raspored[0].length; i++) {
			predavaciPon[i] = raspored[0][i][1];
			// System.out.println(predavaciPon[i]);
		}

		// Predavaci utorak
		for (int i = 0; i < raspored[1].length; i++) {
			predavaciUto[i] = raspored[1][i][1];
			// System.out.println(predavaciUto[i]);
		}

		// Predavaci sreda
		for (int i = 0; i < raspored[2].length; i++) {
			predavaciSre[i] = raspored[2][i][1];
			// System.out.println(predavaciSre[i]);
		}

		// Poceci predavanja utorak
		for (int i = 0; i < raspored[1].length; i++) {

			odSatUto[i] = Integer.parseInt(raspored[1][i][2]);
			doSatUto[i] = Integer.parseInt(raspored[1][i][4]);
			
			vremePocetakSatUto[i] = raspored[1][i][2];
			vremeKrajSatUto[i] = raspored[1][i][4];
			vremePocetakMinUto[i] = raspored[1][i][3];
			vremeKrajMinUto[i] = raspored[1][i][5];

			vremeOdUto[i] = vremePocetakSatUto[i] + ":" + vremePocetakMinUto[i];
			vremeDoUto[i] = vremeKrajSatUto[i] + ":" + vremeKrajMinUto[i];
			// System.out.println("od" + vremeOdUto[i] + " do " + vremeDoUto[i]);
		}

		// Poceci predavanja sreda
		for (int i = 0; i < raspored[2].length; i++) {

			odSatSre[i] = Integer.parseInt(raspored[2][i][2]);
			doSatSre[i] = Integer.parseInt(raspored[2][i][4]);
			// System.out.println(odSatSre[i]);
		}

		// Podudaranje kabineta ponedeljak
		for (int i = 0; i < raspored[0].length; i++) {
			for (int k = i + 1; k < raspored[0].length; k++) {
				if (kabinetiPon[i] == kabinetiPon[k]) {
					// System.out.println("Podudaranje kabineta " +
					// kabinetiPon[i]);

				}
			}
		}

		// Kabineti utorak

		for (int i = 0; i < raspored[1].length; i++) {
			kabinetiUto[i] = raspored[1][i][0];
			// System.out.println(kabinetiUto[i]);
		}

		// Kabineti Sreda

		for (int i = 0; i < raspored[2].length; i++) {
			kabinetiSre[i] = raspored[2][i][0];
			// System.out.println(kabinetiSre[i]);
		}

		// (StartDate1 <= EndDate2) and (StartDate2 <= EndDate1)

		// Podudaranje vremenskih intervala i kabineta ponedeljak
		for (int i = 0; i < raspored[0].length; i++) {
			for (int j = i + 1; j < raspored[0].length; j++) {
				DateFormat sdf = new SimpleDateFormat("hh:mm");
				Date start1 = sdf.parse(vremeOdPon[i]);
				Date end1 = sdf.parse(vremeDoPon[i]);
				end1.setMinutes(end1.getMinutes() + pauzaMin);
				Date start2 = sdf.parse(vremeOdPon[j]);
				Date end2 = sdf.parse(vremeDoPon[j]);
				end2.setMinutes(end2.getMinutes() + pauzaMin);
				// System.out.println("zavrseno prvo " + end1 + " Zavrseno drugo
				// " + end2);

				if (kabinetiPon[i] == kabinetiPon[j]) {
					if (start1.before(end2) && start2.before(end1))
						System.out.println("Kolizija kabineta " + kabinetiPon[i] + " Ponedeljak");
				}
			}
		}

		// Podudaranje vremenskih intervala i predavaca ponedeljak
		for (int i = 0; i < raspored[0].length; i++) {
			for (int j = i + 1; j < raspored[0].length; j++) {
				if (predavaciPon[i] == predavaciPon[j]) {
					if (odSatPon[i] <= doSatPon[j] && odSatPon[j] <= doSatPon[i])
						System.out.println("Kolizija predavaca " + predavaciPon[i] + " Ponedeljak");
				}
			}
		}

		// Podudaranje vremenskih intervala i predavaca utorak
		for (int i = 0; i < raspored[1].length; i++) {
			for (int j = i + 1; j < raspored[1].length; j++) {
				if (predavaciUto[i] == predavaciUto[j]) {
					if (odSatUto[i] <= doSatUto[j] && odSatUto[j] <= doSatUto[i])
						System.out.println("Kolizija predavaca " + predavaciUto[i] + " Utorak");
				}
			}
		}

		// Podudaranje vremenskih intervala i predavaca sreda
		for (int i = 0; i < raspored[2].length; i++) {
			for (int j = i + 1; j < raspored[2].length; j++) {
				if (predavaciSre[i] == predavaciSre[j]) {
					if (odSatSre[i] <= doSatSre[j] && odSatSre[j] <= doSatSre[i])
						System.out.println("Kolizija predavaca " + predavaciSre[i] + " Sreda");
				}
			}
		}

		// Podudaranje vremenskih intervala i kabineta utorak
		
		for (int i = 0; i < raspored[1].length; i++) {
			for (int j = i + 1; j < raspored[1].length; j++) {
				DateFormat sdf = new SimpleDateFormat("hh:mm");
				Date start3 = sdf.parse(vremeOdUto[i]);
				Date end3 = sdf.parse(vremeDoUto[i]);
				end3.setMinutes(end3.getMinutes() + pauzaMin);
				Date start4 = sdf.parse(vremeOdUto[j]);
				Date end4 = sdf.parse(vremeDoUto[j]);
				end4.setMinutes(end4.getMinutes() + pauzaMin);
				// System.out.println("zavrseno prvo " + end3 + " Zavrseno drugo " + end4);

				if (kabinetiUto[i] == kabinetiUto[j]) {
					if (start3.before(end4) && start4.before(end3))
					System.out.println("Presecanje kabineta " + kabinetiUto[i] + " Utorak");
				}
			}
		}

		// Podudaranje vremenskih intervala i kabineta sreda
		for (int i = 0; i < raspored[2].length; i++) {
			for (int j = i + 1; j < raspored[2].length; j++) {
				if (kabinetiSre[i] == kabinetiSre[j]) {
					if (odSatSre[i] <= doSatSre[j] && odSatSre[j] <= doSatSre[i])
						System.out.println("Kolizija kabineta " + kabinetiSre[j] + " Sreda");
				}
			}
		}
	}
}