
public class Fire implements Act {

	static String fire = "Fire";

	public Fire() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void act(String name) {
		System.out.println(name + " set the guitar on fire!");
	}

}
