
public class JimiHendrix implements Character {

	String JimiGuitar = null;
	String JimiAct = null;
	String JimiName = "Jimi Hendrix";
			
	public JimiHendrix() {
		// Sets default values
		JimiGuitar = GibsonFlyingV.GibsonFlyingV;
		JimiAct = Smash.smash;
	}

	@Override
	public void playGuitar() {
		System.out.println("Jimi Hendrix is playing!");
	}

	@Override
	public void act() {
		if (JimiAct == Fire.fire)
			Act.fire(JimiName);
		else if (JimiAct == Smash.smash)
			Act.smash(JimiName);
		else
			Act.stage(JimiName);
	}

	@Override
	public void changeGuitar(GibsonSG type) {
		JimiGuitar = GibsonSG.GibsonSG;
		System.out.println("Jimi switched to a " + GibsonSG.GibsonSG);
	}

	@Override
	public void changeGuitar(GibsonFlyingV type) {
		JimiGuitar = GibsonFlyingV.GibsonFlyingV;
		System.out.println("Jimi switched to a " + GibsonFlyingV.GibsonFlyingV);
	}

	@Override
	public void changeGuitar(FenderTelecaster type) {
		JimiGuitar = FenderTelecaster.FenderTelecaster;
		System.out.println("Jimi switched to a " + FenderTelecaster.FenderTelecaster);
	}

	@Override
	public void changeSoloAct(Smash smash) {
		JimiAct = Smash.smash;
		System.out.println("Jimi Hendrix switched his Solo Act to " + Smash.smash);

	}

	@Override
	public void chagenSoloAct(Stage stage) {
		JimiAct = Stage.stage;
		System.out.println("Jimi Hendrix switched his Solo Act to " + Stage.stage);

	}

	@Override
	public void changeSoloAct(Fire fire) {
		JimiAct = Fire.fire;
		System.out.println("Slash switched his Solo Act to " + Fire.fire);

	}

}
