import java.util.concurrent.ThreadLocalRandom;

public class Kobold extends Charakter{
	
	private int counter;
	
	public Kobold(String name, int lebenspunkte, boolean spezialfaehigkeit) {
		super(name, lebenspunkte, spezialfaehigkeit);	
	}
	
	public int getCounter() {
		return counter;
	}
	
	@Override
	public void angreifen(Charakter gegner) {
		int min = 11;
		int max = 12;
		if(super.isSpezialfaehigkeit() == true) {
			gegner.spezialfaehigkeitDeaktiviert();
			spezialfaehigkeitDeaktiviert();
			gegner.schadenNehmen(ThreadLocalRandom.current().nextInt(min, max + 1));
			counter++;
		}else {
			gegner.schadenNehmen(ThreadLocalRandom.current().nextInt(min, max + 1));
		}	
	} 
	
	@Override
	public void spezialfaehigkeitAktiviert() {
		
		super.setSpezialfaehigkeit(true);
		System.out.println("Spezialfähigkeit ---GOLDHAMSTERN--- aktiviert!");
		hamster();
			
		
	}
	
	public void hamster() {
		this.setLebenspunkte(getLebenspunkte()+5);
		
	}
	
	@Override
	public void spezialfaehigkeitDeaktiviert() {
		
			this.setSpezialfaehigkeit(false);
		
	}
	
	public void verletzungBeiAngriff(int lebenspunkte) {
		this.setLebenspunkte(getLebenspunkte()-lebenspunkte);
	}
}

