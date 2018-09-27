
public class GuitarHeroTest {

	public static void main(String[] args) {
		Character player1 = new Slash();
		Character player2 = new AngusYoung();
		Character player3 = new JimiHendrix();

		player1.playGuitar();
		player2.playGuitar();
		player1.act();
		player2.act();
		player1.changeGuitar(new GibsonSG());
		player1.playGuitar();
		player1.changeGuitar(new GibsonFlyingV());

		player3.playGuitar();
		player3.changeGuitar(new FenderTelecaster());
		player3.act();

	}

	public GuitarHeroTest() {
		// TODO Auto-generated constructor stub
	}

}
