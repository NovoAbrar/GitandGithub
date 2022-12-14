package typeofdata;

public class Globalvaraibdl {
	
	
	String em ="abrar";  //non ststice methode 
	char   id='M';
	
	
	

	public static void main(String[] args)
	
	{
		
		Globalvaraibdl gb=new Globalvaraibdl();
		gb.em="abrar";
		gb.id='M';
		gb.employ();
		
		gb.em="Sham";
		
		gb.employ();
		
	}
	
	public void employ()
	{
		System.out.println("name is "+em);
		System.out.println("gemdegef is"+id);
	}
	

}
