import java.util.concurrent.ThreadLocalRandom;

public class SexyPaul extends Charakter{
	
	private int counter;
	
	public SexyPaul(String name, int lebenspunkte, boolean spezialfaehigkeit) {
		super(name, lebenspunkte, spezialfaehigkeit);	
	}
	
	public int getCounter() {
		return counter;
	}
	
	@Override
	public void angreifen(Charakter gegner) {
		int min = 11;
		int max = 12;
		int verletzungswahrscheinlichkeit = ThreadLocalRandom.current().nextInt(1, 10 + 1);
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
		System.out.println("Spezialfähigkeit ---XHAMSTER--- aktiviert!");
		xHamster();
			
		
	}
	
	public void xHamster() {
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

