
public class Mahaia {
	private ListaKartak lista;
	private Mahaia nireMahaia;
	
	
	private Mahaia() {
		this.lista= new ListaKartak();
	}
	public Mahaia getNireMahaia() {
		if(nireMahaia==null)
			nireMahaia=new Mahaia();
		return nireMahaia;
	}
	public Karta azkenKarta(){
		Karta azkenKarta=null;
		
		return azkenKarta;
	}
}

