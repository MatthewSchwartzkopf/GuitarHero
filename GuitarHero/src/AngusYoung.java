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

public class AngusYoung implements Character {

	Guitar AngusGuitar = null;
	String AngusAct = null;
	String AngusName = "Angus Young";

	public AngusYoung() {
		AngusGuitar = Guitar.FenderTelecaster;
		AngusAct = Fire.mFire;
	}

	@Override
	public void playGuitar() {
		System.out.println("Angus Young is playing!");
	}

	@Override
	public void changeGuitar(GibsonSG gibsonSG) {
		AngusGuitar = Guitar.GibsonSG;
		System.out.println("Angus switch to a " + gibsonSG.mGibsonSG);
	}

	@Override
	public void changeGuitar(GibsonFlyingV type) {
		AngusGuitar = Character.GibsonFlyingV;
		System.out.println("Angus switched to a " + type.mGibsonFlyingV);
	}

	@Override
	public void changeGuitar(FenderTelecaster type) {
		AngusGuitar = Guitar.FenderTelecaster;
		System.out.println("Angus switched to a " + type.mFenderTelecaster);

	}

	@Override
	public void act() {
		if (AngusAct == Fire.mFire)
			Act.fire(AngusName);
		else if (AngusAct == Smash.mSmash)
			Act.smash(AngusName);
		else
			Act.stage(AngusName);
	}

	@Override
	public void changeSoloAct(Smash smash) {
		AngusAct = Smash.mSmash;
		System.out.println("Angus Young switched her Solo Act to " + Smash.mSmash);
	}

	@Override
	public void chagenSoloAct(Stage stage) {
		AngusAct = Stage.mStage;
		System.out.println("Angus Young switched her Solo Act to " + Stage.mStage);
	}

	@Override
	public void changeSoloAct(Fire fire) {
		AngusAct = Fire.mFire;
		System.out.println("Angus Young switched her Solo Act to " + Fire.mFire);
	}

	@Override
	public void act(String name) {
	}
}
