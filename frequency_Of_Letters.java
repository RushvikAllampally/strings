package Coding_Guru.src;
import java.util.*;

public class frequency_Of_Letters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<Character,Integer> map = new HashMap<>();
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter the string");
		
		String str = in.nextLine();
		for(int i=0;i<str.length();i++) {
			if((str.charAt(i) >=  65 && str.charAt(i) <= 90 ) || (str.charAt(i) >=  97 && str.charAt(i) <= 122 ) ) {
			map.put(str.charAt(i), map.getOrDefault(str.charAt(i),0)+1);
			}
		}
		System.out.println("The frequency of all letters are :");
		for(char i : map.keySet())
			System.out.println("letter: "+ i + " frequency :"+ map.get(i));
		
		
	}

}
