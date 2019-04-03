import java.util.ArrayList;
import java.util.Iterator;
public class ListaKartak {
	private ArrayList<Karta> lista;

	public ListaKartak() {
		this.lista=new ArrayList<Karta>();
	}
	private Iterator<Karta> getIteradorea() {
		return this.lista.iterator();
	}
	
	public void gehituKarta(Karta pKarta) {
		this.lista.add(pKarta);
	}
	
	public void kenduKarta(Karta pKarta) {
		this.lista.remove(pKarta);
	}
	public int listaTamaina() {
		return this.lista.size();
	}
	public void erreseteatu() {
		this.lista.clear();
	}
	
}
