import java.util.Random;
import java.util.Scanner;

public class CoinTos {
	public static int i;
	public static int coin;
	public static int head=0;
	public static int tail=0;

	public static void main(String[] args) {
		System.out.println("Who are you?");
		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		System.out.println("Hello, "+str+"!");

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

		System.out.println("Heads: "+head+", Tails: "+tail);
		if(head>=2) System.out.println(str+" won!");
		else System.out.println(str+" lost.");
	}
}
