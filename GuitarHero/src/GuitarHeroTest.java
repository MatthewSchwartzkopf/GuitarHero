/**
 * Lab-02 GuitarHero
 * 
 * Champlain College CSI-340, Fall 2018
 * 
 * Author: Matthew Schwartzkopf And Paul Lindenberg Emails:
 * matthew.schwartzkopf@mymail.champlain.edu,
 * paul.lindenberg@mymail.champlain.edu Class : CSI-340 Assignment: Lab 02
 * GuitarHero Date Assigned: September 27, 2018 Due Date: October 2, 2018
 * 
 * Description:
 * 
 * This code represents the game GuitarHero using strategy patterns and UML/
 **/

public class GuitarHeroTest {

	public static void main(String[] args) {
		Character player1 = new Slash();
		Character player2 = new AngusYoung();
		Character player3 = new JimiHendrix();

		player1.playGuitar();
		player2.playGuitar();
		player1.act();
		player2.act();
		player1.changeGuitar(new FenderTelecaster());
		player1.playGuitar();
		player1.changeGuitar(new GibsonFlyingV());

		player3.playGuitar();
		player3.changeGuitar(new FenderTelecaster());
		player3.act();

		player1.changeSoloAct(new Smash());
		player1.act();
		player2.changeSoloAct(new Smash());
	}

	public GuitarHeroTest() {
	}

}
