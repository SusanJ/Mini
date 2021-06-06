import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTreeProperty;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.BufferedTokenStream;


import java.util.Hashtable;
import java.util.List;

// BaseListener enerated from miniParser.g4 by ANTLR 4.9.2

/**
 * This class extends the BaseListener and 
 * may only need to handle a subset
 * of the available methods in the BaseListener.
 */


public class miniBack extends miniParserBaseListener {

 static String inkComma = ",";
 static String inkPeriod = ".";
 static Hashtable<String, String> bakCon =
       new Hashtable<String, String>();

 static boolean show = false;
 static boolean debugComments = true;
 static boolean ignoreComments = false;
 static boolean showLineComment = true;
 BufferedTokenStream allTokens; //To support a comment channel

 miniBack( BufferedTokenStream allTokens){
  makeTable();
  this.allTokens = allTokens;
 }

    // "ink" is back-translation for node ctx
    ParseTreeProperty<String> ink = new ParseTreeProperty<String>();
    void setInk(ParseTree ctx, String s) {ink.put(ctx, s);}
    String getInk(ParseTree ctx) {return ink.get(ctx);}
   
    //Hard-wired for simplicity
    static void makeTable(){
     bakCon.put( "&", "and"  );
     bakCon.put( "=", "for"  );
     bakCon.put( "(", "of"   );
     bakCon.put( "!", "the"  ); 
     bakCon.put( ")", "with" );
    }       

	@Override public void enterText(miniParser.TextContext ctx) { 
        }
	@Override public void exitText(miniParser.TextContext ctx) {
          String ink = conCat( ctx, "text", true, 0 );
          setInk( ctx, ink );
        }
	@Override public void enterLine(miniParser.LineContext ctx) {
         System.out.println( "enterLine--braille: "+ctx.getText() );
         }
	@Override public void exitLine(miniParser.LineContext ctx) {

         String cmtInfo = null;
         if (!ignoreComments){
          cmtInfo = lineComment( ctx, 2 );
          if (showLineComment){
            System.out.println( "Line comment: "+cmtInfo );
          }
         }

          String ink = null;
          StringBuilder buf = null;
          if (ctx.getChildCount()>1){   //ignore end-of-line
            ink = conCat( ctx, "line", true, 0, true );
          }   
          if (ink != null){
             buf = new StringBuilder( ink );
          } else {
             buf = new StringBuilder();
          }
          if (cmtInfo != null) {
           buf.append( "      ");
           buf.append( cmtInfo );
          }
           buf.append("\n");  //New line at end of line
           ink = buf.toString();
           setInk( ctx, ink );
          //setInk( ctx, ink );
          System.out.println( "Line translated as: "+ink );
         }

	@Override public void enterSpace(miniParser.SpaceContext ctx) { }

	@Override public void exitSpace(miniParser.SpaceContext ctx) { 
         setInk( ctx, " " );
         }
	@Override public void enterLetter(miniParser.LetterContext ctx) {}
      
//Just identify print letters with braille ones for English demo
	@Override public void exitLetter(miniParser.LetterContext ctx) {
          setInk( ctx, ctx.getText().toLowerCase());
          }

	@Override public void exitNewline(miniParser.NewlineContext ctx) { }

	@Override public void enterCapLetter(miniParser.CapLetterContext ctx) { }

	@Override public void exitCapLetter(miniParser.CapLetterContext ctx) { 
//Just identify print letters with braille ones for English demo
         setInk( ctx, ctx.getText().substring(1).toUpperCase());
        }

	@Override public void enterSign(miniParser.SignContext ctx) { }

	@Override public void exitSign(miniParser.SignContext ctx) {
          String ink = bakCon.get( ctx.getText() );
          setInk( ctx, ink);
        }

	@Override public void enterCapInd(miniParser.CapIndContext ctx) { }

	@Override public void exitCapInd(miniParser.CapIndContext ctx) { }

	@Override public void enterCapSign(miniParser.CapSignContext ctx) { }

	@Override public void exitCapSign(miniParser.CapSignContext ctx) {
          String tmp = bakCon.get( ctx.getText().substring(1) );
          System.out.println( "capSign--ink: "+tmp);
          StringBuilder buf = 
                new StringBuilder( tmp.substring( 0,1 ).toUpperCase() ); 
          buf.append( tmp.substring( 1 ));
          String ink = buf.toString();
          setInk( ctx, ink );
        }

