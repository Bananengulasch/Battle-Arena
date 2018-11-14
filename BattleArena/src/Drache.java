import java.util.concurrent.ThreadLocalRandom;

public class Drache extends Gegner{

	public Drache(String name, int lebenspunkte, boolean spezialfaehigkeit) {
		super(name, lebenspunkte, spezialfaehigkeit);	
	}
	
	@Override
	public void angreifen(Gegner gegner) {
		int min = 20;
		int max = 25;
		if(super.isSpezialfaehigkeit() == true) {
			int abzug = ThreadLocalRandom.current().nextInt(5,10 + 1);
			gegner.schadenNehmen(ThreadLocalRandom.current().nextInt(min, max + 1) - abzug);
		}else {
			gegner.schadenNehmen(ThreadLocalRandom.current().nextInt(min, max + 1));
		}	
	} 
	
	@Override
	public void spezialfaehigkeitAktiviert() {
		boolean aktiv = super.isSpezialfaehigkeit();
		if(aktiv == true) {
			System.out.println("Spezialfähigkeit ---FLIEGEN--- aktiviert!");
			fliegen();
		}else {
			//nothing
		}
	}
	
	public void fliegen() {
		this.setLebenspunkte(getLebenspunkte()+10);
		
	}
	
	public void spezialfaehigkeitDeaktivieren() {
		if(super.isSpezialfaehigkeit() == true) {
			if(this.getLebenspunkte() < 11) {
				System.out.println("Sie können die Spezialfähigkeit nicht deaktivieren!" +"\n"+"Sie haben sonst keine Lebenspunkte mehr!");
			}else {
				this.setLebenspunkte(getLebenspunkte()-10);
			}
			this.setSpezialfaehigkeit(false);
		}
	}
}

