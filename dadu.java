import java.util.Random;
public class dadu {
    public int rollDice()
    {
        int n = 0;
        Random r = new Random();
        n=r.nextInt(7);
        return (n==0?1:n);
    }
}
