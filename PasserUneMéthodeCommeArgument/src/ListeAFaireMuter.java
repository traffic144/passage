import java.util.ArrayList;
import java.util.Random;

public class ListeAFaireMuter {
	private ArrayList<Integer> liste;
	
	public ListeAFaireMuter(ArrayList<Integer> l)
	{liste = l;}
	
	public ListeAFaireMuter(int taille)
	{liste = new ArrayList<Integer>(taille);
	Random rand = new Random ();
	for(int i=0; i<taille; i++) liste.add(rand.nextInt(10));
	} 
	
	public String afficher()
	{ String s = "";
		for(Integer el : liste) s+=el+" ";
		return s;
	}
	
	public ListeAFaireMuter clone ()
	{
		ArrayList<Integer> cl = new ArrayList<Integer>(liste.size());
		for(int i=0; i<liste.size(); i++) cl.add(liste.get(i));
		return new ListeAFaireMuter(cl);
	}
	
	void faireUneMutation (IMutation m)
	{
		m.swap(liste);
	}

}
