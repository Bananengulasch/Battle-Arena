import java.util.concurrent.ThreadLocalRandom;

public class Gegner {
	
	private String name;
	private int lebenspunkte;
	private boolean spezialfaehigkeit;
	
	public Gegner(String name, int lebenspunkte, boolean spezialfaehigkeit) {
		super();
		this.name = name;
		this.lebenspunkte = lebenspunkte;
		this.spezialfaehigkeit = spezialfaehigkeit;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getLebenspunkte() {
		return lebenspunkte;
	}

	public void setLebenspunkte(int lebenspunkte) {
		this.lebenspunkte = lebenspunkte;
	}

	public boolean isSpezialfaehigkeit() {
		return spezialfaehigkeit;
	}

	public void setSpezialfaehigkeit(boolean spezialfaehigkeit) {
		this.spezialfaehigkeit = spezialfaehigkeit;
	}
	
	public void schadenNehmen(int punkte) {
		this.lebenspunkte = lebenspunkte - punkte;
	}
	
	public void angreifen(Gegner gegner) {
		gegner.schadenNehmen(ThreadLocalRandom.current().nextInt());
	}
	
}
