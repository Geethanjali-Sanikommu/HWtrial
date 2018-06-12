import java.io.FileReader;

import java.io.PushbackReader;
import dotparse.lexer.Lexer;
import dotparse.node.Start;
import dotparse.parser.Parser;



public class Main {
	public static void main(String args[]) {
		try {
			Parser p =
					new Parser (
							new Lexer (
									new PushbackReader(new PushbackReader( 
						                     new FileReader(args[0]), 1024))));
			Start tree = p.parse(); /* parse the input */
			//System.out.println(tree);
		} 
		catch(Exception e) {
			System.out.println(e);
		}
}
}
