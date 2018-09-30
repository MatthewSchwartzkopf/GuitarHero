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

public class Slash implements Character {

	Guitar SlashGuitar = null;
	String SlashAct = null;
	String SlashName = "Slash";

	public Slash() {
		// Sets default values
		SlashGuitar = Guitar.GibsonSG;
		SlashAct = Stage.mStage;
	}

	@Override
	public void playGuitar() {
		System.out.println("Slash is playing!");
	}

	@Override
	public void act() {
		if (SlashAct == Fire.mFire)
			Act.fire(SlashName);
		else if (SlashAct == Smash.mSmash)
			Act.smash(SlashName);
		else
			Act.stage(SlashName);
	}

	@Override
	public void changeGuitar(GibsonSG guitar) {
		SlashGuitar = Guitar.GibsonSG;
		System.out.println("Slash switch to a " + guitar.mGibsonSG);
	}

	@Override
	public void changeGuitar(GibsonFlyingV guitar) {
		SlashGuitar = Guitar.GibsonFlyingV;
		System.out.println("Slash switch to a " + guitar.mGibsonFlyingV);
	}

	@Override
	public void changeGuitar(FenderTelecaster guitar) {
		SlashGuitar = Guitar.FenderTelecaster;
		System.out.println("Slash switched to a " + guitar.mFenderTelecaster);
	}

	@Override
	public void changeSoloAct(Smash smash) {
		SlashAct = Smash.mSmash;
		System.out.println("Slash switched his Solo Act to " + SlashAct);
	}

	@Override
	public void chagenSoloAct(Stage stage) {
		SlashAct = Stage.mStage;
		System.out.println("Slash switched his Solo Act to " + SlashAct);
	}

	@Override
	public void changeSoloAct(Fire fire) {
		SlashAct = Fire.mFire;
		System.out.println("Slash switched his Solo Act to " + SlashAct);

	}

	@Override
	public void act(String name) {
	}
}
