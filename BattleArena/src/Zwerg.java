import java.util.concurrent.ThreadLocalRandom;

public class Zwerg extends Gegner{
	
	public Zwerg(String name, int lebenspunkte, boolean spezialfaehigkeit) {
		super(name, lebenspunkte, spezialfaehigkeit);
	}
	
	public void angreifen(Gegner gegner) {
		
		gegner.schadenNehmen(ThreadLocalRandom.current().nextInt(15,25 + 1));
	} 
	
	@Override
	public void spezialfaehigkeitAktiviert() {
		
		if(super.getLebenspunkte() < 50) {
			
		
		if(super.isSpezialfaehigkeit() == true) {
			System.out.println("Spezialfähigkeit Zwergenkopfnuss aktiviert!");
			
		}else {
			//nothing
		}
		}
		else {
		System.out.println("Die Spezialfaehigkeit laesst sich erst aktivieren wenn ihre Lebenspunkte unter 50 fallen!");	
		}
		}
		
	}
}
