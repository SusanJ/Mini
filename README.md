# Mini
This is a simple but complete example of using ANTLR 4 as the basis for developing a translator. Using the app or any of the ANTLR 4 tools requires the user to have  a local copy of version 4.9.2 of the ANTLR 4 jar file which is availble ehere: https://www.antlr.org/download.html

You will also need local copy of the the JRE or Java Runtime environment in order to run the executable. Your machine may alredy have this. If not it can be download from here: https://www.java.com/en/download/manual.jsp

The developer creates 3 items: a lexer grammar, a parser grmmmar, and a translator. The ANTLR tool, which is written in Java, converts the two gammars (files with .g4 extennsions) to code in the users's choice of programming language with Java being the default which is what is done here. The ANTLR tool also generates a template (here a Java class file) for a translator based on the parser. The developer then manually extends the template as necessary. (The current translator is thed miniBack;java file. The Mayne.java file, based on samples, couples the lexer, parser, and transltor.

A introductory three-page description of the three-phase  process starts on this wiki page:

https://github.com/SusanJ/BasicUEB/wiki/4.1--An-Introduction-to-Parsing-and-Lexical-Analysis

The language being bacltranslated is a very tiny subset of contracted English braille. (It is assumed the user is familiar with braille.) The input is the 34-character subset of ASCII braille for representing letters, a comma, a period (full stop), the capital letter indicator, and the symbols '&', '='. '('. "!' ')' for five contractions.  The last five always represent the contracted items.  They are the only contractions; the letters are always backtranslated as letters, not as alphabetic wordsigns. (Note that the as far as entering letters  in ASCII braille, the lexer doesn't make a distinction between  capital and  small letters.)  Looking at the rules in  miniLexer.g4 might be helpful as far as understanding the mini-braille system.
