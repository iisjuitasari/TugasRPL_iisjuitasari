public class Dapartment {

	private String name;

	public Dapartment(String name)
	{
		name = name;
		teachers = new List<Teacher>();
	}
	public String Name {
		get {return name;}
		set {name = value;}
	}
	public List<Teacher> teachers;
}