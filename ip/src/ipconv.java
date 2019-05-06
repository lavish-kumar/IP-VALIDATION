import java.util.ArrayList;
import java.util.Scanner;


public class ipconv {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ArrayList<String> l = new ArrayList<String>(); 
		Scanner sc = new Scanner(System.in);
		String ip_p = sc.next();
		String ip = ip_p+".";
		String k ="";
		int count = 0;
		for (int j=0;j< ip.length();j++){
			if(ip.charAt(j)=='.'){
				//count++;
				l.add(k);
				k ="";
			}
			else
			{k = k+ip.charAt(j);}
		}
		
	String x ="";
	for(String s : l){
		System.out.print(" ");
		int n = Integer.parseInt(s);
		//System.out.print(" "+n);
		while(n > 0)
	    {
	        int a = n % 2;
	        x = a + x;
	        n = n / 2;
	    }
		n=0;
		System.out.print(x);
		x="";
	}

	for(String s : l){
		int n = Integer.parseInt(s);
		if(n<256)
			count++;
	}
	
	if(count==4)
		System.out.println("\nTHE IP ADDRESS PROVIDED IS CORRECT");
	else System.out.println("\nTHE IP ADDRESS PROVIDED IS --------- INCORRECT---------");
	

	int n = Integer.parseInt(l.get(0));
	if(count==4){
	if (n<128&&n>=0){	System.out.println("\nCLASS : A");}
	else if (n<192&&n>=128){	System.out.println("\nCLASS : B");}
	else if (n<224&&n>=192){	System.out.println("\nCLASS : C");}
	else if (n<240&&n>=224){	System.out.println("\nCLASS : D");}
	else System.out.println("\nCLASS : E");
	}
	
	else
		System.out.println("\nCLASS CAN NOT BE DETERMINED OF AN INVALID CLASS.");
	
	}

	
	
}
