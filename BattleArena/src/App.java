
public class App {

	public static void main(String[] args) {
		Charakter c1 = new Charakter("a", 100, false);
		Charakter c2 = new Charakter("b", 100, false);
		Kampfarena ka = new Kampfarena(c1, c2);
	}
}
