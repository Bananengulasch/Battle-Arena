
import java.util.Scanner;

public class Kommandozeilenmen� {

	Scanner scan;
	Charakter c1;
	Charakter c2;

	public Kommandozeilenmen�() {
		this.scan = new Scanner(System.in);
		charaktere();
	}
	
	public void charaktere() {
		c1 = new Drache("Sch�nwieser Drache", 500, false);
		c2 = new Drache("Karr�stner Zwerg", 500, false);
	}

	public void setupMen�() {
		System.out.println("------------------------------");
		System.out.println("SETUPMEN�");
		System.out.println("1) CHARAKTER 1");
		System.out.println("2) CHARAKTER 2");
		System.out.println("3) SPIEL STARTEN");
		System.out.println("4) exit");
	}
	
	public void Men�Anzeigen() {
		System.out.println("------------------------------");
		System.out.println("SPIELMEN�");
		System.out.println("1) ANGREIFEN");
		System.out.println("2) AKTIVIEREN");
		System.out.println("3) DEAKTIVIEREN");
		System.out.println("4) exit");
	}
	
	public void setup() {
		String s = "-";
		while (!s.equals("2")) {
			setupMen�();
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
			Men�Anzeigen();
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
		System.out.println("Welchen Charakter m�chten sie spielen");
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
		System.out.println("Sie k�nnen nur einen der g�ltigen Werte eingeben!");
	}


}

