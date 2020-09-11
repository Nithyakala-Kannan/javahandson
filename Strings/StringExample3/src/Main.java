import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String humpty,dumpty;
		int position;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter humpty Sentence:");
		humpty=sc.nextLine();
		System.out.println("Humpty says:"+humpty);
		System.out.println("What dumpty want to insert and Where?");
		dumpty=sc.nextLine();
	    System.out.println("Enter Position");
	    position=sc.nextInt();
	    sc.nextLine();
	    System.out.println("Humpty's New Sentence:"+humpty.substring(0,position)+dumpty+humpty.substring(position-1));
	}

}
