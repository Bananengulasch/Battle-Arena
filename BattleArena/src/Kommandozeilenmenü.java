
import java.util.Scanner;

public class Kommandozeilenmenü {

	Scanner scan;
	Charakter c1;
	Charakter c2;

	public Kommandozeilenmenü() {
		this.scan = new Scanner(System.in);
		charaktere();
	}
	
	public void charaktere() {
		c1 = new Drache("Schönwieser Drache", 500, false);
		c2 = new Drache("Karröstner Zwerg", 500, false);
	}

	public void setupMenü() {
		System.out.println("------------------------------");
		System.out.println("SETUPMENÜ");
		System.out.println("1) CHARAKTER 1");
		System.out.println("2) CHARAKTER 2");
		System.out.println("3) SPIEL STARTEN");
		System.out.println("4) exit");
	}
	
	public void MenüAnzeigen() {
		System.out.println("------------------------------");
		System.out.println("SPIELMENÜ");
		System.out.println("1) ANGREIFEN");
		System.out.println("2) AKTIVIEREN");
		System.out.println("3) DEAKTIVIEREN");
		System.out.println("4) exit");
	}
	
	public void setup() {
		String s = "-";
		while (!s.equals("2")) {
			setupMenü();
			s = scan.nextLine();
			switch(s)
			{
			case "1":
				this.eins();
				break;
			case "2":
				this.zwei();
				break;
			case "3":
				this.start();
				break;
			case "4":
				System.out.println("Auf Wiedersehen!");
				break;
			default:
				this.fehler();
				break;
			}
		}
		scan.close();
	}
	
	public void eins() {
		
	}
	
	public void zwei() {
		
	}

	public void start() {
		String s = "-";
		while (!s.equals("3")) {
			MenüAnzeigen();
			s = scan.nextLine();
			switch(s)
			{
			case "1":
				this.setup();
				break;
			case "2":
				this.angreifen();
				break;
			case "3":
				this.aktivieren();
				break;
			case "4":
				this.deaktivieren();
				break;
			default:
				this.fehler();
				break;
			}
		}
		scan.close();
	}
	
	public void auswahlCharakter() {
		System.out.println("------------------------------");
		System.out.println("Welchen Charakter möchten sie spielen");
	}
	
	public void angreifen() {
		System.out.println("------------------------------");
	}
	
	public void aktivieren() {
		System.out.println("------------------------------");
	}
	
	public void deaktivieren() {
		System.out.println("------------------------------");
	}
	
	public void fehler() {
		System.out.println("------------------------------");
		System.out.println("Sie können nur einen der gültigen Werte eingeben!");
	}


}

