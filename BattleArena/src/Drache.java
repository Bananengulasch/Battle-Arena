import java.util.concurrent.ThreadLocalRandom;

public class Drache extends Gegner{

	public Drache(String name, int lebenspunkte, boolean spezialfaehigkeit) {
		super(name, lebenspunkte, spezialfaehigkeit);	
	}
	
	@Override
	public void angreifen(Gegner gegner) {
		gegner.schadenNehmen(ThreadLocalRandom.current().nextInt(20, 25 + 1));
	}
	
	@Override
	public void spezialfaehigkeitAktiviert() {
		
	}
}

