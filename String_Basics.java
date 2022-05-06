package Coding_Guru.src;

public class String_Basics {

	public static void main(String[] args) {
	
		String s = "hello world";
		
		System.out.println(s.length());
		System.out.println(s.isEmpty());
		
		//Comparision
		
		System.out.println(s.equals("hello world!"));
		System.out.println(s.equalsIgnoreCase("HELLO WORLD!"));
		System.out.println(s.compareTo("hello world!"));
		
		//Searching 
		
		System.out.println(s.contains("hello"));
		System.out.println(s.contains("world !"));
		System.out.println(s.startsWith("hello"));
		System.out.println(s.endsWith("world"));
		System.out.println(s.indexOf("lo"));
		System.out.println(s.lastIndexOf("o"));
		
		
		//individual characters 
		
			System.out.println(s.charAt(0));
			
		//extracting substring
			System.out.println("length : " + s.length());
			System.out.println(s.substring(11));
			System.out.println(s.substring(4,9));
			
		//case conversion
			System.out.println(s.toUpperCase());
			System.out.println(s.toLowerCase());
			System.out.println(s.trim());
			
		//replace
			
			System.out.println(s.replaceAll("o","r"));
			
		//split
			
			String[] split = s.split("o");
			
			for(String temp : split) {
				System.out.println(temp);
			}
			
		//equals
			String s1 = new String("hello world");
			System.out.println(s1.equals(s));
			System.out.println(s1 == s );

	}

}
