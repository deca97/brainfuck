grammar gram;

file
   : statement*
   ;

statement
: opcode #operation
| LPAREN statement* RPAREN #loop
;

opcode
   :  GT #rightpointer
    | LT #leftpointer
    | PLUS #plus
    | MINUS #minus
    | DOT #output
    | COMMA #input
   ;


GT
   : '>'
   ;


LT
   : '<'
   ;


PLUS
   : '+'
   ;


MINUS
   : '-'
   ;


DOT
   : '.'
   ;


COMMA
   : ','
   ;


LPAREN
   : '['
   ;


RPAREN
   : ']'
   ;


WS
   : . -> skip
   ;