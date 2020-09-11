import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    String humpty,word,synonym,dumpty;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter humpty sentence");
    humpty=sc.nextLine();
    System.out.println("Word to replace");
    word=sc.nextLine();
    System.out.println("Synonym:");
    synonym=sc.nextLine();
    dumpty=humpty.replace(word, synonym);
    System.out.println("Replaced String:"+dumpty);
    
	}

}
