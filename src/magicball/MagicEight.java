package magicball;
import java.util.Random;
import java.util.Scanner;
public class MagicEight{
    public static void main(String[] args){
 Scanner receiveInput= new Scanner(System.in);

 	
 String[] answer=new String[20];
answer[0]=  "It is certain";
answer[1]= "It is decidedly so";
answer[2]="Without a doubt";
answer[3]="Yes definitely";
answer[4]="You may rely on it";
answer[5]="As I see it, yes";
answer[6]="Most likely";
answer[7]="Outlook good";
answer[8]="Yes";
answer[9]="Signs point to yes";
answer[10]="Reply hazy try again";
answer[11]="Ask again later";
answer[12]="Better not tell you now";
answer[13]="Cannot predict now";
answer[14]="Concentrate and ask again";
answer[15]="Don't count on it";
answer[16]="My reply is no";
answer[17]="My sources say no";
answer[18]="Outlook not so good";
answer[19]="Very doubtful";
 	
Random r = new Random();
System.out.println("Enter your question: ");
 
do {	String inString=	receiveInput.nextLine();
		System.out.println("You asked: "+inString);
		int x = 1 + r.nextInt(10);
		System.out.println("Magic 8 ball says: "+answer[x]); 	
		System.out.println("Do you have another question for the Magic 8-Ball? (y/n) ");
		if (receiveInput.next().equalsIgnoreCase("n"))
		{break;}   ;
 	}while(receiveInput.next().equalsIgnoreCase("y"));
 	
 	System.out.println("Thank you for using the magic ball!");
 	}
 }