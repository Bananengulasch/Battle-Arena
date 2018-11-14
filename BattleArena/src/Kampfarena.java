
public class Kampfarena {
	
	private Gegner weis = new Gegner("Drache", 300, false);
	private Gegner schwarz = new Gegner("Zwerg", 300, false);

	public Kampfarena(Gegner weis, Gegner schwarz) {
		this.weis = weis;
		this.schwarz = schwarz;
		starteRunde();
	}
	
	public void starteRunde() {
		
	}
}
