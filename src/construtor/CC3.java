package construtor;

public class CC3 
{

//varaibel delecrtion 


	String name;
	int age;
	float weight;
	
	//Assign the values 
	  
	public CC3()
	{
		name="RK";
		System.out.println("NAME "+name);
		age=22;
		System.out.println("age is  "+age);
		weight=65;
		System.out.println("weight "+weight);
		
		
	}
	
    public CC3(String a)        //USING SINGLE PARAMETER
	{
		name=a;
	
	}
    
    
    public CC3( int b,float c)        // USING DOUBLE PARAMETER 
	{
		age=b;
		weight=c;
		
	}
	public static void main(String[] args) 
	{
		
		  CC3 c1=new CC3();
		
		  System.out.println("======================================");
		
		 CC3 c2=new CC3("ABRAR");    //Double parameter 
		    c2.myinformation();;
		    
		    
		 CC3 c3=new CC3(25 , 60);    //Three parameter 
		    c3.myinf();
		    	
	}
	
	public void myinformation()
	  
	{
		System.out.println("MY  NAME  IS  " +name);
		
	}
		
    public void myinf()
	{
		System.out.println("ABRAR AGE  IS  " +age+" YERAS" );
		System.out.println("ABRAR  WEIGHT IS "+weight+ "KG");
	}
	
	
}
