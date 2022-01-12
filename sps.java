import java.util.Scanner;
import java.util.Random;

public class sps{

public static  void f2(String s)
{String computerChoice="";
    int num;
    Random rand=new Random();
    num = rand.nextInt(3);
        
        if(num == 0)
        {
            computerChoice = "R";
        }
        else if(num == 1)
        {
            computerChoice = "P";
        }
        else if(num == 2)
        {
            computerChoice = "S";
        }
        
        
        if(computerChoice.equals("S"))
        {
            System.out.println("The computer chose scissors.");
        }
        
        else if(computerChoice.equals("R"))
        {
            System.out.println("The computer chose rock.");
        }
        
        else if(computerChoice.equals("P"))
        {
            System.out.println("The computer chose paper.");
        }

    
        if(s.equals("R") && computerChoice.equals("S"))
        {
            System.out.println("The user won!");
        }

        else if(s.equals("P") && computerChoice.equals("R"))
        {
            System.out.println("The user won!");
        }

        else if(s.equals("S") && computerChoice.equals("P"))
        {
            System.out.println("The user won!");
        }

        else if(s.equals("S") && computerChoice.equals("R"))
        {
            System.out.println("The computer won!");
        }

        else if(s.equals("R") && computerChoice.equals("P"))
        {
            System.out.println("The computer won!");
        }

        else if(s.equals("P") && computerChoice.equals("S"))
        {
            System.out.println("The computer won!");
        }

        else if(s.equals(computerChoice))
        {
            System.out.println("Tie!");
        }
}


    public static void main(String[] args)
    {int i;
        
        
        
        String userChoice = "";
        
        
        System.out.println("Welcome to Rock, Paper, and Scissors!");
        
        do{
            System.out.print("Please choose R-rock, P-paper or S-scissors. ");
            Scanner sc=new Scanner(System.in);
        userChoice = sc.nextLine();
    f2(userChoice);
    System.out.println("Enter 1 to continue and 0 to exit");
    i=sc.nextInt();

}while(i==1);
 System.out.println("Game over");      
}}
