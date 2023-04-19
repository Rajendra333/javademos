package innerclass;

public class innerClassDemo2 {
	
	public static void main(String[] args) {
		Car car=new Car("Blue");
		car.start();
		
		Car.MusicSystem ms= car.new MusicSystem(8);
		ms.playMusic();
	}

}
class Car{
	private static String model="Hyndai";
	private String colour;
	
	void start() {
		System.out.println("car with"+colour+"colour is starting");
	}
	Car(String clolour){
		this.colour=colour;
	}
	
	class MusicSystem{
		private int noofchannels;
		
		MusicSystem(int num){
			this.noofchannels=num;
		}
		
		void displayDetails() {
			System.out.println("Model of the car:"+Car.model);
			System.out.println("colour of the car:"+Car.this.colour);
			System.out.println("Number of channels of Music System:"+this.noofchannels);
		}
		
		void playMusic() {
			System.out.println("play sme music:");
			
			class channel{
				int frequency;
				void getCurrentPlaySong() {
					System.out.println("Dispalying current playing song");
				}
			}
			
			channel ch=new channel();
			ch.getCurrentPlaySong();
		}
		
	}
}
