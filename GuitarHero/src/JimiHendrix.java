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

public class JimiHendrix implements Character {

	Guitar JimiGuitar = null;
	String JimiAct = null;
	String JimiName = "Jimi Hendrix";

	public JimiHendrix() {
		// Sets default values
		JimiGuitar = Character.GibsonFlyingV;
		JimiAct = Smash.mSmash;
	}

	@Override
	public void playGuitar() {
		System.out.println("Jimi Hendrix is playing!");
	}

	@Override
	public void act() {
		if (JimiAct == Fire.mFire)
			Act.fire(JimiName);
		else if (JimiAct == Smash.mSmash)
			Act.smash(JimiName);
		else
			Act.stage(JimiName);
	}

	@Override
	public void changeGuitar(GibsonSG type) {
		JimiGuitar = Guitar.GibsonSG;
		System.out.println("Jimi switched to a " + type.mGibsonSG);
	}

	@Override
	public void changeGuitar(GibsonFlyingV type) {
		JimiGuitar = Character.GibsonFlyingV;
		System.out.println("Jimi switched to a " + type.mGibsonFlyingV);
	}

	@Override
	public void changeGuitar(FenderTelecaster type) {
		JimiGuitar = Guitar.FenderTelecaster;
		System.out.println("Jimi switched to a " + type.mFenderTelecaster);
	}

	@Override
	public void changeSoloAct(Smash smash) {
		JimiAct = Smash.mSmash;
		System.out.println("Jimi Hendrix switched his Solo Act to " + Smash.mSmash);

	}

	@Override
	public void chagenSoloAct(Stage stage) {
		JimiAct = Stage.mStage;
		System.out.println("Jimi Hendrix switched his Solo Act to " + Stage.mStage);

	}

	@Override
	public void changeSoloAct(Fire fire) {
		JimiAct = Fire.mFire;
		System.out.println("Slash switched his Solo Act to " + Fire.mFire);

	}

	@Override
	public void act(String name) {
	}

}
