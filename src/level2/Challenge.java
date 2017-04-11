package level2;

import level1.Sonar;
import processing.core.PApplet;

public class Challenge extends Head {
	Roomba roomba;

	public static void main(String[] args) {
		PApplet.main("level2.Processing");
	}

	public Challenge(Roomba roomba) {
		super(roomba);
		Sonar sonar = new Sonar(roomba);
	}

	public void initialize() {
		driveDirect(480,480);
		sleep(4000);
		driveDirect(-6000,6000);
		sleep(350000);
		driveDirect(480,480);
		sleep(5000);
		driveDirect(50,-40);
		sleep(3500);
		driveDirect(480,480);
	}

	public void loop() {
	
	}
}
