
/* Create an AST, then invoke our interpreter. */ 
//import lexAndParse.interpret.Interpret; 
import lexAndParse.parser.* ; 
import lexAndParse.lexer.* ; 
import lexAndParse.node.* ; 
import lexAndParse.analysis.*;
  
import java.io.* ; 
  
public class Main { 
   public static void main(String[] args) { 
         try { 
            /* Form our AST */ 
            Lexer lexer = new Lexer (new PushbackReader( 
               new InputStreamReader(System.in), 1024)); 
            Parser parser = new Parser(lexer); 
            Start ast = parser.parse() ; 
  
            /* Get our Interpreter going. */
            
            ast.apply(new DepthFirstAdapter ()) ;
            System.out.println("Checks out OK");
         } 
         catch (Exception e) { 
            System.out.println (e) ; 
         }  
   } 
}