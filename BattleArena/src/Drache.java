import java.util.concurrent.ThreadLocalRandom;

public class Drache extends Charakter{

	public Drache(String name, int lebenspunkte, boolean spezialfaehigkeit) {
		super(name, lebenspunkte, spezialfaehigkeit);	
	}
	
	@Override
	public void angreifen(Charakter gegner) {
		int min = 20;
		int max = 25;
		int verletzungswahrscheinlichkeit = ThreadLocalRandom.current().nextInt(1, 10 + 1);
		if(super.isSpezialfaehigkeit() == true) {
			if(verletzungswahrscheinlichkeit >= 1 && verletzungswahrscheinlichkeit <= 2) {
					verletzungBeiAngriff(ThreadLocalRandom.current().nextInt(5, 10 +1));
				}
			int abzug = ThreadLocalRandom.current().nextInt(5,10 + 1);
			gegner.schadenNehmen(ThreadLocalRandom.current().nextInt(min, max + 1) - abzug);
		}else {
			gegner.schadenNehmen(ThreadLocalRandom.current().nextInt(min, max + 1));
		}	
	} 
	
	@Override
	public void spezialfaehigkeitAktiviert() {
		
		super.setSpezialfaehigkeit(true);
		System.out.println("Spezialfähigkeit ---FLIEGEN--- aktiviert!");
		fliegen();
			
		
	}
	
	public void fliegen() {
		this.setLebenspunkte(getLebenspunkte()+10);
		
	}
	
	@Override
	public void spezialfaehigkeitDeaktiviert() {
		if(super.isSpezialfaehigkeit() == true) {
			if(this.getLebenspunkte() < 11) {
				System.out.println("Sie können die Spezialfähigkeit nicht deaktivieren!" +"\n"+"Sie haben sonst keine Lebenspunkte mehr!");
			}else {
				this.setLebenspunkte(getLebenspunkte()-10);
			}
			this.setSpezialfaehigkeit(false);
		}
	}
	
	public void verletzungBeiAngriff(int lebenspunkte) {
		this.setLebenspunkte(getLebenspunkte()-lebenspunkte);
	}
}

