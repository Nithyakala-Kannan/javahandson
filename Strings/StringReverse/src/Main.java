import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String humpty;
		StringBuilder dumpty=new StringBuilder();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter humpty sentence");
		humpty=sc.nextLine();
		dumpty.append(humpty);
		System.out.println("Dumpty says:"+dumpty.reverse());
	}

}
