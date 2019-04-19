public class Komputer{
 private Cpu cpu;		
	public Komputer(){
	  this.cpu = new Cpu();
	cpu.setTipe("WD1000");
	}
	public String getTipe(){
		return cpu.getTipe();
	}
}