//Needs to access lexer and parser if not in same directory
//import ... miniLexer
//import ... miniParser;

//import org.dotlessbraille.utilities.Tape6;
//import org.dotlessbraille.jsonInput.ReadJS;
import org.antlr.v4.runtime.BufferedTokenStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CodePointCharStream;
import org.antlr.v4.runtime.CommonTokenStream; 
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStreamRewriter;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.File; 
import java.io.InputStreamReader;//
import java.io.Reader;
import java.util.List;
import java.util.ArrayList;

class Mayne{

 static String[] ruleNames;
 static boolean showRuleNames = false;
 Lexer lexer;
 Parser parser;
 boolean inputFromFile = false;
 String inputFile; 
// public static Tape6 myOutput = new Tape6("miniBT.txt");

Mayne( Lexer miniLexer, Parser miniParser){
 this.lexer = lexer;
 this.parser = parser;
};
void setInputFile( String inputFile){
 inputFromFile = true;
 this.inputFile = inputFile;
}

 static void setRuleNames( Mayne mayne ){
    ruleNames = miniParser.ruleNames;
    if (!showRuleNames) return;
    for (int rn=0; rn<ruleNames.length; rn++){
      System.out.println( "Rule: "+rn+" "+ruleNames[rn] );
    }
  }

public static String explain(){
 String blurb = 
  " The backtranslation"+
  " was produced automatically by new software.";
 return blurb;
}
//===========================================================
public static void main( String[] args ) throws Exception {
//===========================================================

 System.out.println( "\n    Welcome to mini backtranslator." );
 System.out.println( "      Uses ANTLR 4.9.2 parser generator." );

 String inputFile = null;
 CharStream input = null;
 if ( args.length > 0 ) inputFile = args[0];

 //User input from terminal
 if (inputFile == null){
    System.out.println( "\n    -->Enter North Am. ASCII Braille; "+
                        "using either small or large letters." );
    System.out.println( "    -->End input with CTRL-z "+
                      "as only symbol on last line.\n" );
    Reader myReader = new InputStreamReader( System.in, "UTF-8");
    CodePointCharStream cpcs = CharStreams.fromReader( myReader );
    input = cpcs;

 //File input
 } else {
    File f = new File( inputFile );
    if (f.exists() && !f.isDirectory() )  {
       input = CharStreams.fromFileName( inputFile );
    } else {
       System.out.println( "\n OOPS! Cannot find input file: "
                           +inputFile );
       System.exit( 0 );
    }
  }

/**  I. Connect lexer and parser via tokens and instruct 
        parser tobuild a parse tree.  
*/
        miniLexer lexer = new miniLexer( input );
        CommonTokenStream tokens = new CommonTokenStream( lexer );
        miniParser parser = new miniParser( tokens ); 
        parser.setBuildParseTree( true );
        Mayne mayne = new Mayne( lexer, parser );
        Mayne.setRuleNames( mayne );
        mayne.setInputFile( inputFile );
		
/**  II. Start tree with the topmost rule in the Parser 
         grammar.  (Rule #0 if grammar starts with that one.
         Rule name "text" currently hard-wired.)
*/
         ParseTree tree = parser.text();

/**  III. Insert logic to walk and annotate tree here....*/ 
      
     miniBack bt = new miniBack( tokens );
     ParseTreeWalker walker = new ParseTreeWalker();
     walker.walk(bt, tree);

/**  IV. Display backtranslation  */

     System.out.println();
     System.out.println( "      ***Backtranslation***" );
     System.out.println(" Back-translated braille input from annotated tree: ");

 
     //explain();

 }//End Main.//

}//End Mayne