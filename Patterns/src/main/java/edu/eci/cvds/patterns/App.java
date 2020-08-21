package edu.eci.cvds.patterns;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
		String nombre="";
		for( String parte : args) {
			nombre+=parte+" ";
		}
		if( nombre.equals(" ") ) {
			System.out.println("Hello world!" );
			
		}
		else {
			System.out.println(   "Hello "+nombre+"!" );
		}
    }
}