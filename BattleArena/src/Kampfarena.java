import java.util.concurrent.ThreadLocalRandom;

public class Kampfarena {
	
	private Charakter weis;
	private Charakter schwarz;
	private Charakter sieger;
	private Charakter verlierer;
	
	private Kommandozeilenmenü k1 = new Kommandozeilenmenü();
	
	
	int anfaenger = ThreadLocalRandom.current().nextInt(1,2 + 1);
	
	public Kampfarena(Charakter weis, Charakter schwarz) {
		this.weis = k1.charakterEins(weis);
		this.schwarz = k1.charakterZwei(schwarz);;
		fight();
		
		
		
	}
	
	public void setCharakter1(Charakter g) {
		this.weis = g;
	}
	
	public void setCharakter2(Charakter g) {
		this.schwarz = g;
	}
	
	public void fight() {
		
		if(sieger == null) {
			System.out.println("Spieler 1 -- > " + weis);
			System.out.println("Spieler 2 -- > " + schwarz);
		if(anfaenger == 1) {
			System.out.println("Spieler 1 ist an der Reihe.");
			anfaenger++;
			kampfsimulieren(weis,schwarz);
			
		} else {
			
			System.out.println("Spieler 2 ist an der Reihe");
			anfaenger--;
			kampfsimulieren(schwarz, weis);
			
		}
		
		}
		
	}
	
	public void kampfsimulieren(Charakter angreifer, Charakter opfer) {
			k1.start();
			int a = k1.getEntscheidung();
			if(a == 1) {
				angreifer.angreifen(opfer);
			}else if(a == 2) {
				angreifer.spezialfaehigkeitAktiviert();
			}else {
				angreifer.spezialfaehigkeitDeaktiviert();
			}
			if(opfer.getLebenspunkte() < 0) {
				sieger = angreifer;
				verlierer = opfer;
				System.out.println(siegerAusgeben());
				
			}
			fight();
			
		
	}
	
	public String siegerAusgeben() {
		return sieger.getName()+ " hat gegen " + verlierer.getName() + " gewonnen! Glückwunsch!";
	}
}
