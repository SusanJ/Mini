lexer grammar miniLexer; 
channels{ COMMENTS }


fragment CAP: ',';
CAP_LETTER: CAP[a-zA-Z];  //27 chars
LETTER:      [a-zA-Z];
CAP_LETTER_IND: CAP;
ALWAYS_CONTRACTION: ('&'|'='|'('|'!'|')'); //5 chars
fragment DOT2: '1';
fragment DOTS256: '4';
COMMA:  DOT2;  //1 char
PERIOD: DOTS256;  //1 char

// The 29 nrecognized ASCII Braille characters
ROW4:  ('*'|'<'|'%'|'?'|':'|'$'|']'|'\\'|'['); //9 chafs
LOW:   ('2'|'3'|'5'|'6'|'7'|'8'|'9'|'0');      //8 chars
ROW6:  ('\''|'-'|'#'|'+'|'/'|'>');             //6 chars 
ROW7:  ('@'|'"'|'^'|';'|'.'|'_');              //6 chars
ALT:   ('{'|'}'|'~'|'`'|'|');  //Computer braille options

COMMENT: '//' .*? '//'-> channel( COMMENTS );

fragment        
  ASPACE: ' ';       
SPACE: ASPACE;
fragment
  WINNL: [\r\n]+;
NEWLINE: WINNL;

