# Mini
This is a simple but complete example of using ANTLR 4 as the basis for developing a translator.

The developer creates 3 items: a lexer grammar, a parser grmmmar, and a translator. The ANTLR tool, which is written in Java, converts the two gammars to code in the users's choice of programming language with Java being the default which is what is done here. The ANTLR tool also generates a template for a translator based on the parser. The developer then manually extends the template as necessary.

A very introdoctury three-page description of this process starts on this wiki page:

https://github.com/SusanJ/BasicUEB/wiki/4.1--An-Introduction-to-Parsing-and-Lexical-Analysis
