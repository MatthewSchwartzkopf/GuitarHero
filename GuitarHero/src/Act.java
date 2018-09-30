/**
 * Lab-02 GuitarHero
 * 
 * Champlain College CSI-340, Fall 2018
 * 
 * Author: Matthew Schwartzkopf And Paul Lindenberg Emails:
 * matthew.schwartzkopf@mymail.champlain.edu,
 * paul.lindenberg@mymail.champlain.edu Class : CSI-340 Assignment: Lab 02
 * GuitarHero Date Assigned: Septermber 27, 2018 Due Date: October 2, 2018
 * 
 * Description:
 * 
 * This code represents the game GuitarHero using strategy patterns and UML/
 **/

public interface Act {

	Act fire = new Fire();
	Act smash = new Smash();
	Act stage = new Stage();

	public void act(String name);

	static void smash(String name) {
		// TODO Auto-generated method stub
		smash.act(name);
	}

	static void fire(String name) {
		fire.act(name);
	}

	static void stage(String name) {
		// TODO Auto-generated method stub
		stage.act(name);
	}

}
