import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String humpty,dumpty,new_word;
		Scanner sc=new Scanner(System.in);
		dumpty=sc.nextLine();
		System.out.println("Dumpty says:"+dumpty);
		System.out.println("What humpty want to Remove:");
		humpty=sc.nextLine();
		new_word=dumpty.replace(humpty,"");
		System.out.println("Dumpty's new sentence:"+new_word);	
	}

}
