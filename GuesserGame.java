import java.util.*;
class Guesser{
	int num;
	int GuessNum(){
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Guesser:Guess the number:");
		num=sc.nextInt();
		return num;
	}
}
class Players{
	int num;
	int GuessNum(){
		Scanner sc=new Scanner(System.in);
		System.out.print("Player:Guess the number:");
		num=sc.nextInt();
		return num;
	}
}
class Empire{
	
	int gnum,p1num,p2num,p3num;
	
	void GnumCollect() {
		Guesser g=new Guesser();
		gnum=g.GuessNum();
	}
	
	void PnumCollect() {
		Players p=new Players();
		p1num=p.GuessNum();
		p2num=p.GuessNum();
		p3num=p.GuessNum();
		
	}
	
	void compare() {
		if(gnum==p1num) {
	
		if(gnum==p1num && gnum==p2num && gnum==p3num) 
				System.out.println("All players win");
			
			else if(gnum==p1num && gnum==p2num) 
				System.out.println("Player1 and Player2 wins");
			
			else if(gnum==p1num && gnum==p3num) 
		
				System.out.println("Player1 and Player3 wins");
		
			else 
				System.out.println("Player1 wins");
			
        }
		
	   else if(gnum==p2num) {
		   if(gnum==p2num && gnum==p3num)
			System.out.println("Player2 and Player3  wins");	
		   else
			   System.out.println("Player2 wins");
	   }
		else if(gnum==p3num)  
			System.out.println("Player3 wins");
		
		else
			System.out.println("No players wins");
		
	}
}
	


public class GuesserGame {

	public static void main(String[] args) {
			Empire e=new Empire();
			e.GnumCollect();
			e.PnumCollect();
			e.compare();
 
	}
}


