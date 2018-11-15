import java.util.concurrent.ThreadLocalRandom;

public class Kampfarena {
	
	private Charakter weis;
	private Charakter schwarz;
	private Charakter sieger;
	private String entscheidung;
	
	public Kampfarena(Charakter weis, Charakter schwarz) {
		this.weis = weis;
		this.schwarz = schwarz;
	}
	
	public void setEntscheidung(String s) {
		this.entscheidung = s;
	}
	
	public void setCharakter1(Charakter g) {
		this.weis = g;
	}
	
	public void setCharakter2(Charakter g) {
		this.schwarz = g;
	}
	
	public void fight() {
		int anfaenger = ThreadLocalRandom.current().nextInt(1,2 + 1);
		if(anfaenger == 1) {
			kampfsimulieren(weis,schwarz);
			System.out.println("Spieler 1 beginnt.");
		} else {
			kampfsimulieren(schwarz,weis);
			System.out.println("Spieler 2 beginnt.");
		}
	}
	
	public void kampfsimulieren(Charakter angreifer, Charakter opfer) {
		if(sieger == null) {
			if(entscheidung.equals("1")) {
				angreifer.angreifen(opfer);
			}else if(entscheidung.equals("2")) {
				angreifer.setSpezialfaehigkeit(true);
			}else if(entscheidung.equals("3")){
				angreifer.setSpezialfaehigkeit(false);
			}
			if(opfer.getLebenspunkte() <= 0) {
				sieger = angreifer;
				siegerAusgeben();
			}
			
		}
		
	}
	
	public String siegerAusgeben() {
		return "Der Sieger ist: " + sieger;
	}
}
