package orientedprogram;

public class Phone {

	// name
	// color
	// size
	// camera

	public String name;
	public String color;
	public String size;
	public double camera;

	public Phone(String name, String color, String size, double camera) {
		this.name = name;
		this.color = color;
		this.size = size;
		this.camera = camera;

	}
	

	String takepicture() {
		return "show my photo";
	}

	String music() {
		return "play music";
	}

	public static void main(String[] args) {

		Phone myphone = new Phone("iphone", "blue", "small", 64.66);
		
		System.out.println(myphone.name);

		System.out.println(myphone.color);

		System.out.println(myphone.size);

		System.out.println(myphone.camera);

		System.out.println(myphone.takepicture());
		System.out.println(myphone.music());

		System.out.println("**************************************************");

		Phone yourphone = new Phone("samsaung", "black", "big", 78.90);

		System.out.println(yourphone.name);

		System.out.println(yourphone.color);

		System.out.println(yourphone.size);

		System.out.println(yourphone.camera);

		System.out.println(yourphone.takepicture());
		System.out.println(yourphone.music());

	}
	
	

}
