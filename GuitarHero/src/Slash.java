
public class Slash implements Character {

	public Slash() {
		// TODO Auto-generated constructor stub
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
		System.out.println("Slash switch to a " + guitar.GibsonSG);
	}

	@Override
	public void changeGuitar(GibsonFlyingV guitar) {
		System.out.println("Slash switch to a " + guitar.GibsonFlyingV);
	}

	@Override
	public void changeGuitar(FenderTelecaster guitar) {
		System.out.println("Slash switched to a " + guitar.FenderTelecaster);
	}
}
