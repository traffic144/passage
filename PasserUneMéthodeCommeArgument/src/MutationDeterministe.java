
import java.util.ArrayList;

public class MutationDeterministe extends Mutation{
	public void swap(ArrayList<Integer> l)
	{
		Integer h;

	    int left = 0;
	    int right = l.size()-1;
		h=l.get(left);
		l.set(left, l.get(right));
		l.set(right, h);
	}
}
