import java.util.concurrent.ThreadLocalRandom;

public class Kampfarena {
	
	private Charakter weis;
	private Charakter schwarz;
	private Charakter sieger;
	
	public Kampfarena(Charakter weis, Charakter schwarz) {
		this.weis = weis;
		this.schwarz = schwarz;
		fight();
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
		} else {
			kampfsimulieren(schwarz,weis);
		}
	}
	
	public void kampfsimulieren(Charakter angreifer, Charakter opfer) {
		if(sieger == null) {
			
			if(opfer.getLebenspunkte() <= 0) {
				sieger = angreifer;
			}
		}
	}
	
	public String siegerAusgeben() {
		return "Der Sieger ist: " + sieger;
	}
}
