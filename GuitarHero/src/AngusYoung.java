
public class AngusYoung implements Character {

	String AngusGuitar = null;
	String AngusAct = null;
	String AngusName = "Angus Young";

	public AngusYoung() {
		AngusGuitar = FenderTelecaster.FenderTelecaster;
		AngusAct = Fire.fire;
	}

	@Override
	public void playGuitar() {
		System.out.println("Angus Young is playing!");
	}

	@Override
	public void changeGuitar(GibsonSG gibsonSG) {
		AngusGuitar = GibsonSG.GibsonSG;
		System.out.println("Angus switch to a " + gibsonSG);
	}

	@Override
	public void changeGuitar(GibsonFlyingV type) {
		AngusGuitar = GibsonFlyingV.GibsonFlyingV;
		System.out.println("Angus switched to a " + type);
	}

	@Override
	public void changeGuitar(FenderTelecaster type) {
		AngusGuitar = FenderTelecaster.FenderTelecaster;
		System.out.println("Angus switched to a " + type);

	}

	@Override
	public void act() {
		if (AngusAct == Fire.fire)
			Act.fire(AngusName);
		else if (AngusAct == Smash.smash)
			Act.smash(AngusName);
		else
			Act.stage(AngusName);

	}

	@Override
	public void changeSoloAct(Smash smash) {
		System.out.println("Angus Young switched her Solo Act to " + Smash.smash);
	}

	@Override
	public void chagenSoloAct(Stage stage) {
		System.out.println("Angus Young switched her Solo Act to " + Stage.stage);
	}

	@Override
	public void changeSoloAct(Fire fire) {
		System.out.println("Angus Young switched her Solo Act to " + Fire.fire);
	}
}
