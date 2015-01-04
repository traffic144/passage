
import java.util.ArrayList;
import java.util.Random;

public class MutationRandom extends Mutation {
public void swap(ArrayList<Integer> l)
{
	Integer h;
	Random rand = new Random();

    int left = rand.nextInt(l.size() + 1);
    int right = rand.nextInt(l.size() + 1);
	h=l.get(left);
	l.set(left, l.get(right));
	l.set(right, h);
}
}