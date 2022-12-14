package typeofdata;

public class Type_varaibel {
	//there are 2 type ofvaraibel 
		//1.globaal varaibel 
		//2.local varaibel 
	
	
	int a=20;  //Gloaba varaivble non static  mathode 
	static int  b=30;  //globa varieb stataic methode 
	


	public static void main(String[] args) {
	 //there are 2 type ofvaraibel 
	//1.globaal varaibel 
	//2.local varaibel 
		
		//call globa varibl from non ststsice methdoe
		
		Type_varaibel tv=new Type_varaibel();
		System.out.println("call globala varaibel "+tv.a);
		
		//initalaization 
		int mul=20*tv.a;
		System.out.println("mul "+mul);
		
		//global varaibel static  mathode 
		
		
		System.out.println("ststic methdoe call "+b);
		
		//initaliazation
		int Div=100/b;
		System.out.println(" basjcg "  +Div);
		
		
		
	
	}
	
	
	
}

