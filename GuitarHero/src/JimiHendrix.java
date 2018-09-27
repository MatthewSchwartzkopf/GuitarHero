
public class JimiHendrix implements Character {

	public JimiHendrix() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void playGuitar() {
		// TODO Auto-generated method stub
	}

	@Override
	public void act() {
		Act.fire();
	}

	@Override
	public void guitarType() {
		Guitar.FenderTelecaster();
	}

	@Override
	public void changeGuitar(GibsonSG type) {
		System.out.println("Jimi switched to a " + type.GibsonSG);
	}

	@Override
	public void changeGuitar(GibsonFlyingV type) {
		System.out.println("Jimi switched to a " + type.GibsonFlyingV);
	}

	@Override
	public void changeGuitar(FenderTelecaster type) {
		System.out.println("Jimi switched to a " + type.FenderTelecaster);
	}

}
