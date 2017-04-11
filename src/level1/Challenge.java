package level1;

import processing.core.PApplet;

public class Challenge extends Head {
	Roomba roomba;

	public static void main(String[] args) {
		PApplet.main("level1.Processing");
	}

	public Challenge(Roomba roomba) {
		super(roomba);
	}
	/**
	 * Without touching the wall reach the endZone
	 */
	public void initialize() {
driveDirect(500,500);
sleep(2500);
driveDirect(0,350);
sleep(1000);
driveDirect(480,480);
sleep(8000);
driveDirect(0,350);
sleep(1000);
driveDirect(500,500);
	}

	public void loop() {
	
	}
}
