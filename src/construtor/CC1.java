package construtor;

public class CC1

//in constucotr only we can use in non statice methode 

//no return type in main mathode 
//calss name and construtore name shoud be same 
//but parameter should be differnace 
//


{
	int a;
	int b;
	public CC1()// WITH ZERO PARAMETER 
	{
		a=50;
		b=30;	
	}
	
	
	
	
	
	
    public CC1(int num1)// WITH SINGLE PARAMETER 
	{
		a=num1;
		//b >> by defalut crete 	
	}
    public CC1(int num1,int num2)// using double  PARAMETER 
	{
		a=num1;
		b=num2;
	}         
       
    
    
    
    
	public static void main(String[] args) 
	
	{
		CC1 c1=new CC1();
		  c1.addition();
		  
		 CC1 c2=new CC1(20) ;
		    c2.addition();
		  
		 CC1 c3=new CC1(10, 20);
		     c3.addition();
		    	
	}
	
	public void addition()
	{
		int sum=a+b;
		
		System.out.println("print the "+sum);
		
		
	}
	
	
	
	
	
}
