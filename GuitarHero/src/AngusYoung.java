
public class AngusYoung implements Character {

	@Override
	public void playGuitar() {
		System.out.println("Angus Young is playing!");
	}

	@Override
	public void guitarType() {
		Guitar.GibsonFlyingV();
	}

	@Override
	public void changeGuitar(GibsonSG gibsonSG) {
		System.out.println("Angus switch to a " + gibsonSG);
	}

	@Override
	public void changeGuitar(GibsonFlyingV type) {
		System.out.println("Angus switched to a " + type);
	}

	@Override
	public void changeGuitar(FenderTelecaster type) {
		System.out.println("Angus switched to a " + type);

	}

	@Override
	public void act() {
		System.out.println("Angus ");
		Act.smash();

	}
}
