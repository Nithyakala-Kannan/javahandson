import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String humpty,dumpty;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter humpty's sentence");
		humpty=sc.nextLine();
		char ch[]=humpty.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			if(Character.isUpperCase(ch[i]))
				ch[i]=Character.toLowerCase(ch[i]);
			else if(Character.isLowerCase(ch[i]))
				ch[i]=Character.toUpperCase(ch[i]);
			}
		
		dumpty=new String(ch);
       System.out.println("Converted String is: "+dumpty);
	}

}
