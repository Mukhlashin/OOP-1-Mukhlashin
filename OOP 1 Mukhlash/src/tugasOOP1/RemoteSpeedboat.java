package tugasOOP1;

public class RemoteSpeedboat {
	public static void main (String[] args) {
		// Membuat Objek Speedboat
		Speedboat speedboat = new Speedboat();
		
		// Mengisi Atribut Speedboat
		speedboat.fuel = 1;
		speedboat.engineStart = true;
		speedboat.passenger = 5;
		speedboat.radioTransmitter = false;
		speedboat.speed = 200;
		speedboat.tilt = 50;
		speedboat.weight = 123;
		
		speedboat.cruiseAbility();
	}

}