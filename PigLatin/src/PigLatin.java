import java.util.*;


public class PigLatin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Character> list = new ArrayList();
		System.out.println("enter a word");
		Scanner k = new Scanner(System.in);
		String input = k.nextLine();
		
		char[] arr2 = {};
		char[] vowels = {'a','e','i','o','u'};
		CharSequence vowels2="aeiou";
		
		if(input.charAt(0)=='a'|| input.charAt(0)=='e' ||
				input.charAt(0)=='i' || input.charAt(0)=='o' ||
				input.charAt(0)=='u')
		{
			System.out.println(input+"yay");
			
		}
		if(input.charAt(0)!='a'|| input.charAt(0)!='e' ||
				input.charAt(0)!='i' || input.charAt(0)!='o' ||
				input.charAt(0)!='u' && input.contains(vowels2))
		{
			
			char[] arr = input.toCharArray();
			 
			for (char output : arr) {
				System.out.print(output);
				
			}
			
			
			for (int i =0; i<arr.length;i++)
			{
				if(arr[i]=='a'|| arr[i]=='e'|| arr[i]=='i'|| arr[i]=='o'|| arr[i]=='u')
				{
					
					
						list.add(arr[i]);
					
				}
			}
			
			
		}
		
		int ansa = input.indexOf('a');//positive if contains 
		int anse = input.indexOf('e');
		int ansi = input.indexOf('i');
		int anso = input.indexOf('o');
		int ansu = input.indexOf('u');
		
		if(ansa<0 || anse<0 || ansi<0 || anso<0|| ansu<0)
		{
			System.out.println( input+"ay");
		}
		
		
		
	
		
		

	
	}


}
