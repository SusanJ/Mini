parser grammar miniParser;
options { tokenVocab = miniLexer; }
// NB: Prefixes of parser and lexer names must match

text:  (line)+;
line:  (space)* newline
      |(space)* (word|unknown) 
       (space space* (word|unknown))*
       (space)* newline 
      ; 
space:     SPACE;
letter:    LETTER;
newline:   NEWLINE;
capLetter: CAP_LETTER;
sign:      ALWAYS_CONTRACTION;
capInd:    CAP_LETTER_IND;  
capSign:   capInd sign;
comma:     COMMA;
period:    PERIOD;

 //Limitation:  capital letter only possible at start    
word:    (capLetter|capSign)?((letter|sign|unknown)+)?(comma|period)?;
unknown: (ROW4|LOW|ROW6|ROW7|ALT)+;