package orientedprogram;

public class Object {

	
	//name
	//age
	//coLLage
	
	
	
	public String name= "shaheera";
    public int age = 22;
	public String coLLage = "Harvard";
	
	
	
	public Object () {
		
		this.name="";
		this.age=0;
	    this.coLLage="";
		
	}
	
	
	public Object (String name,int age, String coLLage) {
		
		this.name=name;
		this.age=age;
		this.coLLage=coLLage;
		
	}

	public static void main(String[] args) {
		
		Object myobject = new Object("shaheera", 22,"Harvard" );
		
		System.out.println("name"+ ": "+myobject.name);
		System.out.println( "age"+" :"+myobject.age);
		System.out.println("college"+" :"+myobject.coLLage);
		System.out.println("***********************************************");
		Object tesla = new Object("xl",2023,"dallas");
		System.out.println("name"+ ": "+tesla.name);
		System.out.println("age"+" :"+tesla.age);
		System.out.println("college"+" :"+tesla.coLLage);
		
		
	}
}

