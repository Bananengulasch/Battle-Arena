import java.util.concurrent.ThreadLocalRandom;

public class Kampfarena {
	
	private Gegner weis;
	private Gegner schwarz;
	private Gegner sieger;
	
	public Kampfarena(Gegner weis, Gegner schwarz) {
		this.weis = weis;
		this.schwarz = schwarz;
		fight();
	}
	
	public void fight() {
		int anfaenger = ThreadLocalRandom.current().nextInt(1,2 + 1);
		if(anfaenger == 1) {
			kampfsimulieren(weis,schwarz);
		} else {
			kampfsimulieren(schwarz,weis);
		}
	}
	
	public void kampfsimulieren(Gegner angreifer, Gegner opfer) {
		
	}
}
