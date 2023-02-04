package dxc;

class Func {
	int channel = 1; 
	int volumeLevel = 1; 
	boolean on = false; 
	
	public Func() {
	}
	
	public void turnOn() {
		on = true;
	}
	
	public void turnOff() {
		on = false;
	}
	
	public void setChannel(int newChannel) {
		if (on && newChannel >= 1 && newChannel <= 120)
			channel = newChannel;
	}

	public void setVolume(int newVolumeLevel) {
		if (on && newVolumeLevel >= 1 && newVolumeLevel <= 7)
			volumeLevel = newVolumeLevel;
	}

	public void channelUp() {
		if (on && channel < 120)
			channel++;
	}

	public void channelDown() {
		if (on && channel > 1)
			channel--;
	}

	public void volumeUp() {
		if (on && volumeLevel < 7)
			volumeLevel++;
	}

	public void volumeDown() {
		if (on && volumeLevel > 1)
			volumeLevel--;
	}
}

	public class tv {
		public static void main(String[] args) {
			Func t1 = new Func();
			t1.turnOn();
			t1.setChannel(30);
			t1.setVolume(3);
			Func t2 = new Func();
			t2.turnOn();
			t2.channelUp();
			t2.channelUp();
			t2.volumeUp();
			System.out.println("1st TV channel is " + t1.channel+ " ,the volume is " + t1.volumeLevel);
			System.out.println("2nd TV channel is " + t2.channel+ " ,the volume is " + t2.volumeLevel);
		}
	}