	@Override public void enterComma(miniParser.CommaContext ctx) { 
          setInk( ctx, inkComma );
        }
	@Override public void exitComma(miniParser.CommaContext ctx) { }

	@Override public void enterPeriod(miniParser.PeriodContext ctx) { }

	@Override public void exitPeriod(miniParser.PeriodContext ctx) {
         setInk( ctx, inkPeriod );
        }
      
	@Override public void enterWord(miniParser.WordContext ctx) { }

	@Override public void exitWord(miniParser.WordContext ctx) {
          String ink = conCat( ctx, "word", true, 0 );
          setInk( ctx, ink );
        }

	@Override public void visitErrorNode(ErrorNode node) { }


    //Concatenate children of a node for which all children 
    //should have alredy been backtranslated at lower levels
        String conCat( ParseTree ctx, String label,
                       boolean show, int i0 ){
   String ink;
   StringBuilder buf = new StringBuilder();
   int cnt = ctx.getChildCount();
   if (show) System.out.println( "===ConCat for: "+label+" cnt = "+cnt );
   for (int i=i0; i<cnt; i++){
    ink = getInk( ctx.getChild(i) );
    if (ink != null) {
     buf.append( ink );
    } else {
     System.out.println( "Braille for child item no. "+i+
        "  was not backtranslated: "+
        "|"+ctx.getChild(i).getText()+"|" );
     buf.append( "" );  //Hmmm.....
    }
    if (show) System.out.println( "   ConCat Child no. "+i+" ink: "+ink);
   } 
  return buf.toString();
}

//TO-DO CLEANUP -- CHANGE ABOVE TO TRANSFER TO THIS
      String conCat( ParseTree ctx, String label,
                       boolean show, int i0, boolean skipLast ){
      int cnt = ctx.getChildCount();
      int lim = cnt;
      if (skipLast) lim = cnt-1;
   String ink;
   StringBuilder buf = new StringBuilder();
   //int cnt = ctx.getChildCount();
   if (show) System.out.println( "===ConCat for: "+label+" cnt = "+cnt );
   for (int i=i0; i<lim; i++){
    ink = getInk( ctx.getChild(i) );
    if (ink != null) {
     buf.append( ink );
    } else {
     System.out.println( "Braille for child item no. "+i+
        "  was not backtranslated: "+
        "|"+ctx.getChild(i).getText()+"|" );
     buf.append( "" );  //Hmmm.....
    }
    if (show) System.out.println( "   ConCat Child no. "+i+" ink: "+ink);
   } 
  return buf.toString();
}
  
String lineComment( miniParser.LineContext ctx,
                     int channelIndex ) {

    Token startOfBrl = ctx.getStart();
    Token endOfBrl = ctx.getStop();
    int bComment = startOfBrl.getTokenIndex();
    int eComment = endOfBrl.getTokenIndex();

   if (debugComments) System.out.println( "bComment: "+bComment+
                        " eComment: "+eComment );
    List<Token> manual;
    Token cmt;
    String cmtInfo = null;

    // There could be separator(s) after a comment and 
    // before the newline at the end of the line.
    // Current logic requires the newline to be sent to the 
    // default token channel, not to the comment channel 
    // so comment must be enclosed. Thus locating comment 
    // requires searching backwards from the EOL.

   boolean noBrlTokens = true;
   if (bComment < eComment ) noBrlTokens = false;
 
  if (!noBrlTokens){
  for ( int j = eComment; j> bComment; j--){
    if (debugComments) System.out.println( "Token index: "+j );
    manual =
      allTokens.getHiddenTokensToLeft( j , channelIndex  );

    if (manual == null){
     if (debugComments)
     System.out.println( "Nothing hidden immediately to left." );
    } else {
      cmt = manual.get( 0 );
      if (cmt != null){
       cmtInfo = cmt.getText();
       if (debugComments)
          System.out.println( "cmt: "+cmt.getText() );
       break;
      }
    }
  }
 }//End channel 1 tokens

     if (!noBrlTokens) return cmtInfo;

//Nothing in channel 1, check channel 2
   manual =
      allTokens.getHiddenTokensToLeft( eComment , channelIndex  );
  cmtInfo =  manual.get(0).getText() ;
  if (debugComments) System.out.println( "Lonely comment: "+cmtInfo );
  return cmtInfo;
}
}//End Class miniBack