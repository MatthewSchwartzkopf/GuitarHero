
public interface Act {

	Act fire = new Fire();
	Act smash = new Smash();
	Act stage = new Stage();

	public void act(String name);

	static void smash(String name) {
		// TODO Auto-generated method stub
		smash.act(name);
	}

	static void fire(String name) {
		fire.act(name);
	}

	static void stage(String name) {
		// TODO Auto-generated method stub
		stage.act(name);
	}

}
