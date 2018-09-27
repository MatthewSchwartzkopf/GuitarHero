
public interface Act {

	Act fire = new Fire();
	Act smash = new Smash();
	Act stage = new Stage();

	public void act();

	static void smash() {
		// TODO Auto-generated method stub
		smash.act();
	}

	static void fire() {
		fire.act();
	}

	static void stage() {
		// TODO Auto-generated method stub
		stage.act();
	}

}
