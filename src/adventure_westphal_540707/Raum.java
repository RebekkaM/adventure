package adventure_westphal_540707;

public class Raum {
	private int nr;
	private int nord;
	private int ost;
	private int sud;
	private int west;
	
	public Raum() {
		// TODO Auto-generated constructor stub
	}

	public int getNr() {return nr;}
	public int getNord() {return nord;}
	public int getOst() {return ost;}
	public int getSud() {return sud;}
	public int getWest() {return west;}
	
	public void setRaum(int[] raum) {
		this.nr = raum[0];
		this.nord = raum[1];
		this.ost = raum[2];
		this.sud = raum[3];
		this.west = raum[4];
	}
	
}
