package aplc.myclass.tutorial10.jpl;

import java.util.HashMap;
import java.util.Map;

import org.jpl7.Query;
import org.jpl7.Term;

public class Demo {

	public static void main(String[] args) {
		
		System.out.println( ">>> JPL connection demo..." );
		
		String loc = "tutorial10.pl";
		
		if ( connect( loc ) ) {
			System.out.println( ">> "+ loc + " connected!" );

			//one-solution
			Query q1 = new Query("male(Who)");
			System.out.println( "\n>> The following are the male: " );
			Map<String, Term> sol = q1.oneSolution();
			System.out.println( ">>Name: "+ sol.get("Who") );
			
			//multiple-solution 
			Query q2 = new Query("rich(Who)");
			System.out.println( "\n>> The following are the rich person: " );
			Map<String, Term> sol2 = new HashMap<>();
			while ( q2.hasMoreSolutions() ) {
				sol2 = q2.nextSolution();
				System.out.println( "Name: "+sol2.get("Who") );
			}
			
		} else {
			System.out.println( ">>> "+ loc + " not connected!" );
		}
		
		
	}

	static boolean connect( String location ) 
	{
		String qs = "consult('"+location+"')";
		Query q1 = new Query( qs );
		boolean connected = q1.hasSolution();
		q1.close();
		return connected;
	}
	
}
