
/* Create an AST, then invoke our interpreter. */ 
//import lexAndParse.interpret.Interpret; 
import lexAndParse.parser.* ; 
import lexAndParse.lexer.* ; 
import lexAndParse.node.* ; 
import lexAndParse.analysis.*;
  
import java.io.* ; 

  
public class Main {
	
	 public static void main(String[] args) { 
	      if (args.length > 0) { 
	         try { 
	            /* Form our AST */ 
	            Lexer lexer = new Lexer (new PushbackReader( 
	               new FileReader(args[0]), 1024)); 
	            Parser parser = new Parser(lexer); 
	            Start ast = parser.parse() ; 
	  
	            /* Get our Interpreter going. */ 
	            //Interpret interp = new Interpret () ; 
	            ast.apply(new DepthFirstAdapter()) ; 
	            System.out.println("All OK");
	         } 
	         catch (Exception e) { 
	            System.out.println (e) ; 
	         } 
	      } else { 
	         System.err.println("usage: java simpleAdder inputFile"); 
	         System.exit(1); 
	      } 
	   } 
	/*
   public static void main(String[] args) { 
         try { 
            // Form our AST / 
            Lexer lexer = new Lexer (new PushbackReader( 
               new InputStreamReader(System.in), 1024)); 
            Parser parser = new Parser(lexer); 
            Start ast = parser.parse() ; 
  
            // Get our Interpreter going. /
            
            ast.apply(new Interpret ()) ;
            System.out.println("Checks out OK");
         } 
         catch (Exception e) { 
            System.out.println (e) ; 
         }  
   } */
}