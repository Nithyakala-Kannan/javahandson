import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> names=new ArrayList<String>();
		char ch;
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<=names.size();i++)
		{
			System.out.println("Enter the User Name"+(i+1));
			names.add(sc.nextLine());
			
			System.out.println("Do you want to continue (y/n)?");
			ch=sc.next().charAt(0);
			sc.nextLine();
			if(ch=='y')
				continue;
			else
				break;	
		}
		System.out.println("The names entered are:");
		for(String s:names)
			System.out.println(s);
		
	}

}
 