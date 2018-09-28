
public class Slash implements Character {

	String SlashGuitar = null;
	String SlashAct = null;
	
	public Slash() {
		// Sets default values
		SlashGuitar = GibsonSG.GibsonSG;
		SlashAct = Stage.stage;
	}

	@Override
	public void playGuitar() {
		System.out.println("Slash is playing!");
	}

	@Override
	public void act() {
		System.out.println("Slash ");
		Act.stage();
	}

	@Override
	public void guitarType() {
		Guitar.GibsonSG();
	}

	@Override
	public void changeGuitar(GibsonSG guitar) {
		SlashGuitar = guitar.GibsonSG;
		System.out.println("Slash switch to a " + SlashGuitar);
	}

	@Override
	public void changeGuitar(GibsonFlyingV guitar) {
		SlashGuitar = guitar.GibsonFlyingV;
		System.out.println("Slash switch to a " + SlashGuitar);
	}

	@Override
	public void changeGuitar(FenderTelecaster guitar) {
		SlashGuitar = guitar.FenderTelecaster;
		System.out.println("Slash switched to a " + SlashGuitar);
	}

	@Override
	public void changeSoloAct(Smash smash) {
		SlashAct = smash.smash;
		System.out.println("Slash switched his Solo Act to " + SlashAct);
		Act.smash();

	}

	@Override
	public void chagenSoloAct(Stage stage) {
		SlashAct = stage.stage;
		System.out.println("Slash switched his Solo Act to " + SlashAct);
		Act.stage();
	}

	@Override
	public void changeSoloAct(Fire fire) {
		SlashAct = fire.fire;
		System.out.println("Slash switched his Solo Act to " + SlashAct);
		Act.fire();

	}
}
