package aplc.myclass.tutorial4.purity;

public class Calculator {

	int i, j;
	
	int add() 
	{
		return i+j; //side effect noticed...
	}
	
}
