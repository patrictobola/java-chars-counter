package org.lessons.java.charscounter;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Scegli una parola/frase da scomporre: ");
		String value = in.nextLine();
		
		Map<Character, Integer> charCounter = new HashMap<>();
		
		for(Character c : value.toLowerCase().toCharArray()) {
			if(charCounter.containsKey(c)) {
				charCounter.put(c, charCounter.get(c) + 1);
			} else {
				charCounter.put(c, 1);
			}
		}
		
		System.out.println(charCounter);
		
	}

	

}
