import java.util.concurrent.ThreadLocalRandom;

public class Zwerg extends Gegner{
	
	public Zwerg(String name, int lebenspunkte, boolean spezialfaehigkeit) {
		super(name, lebenspunkte, spezialfaehigkeit);
		
	}
	
	public void angreifen(Gegner gegner) {
		gegner.schadenNehmen(ThreadLocalRandom.current().nextInt(15,25 + 1));
	} 
}
