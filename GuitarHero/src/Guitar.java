/**
 * Lab-02 GuitarHero
 * 
 * Champlain College CSI-340, Fall 2018
 * 
 * Author: Matthew Schwartzkopf And Paul Lindenberg Emails:
 * matthew.schwartzkopf@mymail.champlain.edu,
 * paul.lindenberg@mymail.champlain.edu Class : CSI-340 Assignment: Lab 02
 * GuitarHero Date Assigned: Septermber 27, 2018 Due Date: October 2, 2018
 * 
 * Description:
 * 
 * This code represents the game GuitarHero using strategy patterns and UML/
 **/

public interface Guitar {

	Guitar GibsonSG = new GibsonSG();
	Guitar GibsonFlyingV = new GibsonFlyingV();
	Guitar FenderTelecaster = new FenderTelecaster();

	public static void GibsonSG() {
	}

	public static void GibsonFlyingV() {
	}

	public static void FenderTelecaster() {
	};

}
