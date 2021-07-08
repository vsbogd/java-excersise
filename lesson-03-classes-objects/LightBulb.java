class LightBulb {

	int brightness;
	boolean is_on;

	LightBulb(int brightness) {
		this.brightness = brightness;
		this.is_on = false;
	}

	void turn_on() {
		// this.is_on = true;	
		is_on = true;
	}

	void turn_off() {
		is_on = false;
	}

	void show() {
		if (is_on) {
			System.out.println("LightBulb is on, brightness=" + brightness);
		} else {
			System.out.println("LightBulb is off");
		}
	}

	public static void main(String[] args) {
		LightBulb bulb = new LightBulb(900);
		bulb.show();

		LightBulb bulb2 = new LightBulb(600);
		bulb2.show();

		bulb2.turn_on();
		bulb2.show();

		bulb.show();
		
	}

}
