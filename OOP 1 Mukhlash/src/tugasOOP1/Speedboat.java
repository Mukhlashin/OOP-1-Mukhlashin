package tugasOOP1;

public class Speedboat {
	
	//Atribut Speedboat
	
	int speed;
	int fuel;
	int tilt;
	int weight;
	int passenger;
	String merk;
    boolean engineStart;
    boolean radioTransmitter;
    
    // Membuat Fungsi Untuk Kemampuan Berlayar
    void cruiseAbility() {
    	System.out.println("You are Driving A Yamaha Speedboat");
    // Indikator Bahan Bakar
    	System.out.println("Your Fuel Is " + fuel + " Litre");
    // Membuat Condition Untuk Bahan Bakar. Jika Bahan Bakar = 0 (Habis), Maka System Akan mengeluarkan Output "Fuel Tank Is Empty".   
    	if (fuel <= 0) {
    		System.out.println("Fuel Tank Is Empty");
    // Jika Fuel Dibawah atau sama dengan 2, Maka Output Yang keluar Adalah "Your Fuel Tank Is In Low Level".
    	} else if (fuel <= 2) {
    		System.out.println("Your Fuel Tank Is In Low Level");
    // Melanjutkan ke weightCheck	
    		weightCheck();
    //Dan Jika Fuel Diatas 2, Maka Outputnya Adalah "Your Fuel Is Enough To Cruise".
    	} else {
    		System.out.println("Your Fuel Is Enough To Cruise");
    
    		 }
    	}
    
    // Membuat fungsi Untuk Mengecek Berat
    void weightCheck() {
    // Indikator Jumlah Penumpang
    	System.out.println("Passenger In Your Boat More or less Is " + passenger + " Person");
    // Membuat Condition Untuk Massa Kapal. Jika Massa Kapal >= 150 (KG), Maka System Akan mengeluarkan Output "Your Boat Is Weight Is Too Heavy. Lose Weight Now!".    
    	if (weight >= 150) {
        	System.out.println("Your Boat Is Weight Is Too Heavy. Lose Weight Now!");
        // Jika Massa Kapal Diatas atau sama dengan 200, Maka Output Yang keluar Adalah "Your Boat Is Began To Sink. LOSE WEIGHT NOW!!!".
        } else if (weight >= 200) {
        	System.out.println("Your Boat Is Began To Sink. LOSE WEIGHT NOW!!!");
        // Melanjutkan ke Pengecekan Mesin
        	engineCheck();
        	// Namun Jika Massa Kapal dibawah 150, Maka Output yang akan keluar adalah "Your Boat Weight Is Normal".
        } else {
        	System.out.println("Your Boat Weight Is Normal");
         }
    }
    // Membuat Fungsi Untuk Mengecek Mesin
    void engineCheck() {
    	// Membuat Condition Untuk Mengecek kondisi Mesin Kapal. Jika Mesin Kapal Mati (false), Maka System Akan mengeluarkan Output "Engine Is Turned Off".
    	if (!engineStart) {
    		System.out.println("Engine Is Turned Off");
    	// Melanjutkan ke Pengecekan Radio
    	 radioCheck();
    		// Jika Mesin Kapal Sedang Menyala (true), maka System Akan mengeluarkan Output "Engine Starting.......Engine On".
    	} else {
    		System.out.println("Engine Starting.......Engine On");
    	 }
    }
    // Membuat Fungsi Untuk Mengecek Radio Transmisi
    	void radioCheck() {
    	// Membuat Condition Untuk Mengecek kondisi Radio Kapal. Jika Radio Kapal Mati (false), Maka System Akan mengeluarkan Output "Your Radio Is Turned Off. Turn It On If You Want To Cruise".
    		if (!radioTransmitter) {
    			System.out.println("Your Radio Is Turned Off. Turn It On If You Want To Cruise");
    	// Melanjutkan Ke Pengecekan Kecepatan
    			speedCheck();
    		} else {
    	// Jika Radio Kapal Sedang Menyala (true), maka System Akan mengeluarkan Output "Your Radio Is Turned On. Ready To Cruise".
    			System.out.println("Your Radio Is Turned On. Ready To Cruise");
    	
    		 }
    	}
    // Membuat Fungsi Untuk mengecek Kecepatan Kapal
    void speedCheck() {
    	// Indikator Kecepatan Kapal
    	System.out.println("Your Boat Speed Is " + speed + " MPH");
    	// Membuat Condition Untuk Mengecek Kecepatan Kapal. Jika Kecepatan Kapal Diatas / = 85 (MPH), Maka System Akan Mengeluarkan Output "Your Boat Is Too Fast. Decrease Speed".
    	if (speed >= 85) {
    		System.out.println("Your Boat Is Too Fast. Decrease Speed");
    	// Jika Kecepatan Kapal Diatas atau sama dengan 100, Maka Output Yang keluar Adalah "YOUR BOAT IS AT MAXIMUM SPEED. YOUR BOAT CAN BE DAMAGED. DECREASE SPEED NOW! ".
    	} else if (speed >= 100) {
    		System.out.println("YOUR BOAT IS AT MAXIMUM SPEED. YOUR BOAT CAN BE DAMAGED. DECREASE SPEED NOW! ");
    	// Melanjutkan ke Pengecekan Kemiringan
    		tiltCheck();
    		// Namun Jika Kecepatan Kapal dibawah 85, Maka Output yang akan keluar adalah "Your Boat Speed Is Normal".
    	} else {
    		System.out.println("Your Boat Speed Is Normal");
    	
    	} 
    }
    // Membuat Fungsi untuk mengecek Kemiringan Kapal
    void tiltCheck() {
    	// Indikator Kemiringan Kapal
    	System.out.println("Your Boat Tilt Is " + tilt + " Degrees");
    	// Membuat Condition Untuk Mengecek Kemiringan Kapal. Jika Kemiringan Kapal Diatas / = 25 (Derajat), Maka System Akan Mengeluarkan Output "Your Boat is Lopsided. Considered To Neutralize Boat Tilt".
    	if (tilt >= 25) {
    		System.out.println("Your Boat is Lopsided. Considered To Neutralize Boat Tilt");
    	// Jika Kemiringan Kapal Diatas atau sama dengan 45, Maka Output Yang keluar Adalah "Your Boat Is Almost Upside Downed. NEUTRALIZE THE BOAT TILT NOW!".
    	} else if (tilt >= 45) {
    		System.out.println("Your Boat Is Almost Upside Downed. NEUTRALIZE THE BOAT TILT NOW!");
    	// Namun Jika Kecepatan Kapal dibawah 25, Maka Output yang akan keluar adalah "Your Boat Tilt Is Normal".
    	} else {
    		System.out.println("Your Boat Tilt Is Normal");
    	}
    }
    
    String rtString() {
    	
    	return "Yamaha";
    }
}
