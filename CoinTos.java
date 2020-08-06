import java.util.Random;

public class CoinTos {
	public static int i;
	public static int coin;
	public static int head=0;
	public static int tail=0;

	public static void main(String[] args) {
		Random rnd = new Random();
		System.out.println("Tossing a coin...");
		for(i=1; i<=3; i++) {
			int coin = rnd.nextInt(2);
			if(coin==0) {
				System.out.println("Round "+i+": Head");
				head++;
			}else{
				System.out.println("Round "+i+": Tali");
				tail++;
			}
		}
		System.out.println("Heads: "+head+", Tails: "+tail);
	}
}
