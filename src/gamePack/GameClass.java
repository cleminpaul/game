package gamePack;


import java.util.Random;
import java.util.Scanner;
public class GameClass {
	
	Scanner sc = new Scanner(System.in);
	 public void game() {
		String[] nameGuess = {"aleena","angel","asha","clemin","gopesh","hamneet","jimna","jobin","jude","kamaldeep","manpreetk","manpreets","mariya","namitha","neelam","nisha","parminder","rajat","rojy","sojan","suchaitra","vindhuja"};
	System.out.println("welcome to the game");
	Random rand = new Random();
	int index = rand.nextInt(nameGuess.length);
	String randomName = (nameGuess[index]);
	String reply1 = randomName.replace("[a-z]", "-");  
	System.out.println("lets play the game");
	//System.out.println(randomName,reply1);
	
	}
	 public void start(String randomName, String reply) {
		//Scanner input = new Scanner(System.in);
		int guess =0;
		int wrongGuess =0;
		String guessdup;
		char letter;
		boolean guessCurrect;
		String word =" ";
		boolean guessWord;
		while(wrongGuess<5 && reply.contains("_")){
			System.out.println(reply+"\n");
			int temp = 5- wrongGuess;
			if (wrongGuess!=0) {
				System.out.println("you have guess"+temp+"guesses left");
				guess = sc.nextInt();
				letter = guessdup.charAt(0);
				guessCurrect=(guessdup.indexOf(letter))!=1;
				guess+=letter;
 				if(guessCurrect==true) {
 					System.out.println("you already guessed"+letter); 					
 				}
 				guessWord=(randomName.indexOf(letter))!=1;
 				if(guessWord==true) {
 					System.out.println(+letter+"is present n the word");
 					for(int position =0;position<randomName.length;position++) {
 						if(randomName.charAt(position)==letter && reply.charAt(position)!=letter) {
 							reply = reply.replaceAll("_", "_");
 							String reply2;
 							reply2= reply.substring(0, position)+letter+reply.substring(position,1 );
 							reply2=reply2.replaceAll("_", "_");
 							reply=reply2;
 							}
 					}
 				}
 				else {
 					System.out.println(letter+"is not in the word");
 					wrongGuess++;
 				}
 				guess++;
 				
			}
			
		}
		if(wrongGuess==5) {
			System.out.println("you lost , maximum guess reached");
		}
		else {
			System.out.println("the word is"+reply+"well played, you did it");
		}
		
		
	}

}
