import java.util.Scanner;
public class Demo
{

    public static void game()
    {
        int i,guess;
       
        Scanner sc=new Scanner(System.in);
        int num = 1+(int)(100*Math.random());
        int t=10;
        
        System.out.println("A number is chosen between 1 to 100 " + '\n' + "Guess the number within 10 trials");

    

for(i=0;i<t;i++)
{
    System.out.print("Guess the number: ");
    
    guess=sc.nextInt();
   
    if(num==guess)
    {
        System.out.println("Congratulations!! You have guessed the right number");
        System.out.println("Your score is 10");
       break;
    }
    else if(num>guess && i!=t-1)
    {
        System.out.println("The number is higher than "+ guess);
        
    }
    else if(num<guess && i!=t-1)
        {
            System.out.println("The number is lower than "+ guess);
        }
}
    if(i==t)
    {
        System.out.println("Sorry..You Lose the Game" + '\n' + "Try again!");
        System.out.println("The generated number was "+ num);
       
    }
}

public static void main(String args[])
{ 
 game();
}
}