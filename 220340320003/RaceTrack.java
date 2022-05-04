class Car{
	private int year ;
	private String make ;
	private double speed ;
	Car (int year, String make, double speed){
		this.year = year;
		this.make = make;
		this.speed =speed;
	}
	void accelerate(){
		speed=speed+1;
	}
	public int getyear(){
		return this.year;
	}
	public String getmake(){
		return this.make;
	}
	public double getspeed(){
		return this.speed;
	}
}
class RaceTrack{
	public static void main (String[] args){
		
		Car c1 = new Car(2010,"porsche",20.0);
		System.out.println(c1.getyear());
		System.out.println(c1.getmake());
		System.out.println(c1.getspeed());
		
		c1.accelerate();
		System.out.println(c1.getspeed());
	}
}
