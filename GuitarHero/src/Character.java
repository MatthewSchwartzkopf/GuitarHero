
public interface Character {

	Slash slash = new Slash();

	public void playGuitar();

	public void act();

	void changeGuitar(GibsonSG gibsonSG);

	void changeGuitar(GibsonFlyingV type);

	void changeGuitar(FenderTelecaster type);

	void changeSoloAct(Smash smash);

	void chagenSoloAct(Stage stage);

	void changeSoloAct(Fire fire);

}
