import java.util.concurrent.ThreadLocalRandom;

public class Zwerg extends Gegner{
	
	public Zwerg(String name, int lebenspunkte, boolean spezialfaehigkeit) {
		super(name, lebenspunkte, spezialfaehigkeit);
	}
	
	public void angreifen(Gegner gegner) {
		int min = 15;
		int max = 25;
		
		if(super.isSpezialfaehigkeit() == true && super.getLebenspunkte() < 50) {
			int wahrscheinlichkeit = ThreadLocalRandom.current().nextInt(1,10 + 1);
			
				if(super.getLebenspunkte() < 20)
				{
					if(super.getLebenspunkte() < 10)
					{
					
					} else {
						if(wahrscheinlichkeit >= 1 && wahrscheinlichkeit <= 5) {
						gegner.schadenNehmen(ThreadLocalRandom.current().nextInt(min,max + 1)*2);
						}
						else {
							gegner.schadenNehmen(ThreadLocalRandom.current().nextInt(min,max + 1)/2);
						}
					}
				} else {
					
				}
			
		
		}
		else {
		gegner.schadenNehmen(ThreadLocalRandom.current().nextInt(min,max + 1));
		}
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
