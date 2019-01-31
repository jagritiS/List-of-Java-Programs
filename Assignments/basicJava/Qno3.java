package Assignments.basicJava;

/**
 * Created by Jagriti on 1/24/2019.
 */
public class Qno3 {



	public static void main(String[] args) {
		// TODO Auto-generated method stub

	String sentence1[]=new String[100];
    String negative="not";
	int i=0;
	
	Scanner sc=new Scanner(System.in);
	System.out.println("how many sentences??");
	
	
	int num=sc.nextInt();
    System.out.println("No. of sentences" +num);
	
   
    for( i=0;i<=num;i++)
	{
    	
		sentence1[i]=sc.nextLine();
		System.out.println("Enter a sentence");
		
		
		
	}
	
	
	for( i=0;i<num;i++)
	{
		
		System.out.println("Sentence " +(i+1)+":  " +sentence1[i+1] );
		
		
		
		
	}
	System.out.println( );
	
	System.out.println("Negative Sentence:");
	for(i=0;i<num;i++)
	{
	
		
	if(sentence1[i+1].contains(negative))
	{
		
	System.out.println("Sentence " +(i+1)+":  "+sentence1[i+1] );
	
	
	}
	
	}
	System.out.println();
	
	System.out.println("Positive Sentence:");
	for(i=0;i<num;i++)
	{
		if(sentence1[i+1].contains(negative))
		{
		}
		else
			
		
	{
		
		System.out.println("Sentence " +(i+1)+":  "+sentence1[i+1] );	
	}
	
	
	}
	}
	
	
	
	
	
	
	
	
	
	
	}

















