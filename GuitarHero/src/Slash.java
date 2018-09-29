
public class Slash implements Character {

	Guitar SlashGuitar = null;
	String SlashAct = null;
	String SlashName = "Slash";

	public Slash() {
		// Sets default values
		SlashGuitar = Guitar.GibsonSG;
		SlashAct = Stage.stage;
	}

	@Override
	public void playGuitar() {
		System.out.println("Slash is playing!");
	}

	@Override
	public void act() {
		if (SlashAct == Fire.fire)
			Act.fire(SlashName);
		else if (SlashAct == Smash.smash)
			Act.smash(SlashName);
		else
			Act.stage(SlashName);
	}

	@Override
	public void changeGuitar(GibsonSG guitar) {
		SlashGuitar = Guitar.GibsonSG;
		System.out.println("Slash switch to a " + SlashGuitar);
	}

	@Override
	public void changeGuitar(GibsonFlyingV guitar) {
		SlashGuitar = Character.GibsonFlyingV;
		System.out.println("Slash switch to a " + SlashGuitar);
	}

	@Override
	public void changeGuitar(FenderTelecaster guitar) {
		SlashGuitar = Guitar.FenderTelecaster;
		System.out.println("Slash switched to a " + SlashGuitar);
	}

	@Override
	public void changeSoloAct(Smash smash) {
		SlashAct = Smash.smash;
		System.out.println("Slash switched his Solo Act to " + SlashAct);
	}

	@Override
	public void chagenSoloAct(Stage stage) {
		SlashAct = Stage.stage;
		System.out.println("Slash switched his Solo Act to " + SlashAct);
	}

	@Override
	public void changeSoloAct(Fire fire) {
		SlashAct = Fire.fire;
		System.out.println("Slash switched his Solo Act to " + SlashAct);

	}

	@Override
	public void act(String name) {
		// TODO Auto-generated method stub
		
	}
}
