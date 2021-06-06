# Mini
This is a simple but complete example of using ANTLR 4 as the basis for developing a translator. Using the app or any of the ANTLR 4 tools requires hthe user to have  a local copy of version 4.9.2 of the ANTLR 4 jar file whid is availble ehere: https://www.antlr.org/download.html

You will also need local copy of the the JRE or Java Runtime environment in order to run the executable. Your machine may alredy have this. If not it can be download from here: https://www.java.com/en/download/manual.jsp

The developer creates 3 items: a lexer grammar, a parser grmmmar, and a translator. The ANTLR tool, which is written in Java, converts the two gammars the files with .g4 extennsions) to code in the users's choice of programming language with Java being the default which is what is done here. The ANTLR tool also generates a template (here a Java class file) for a translator based on the parser. The developer then manually extends the template as necessary.

A very introdoctury three-page description of this process starts on this wiki page:

https://github.com/SusanJ/BasicUEB/wiki/4.1--An-Introduction-to-Parsing-and-Lexical-Analysis
