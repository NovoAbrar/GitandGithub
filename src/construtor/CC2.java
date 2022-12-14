package construtor;

public class CC2 
{
   int a;
   int b;
   
   
   public CC2()// WITH ZERO PARAMETER 
	{
		a=25;
		b=10;	
	}
	
   public CC2(int num1)// WITH SINGLE PARAMETER 
	{
		a=num1;
		//b >> by defalut crete 	
	}
   public CC2(int num1,int num2)// using double  PARAMETER 
	{
		a=num1;
		b=num2;
	}         
        
       
	
	public static void main(String[] args) 
	
	{
		CC2 c1=new CC2();
		  c1.subtration();
		  
		 CC2 c2=new CC2(25) ;
		    c2.subtration();
		    
  
		 CC2 c3=new CC2(30, 20);
		     c3.subtration();
		    
		
		
	}
	
	public void subtration(
			)
	{
		int sub=a*b;
		System.out.println("subtration of "+sub);
	
	}
   
   
   
   
   
   
   
	
	
	

}
