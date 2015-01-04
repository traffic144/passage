
public class TestMutations {

	public static void main(String[] args) {
		
		ListeAFaireMuter listeTest = new ListeAFaireMuter(10);
		System.out.println(listeTest.afficher());
		ListeAFaireMuter etSonClone = listeTest.clone();
		System.out.println(etSonClone.afficher());
		
		Mutation mr = new MutationRandom();	
		listeTest.faireUneMutation(mr);
		System.out.println("mutation random "+listeTest.afficher());
		
		Mutation md = new MutationDeterministe();
		etSonClone.faireUneMutation(md);
		System.out.println("mutation deterministe "+etSonClone.afficher());
	}

}
