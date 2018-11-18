import java.util.concurrent.ThreadLocalRandom;

public class Zwerg extends Charakter{
	
	public Zwerg(String name, int lebenspunkte, boolean spezialfaehigkeit) {
		super(name, lebenspunkte, spezialfaehigkeit);
	}
	
	public void angreifen(Charakter gegner) {
		int min = 15;
		int max = 25;
		if(super.isSpezialfaehigkeit() == true && super.getLebenspunkte() < 50) {
			int wahrscheinlichkeit = ThreadLocalRandom.current().nextInt(1,10 + 1);
				if(super.getLebenspunkte() < 20)
				{
					if(super.getLebenspunkte() < 10)
					{
						if(wahrscheinlichkeit >= 1 && wahrscheinlichkeit <= 7) {
							gegner.schadenNehmen(ThreadLocalRandom.current().nextInt(min,max + 1)*2);
							}
							else {
								gegner.schadenNehmen(ThreadLocalRandom.current().nextInt(min,max + 1)/2);
							}
					} else {
						if(wahrscheinlichkeit >= 1 && wahrscheinlichkeit <= 5) {
						gegner.schadenNehmen(ThreadLocalRandom.current().nextInt(min,max + 1)*2);
						}
						else {
							gegner.schadenNehmen(ThreadLocalRandom.current().nextInt(min,max + 1)/2);
						}
					}
					if(wahrscheinlichkeit >= 1 && wahrscheinlichkeit <= 3) {
						gegner.schadenNehmen(ThreadLocalRandom.current().nextInt(min,max + 1)*2);
						}
						else {
							gegner.schadenNehmen(ThreadLocalRandom.current().nextInt(min,max + 1)/2);
						}
				} 
		}
		else {
		gegner.schadenNehmen(ThreadLocalRandom.current().nextInt(min,max + 1));
		}
	} 
	
	@Override
	public void spezialfaehigkeitAktiviert() {
		
		if(super.getLebenspunkte() < 50) {
			
		super.setSpezialfaehigkeit(true);
			if(super.isSpezialfaehigkeit() == true) {
			System.out.println("Spezialfähigkeit --ZWERGENKOPFNUSS-- aktiviert!");
			
			}else {
			System.out.println("Spezialfähigkeit ist nicht aktiv!");
			}
		}
		else {
		System.out.println("Die Spezialfaehigkeit laesst sich erst aktivieren wenn ihre Lebenspunkte unter 50 fallen!");	
			}
		}
	
	@Override
	public void spezialfaehigkeitDeaktiviert() {
		super.setSpezialfaehigkeit(false);
	}
}
