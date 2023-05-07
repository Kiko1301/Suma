import java.util.Scanner;

public class Suma {
public static void main(String[] args) {
	int a,b,c,d,e;
	int parni = 0, neparni=0;
		
		Scanner tastatura = new Scanner(System.in);
		
		System.out.println("Vnesete go prviot broj");
			a=tastatura.nextInt();
		System.out.println("Vnesete go vtoriot broj");
			b=tastatura.nextInt();
		System.out.println("Vnesete go tretiot broj");
			c=tastatura.nextInt();
		System.out.println("Vnesete go cetvrtiot broj");
			d=tastatura.nextInt();
		System.out.println("Vnesete go pettiot broj");
		e=tastatura.nextInt();
		
		if (a%2==0) {
			parni=parni+a;
		}
		else {
			neparni=neparni+a;
		}
		if (b%a==0) {
			parni=parni+b;
		}
		else {
			neparni=neparni+b;
		}
		if (c%2==0) {
			parni=parni+2;
		}
		else {
			neparni=neparni+2;
		}
		if (d%2==0) {
			parni=parni+2;
		}
		else {
			neparni=neparni+2;
		}
		if (e%2==0) {
			parni=parni+2;
		}
		else {
			neparni=neparni+2;
		}
		
			System.out.println("Sumata na parni broevi e:" + parni);
			System.out.println("Sumata na neparni broevi e:" + neparni);
		
	}

}
