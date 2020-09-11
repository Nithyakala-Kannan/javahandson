import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String humpty,dumpty;
		int humpty_count=0,dumpty_count=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter humpty's Sentence:");
		humpty=sc.nextLine();
		System.out.println("Enter dumpty's sentence:");
		dumpty=sc.nextLine();
		for(int i=0; i<humpty.length()-1; i++)
        {
            if(humpty.charAt(i)==' ' && humpty.charAt(i+1)!=' ')
                humpty_count++;
        }
		for(int i=0; i<dumpty.length()-1; i++)
        {
            if(dumpty.charAt(i)==' ' && dumpty.charAt(i+1)!=' ')
                dumpty_count++;
        }
		if(humpty_count>dumpty_count)
			System.out.println("Humpty has used more number of words");
		else if(humpty_count<dumpty_count)
			System.out.println("Dumpty has used more no of words");
		else
			System.out.println("Both hhas used equal no of words");	

	}

}
