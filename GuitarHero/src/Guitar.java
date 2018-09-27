
public interface Guitar {

	Guitar GibsonSG = new GibsonSG();
	Guitar GibsonFlyingV = new GibsonFlyingV();
	Guitar FenderTelecaster = new FenderTelecaster();

	public void playGuitar();

	public static void GibsonSG() {
	}

	public static void GibsonFlyingV() {
	}

	public static void FenderTelecaster() {
	};

}
