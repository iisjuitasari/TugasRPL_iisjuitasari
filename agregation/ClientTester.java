public class ClientTester{

	public void AggregationTest()
	{
		var depar = new dapartment("Electrical Engineering");
		var teacher1 = new Teacher("Teacher 1");
		var teacher2 = new Teacher("Teacher 2");

		depar.teachers.Add(teacher1);
		depar.teachers.Add(teacher2);
	}
	
}