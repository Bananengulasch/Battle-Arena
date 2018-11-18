
import java.util.Scanner;

public class Kommandozeilenmenü {

	Scanner scan;
	private int entscheidung;
	
	public Kommandozeilenmenü() {
		this.scan = new Scanner(System.in);
	}
	
	public int getEntscheidung() {
		return entscheidung;
	}
	
	public void MenüAnzeigen() {
		System.out.println("------------------------------------------------------------");
		System.out.println("SPIELMENÜ");
		System.out.println("1) ANGREIFEN");
		System.out.println("2) AKTIVIEREN");
		System.out.println("3) DEAKTIVIEREN");
		System.out.println("4) exit");
	}
	
	
	public Charakter charakterEins(Charakter a) {
		System.out.println("------------------------------------------------------------");
		System.out.println("Bitte den Charakter (Drache/Zwerg) von Spieler 1 eingeben!");
		String c = scan.nextLine();
		System.out.println("------------------------------------------------------------");
		System.out.println("Bitte den Namen von Spieler 1 eingeben!");
		String n = scan.nextLine();
		if(c.equals("Drache")) {
			a = new Drache(n, 100, false);
		}else {
			if(c.equals("Zwerg")) {
				a = new Zwerg(n, 100, false);
			}else {
				System.out.println("------------------------------------------------------------");
				System.out.println("Dieser Charaktertyp existiert nicht!");
				charakterZwei(a);
			}
		}
		return a;
		
	}
	
	public Charakter charakterZwei(Charakter a) {
		System.out.println("------------------------------------------------------------");
		System.out.println("Bitte den Charakter (Drache/Zwerg) von Spieler 2 eingeben!");
		String c = scan.nextLine();
		System.out.println("------------------------------------------------------------");
		System.out.println("Bitte den Namen von Spieler 2 eingeben!");
		String n = scan.nextLine();
		if(c.equals("Drache")) {
			a = new Drache(n, 100, false);
		}else {
			if(c.equals("Zwerg")) {
				a = new Zwerg(n, 100, false);
			}else {
				System.out.println("------------------------------------------------------------");
				System.out.println("Dieser Charaktertyp existiert nicht!");
				charakterZwei(a);
			}
		}
		return a;
	}
	
	public void start() {
		String s = "-";
		if(!s.equals("3")) {
			MenüAnzeigen();
			s = scan.nextLine();
			switch(s)
			{
			case "1":
				this.angreifen();
				break;
			case "2":
				this.aktivieren();
				break;
			case "3":
				this.deaktivieren();
				break;
			default:
				this.fehler();
				break;
			}
		}
		
	}
	
	public void angreifen() {
		entscheidung = 1;
	}
	
	public void aktivieren() {
		entscheidung = 2;
	}
	
	public void deaktivieren() {
		entscheidung = 3;
	}
	
	public void fehler() {
		System.out.println("------------------------------------------------------------");
		System.out.println("Sie können nur einen der gültigen Werte eingeben!");
	}


}

