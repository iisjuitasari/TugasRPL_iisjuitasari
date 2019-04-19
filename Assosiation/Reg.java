public class Reg {

	Mahasiswa m;
	Mk k;
	public Reg(Mahasiswa m, Mk k){
		this.m=m;
		this.k=k;
	}
	public void display(){
		m.display();
		k.display();
	}
	public static void main(String[] a){
		Mahasiswa m1 = new Mahasiswa("Budi",20);
		Mahasiswa m2 = new Mahasiswa("Dewi",18);
		Mk k1 = new Mk("PTI",2);
		Mk k2 = new Mk("PSI",3);
		Reg r1 = new Reg(m1,k1);
		Reg r2 = new Reg(m1,k2);
		Reg r3 = new Reg(m2,k1);
		Reg r4 = new Reg(m2,k2);
		r1.display();
		r2.display();
		r3.display();
		r4.display();
	}
}