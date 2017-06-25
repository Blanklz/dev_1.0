grammar VimScript;

allStatement
    : statements* EOF
    ;
statements
    :   ':'? let
    |   ':'? ifelse ':'? 'endif'
    |   ':'? while_ ':'? 'endwhile'
    |   ':'? for_   ':'? 'endfor'
    |   ':'? echo
    |   ':'? return_
    |   ':'? break_
    |   ':'? continue_
    |   ':'? unlet
    |   ':'? expression
    |   ':'? 'call' callFunction
    |   ':'? creationFunction 'endfunction'
    ;
for_
    :   'for' expression 'in' expression statements+
    ;
creationFunction
    : op=('function'|'function!') IdLiteral '('(IdLiteral(','IdLiteral)*)? ')'statements*
    ;
//functionStatements
//    : statements*
//    ;
let
    : 'let' expression
    ;
unlet
    : 'unlet' expression
    ;
continue_
    : 'continue'
    ;
break_
    : 'break'
    ;
return_
    : 'return' expression?
    ;
expression
    :   primary
//    |   expression '[' expression ']'
//    :   arithmetic
    |   arithmetic
    |   sign=('+'|'-') expression
//    |   expression ('<' '<' | '>' '>' '>' | '>' '>') expression
//    |   expression lo=('<=' | '>=' | '>' | '<' | '==' | '!=') expression
    |   expression '^' expression
    |   expression '|' expression
//    |   expression '&&' expression
//    |   expression '||' expression
    |   expression '?' expression ':' expression
    |   expression op=
        (   '='
        |   '+='
        |   '-='
        |   '*='
        |   '/='
        |   '%='
        )
        expression
    ;
arithmetic
    : arithmetic op=('*'|'/'|'%') arithmetic                                # mulDiv
    | arithmetic op=('+'|'-') arithmetic                                    # addSub
    | arithmetic op=('<=' | '>=' | '>' | '<' | '==' | '!=') arithmetic      # logic
    | arithmetic op=('&&'|'||') arithmetic                                  # andOr
    | literal                                                               # arithmeticLiteral
    | '(' arithmetic ')'                                                    # arithmeticParen
    ;
//<assoc=right>
primary
    :   '(' expression ')'
    |   literal
//    |
    ;
echo
    : 'echo' expression*
    ;
while_
    : 'while' expression statements+
    ;
ifelse
    : 'if'  expression  statements+ (else_|elseif)?
    ;
else_
    : 'else' statements+
    ;
elseif
    : 'elseif'  expression  statements+ (else_|elseif)?
    ;
literal
    : StringLiteral
    | FloatLiteral
    | IntegerLiteral
    | callFunction
    | IdLiteral
    | listLiteral
    | dictionaryLiteral
    ;
callFunction
    : IdLiteral '('(expression (','expression)*)?')'
    ;
listLiteral
    : '['(literal (',' literal)*)?']'
    ;
dictionaryLiteral
    : '{' (keyValue (',' keyValue)*)? '}'
    ;
keyValue
    : StringLiteral ':' literal
    ;
EQUAL           : '==';
LE              : '<=';
GE              : '>=';
BANG            : '!';
ASSIGN          : '=';
GT              : '>';
LT              : '<';
ADD             : '+';
SUB             : '-';
MUL             : '*';
DIV             : '/';
ADD_ASSIGN      : '+=';
SUB_ASSIGN      : '-=';
MUL_ASSIGN      : '*=';
DIV_ASSIGN      : '/=';
MOD_ASSIGN      : '%=';
LET             : 'let'         ;
UNLET           : 'unlet'       ;
RETURN          : 'return'      ;
FUNCTION        : 'function'    ;
ENDFUNCTION     : 'endfunction' ;
IF              : 'if'          ;
ENDIF           : 'endif'       ;
ELSE            : 'else'        ;
ELSEIF          : 'elseif'      ;
CONTINUE        : 'continue'    ;
BREAK           : 'break'       ;
WHILE           : 'while'       ;
ENDWHILE        : 'endwhile'    ;
FOR             : 'for'         ;
In              : 'in'          ;
ENDFOR          : 'endfor'      ;
ECHO            : 'echo'        ;
CALL            : 'call'        ;


FloatLiteral
    :   DIGIT+ '.' DIGIT+
    |   DecimalFloatingPointLiteral
    |   HexadecimalFloatingPointLiteral
    ;

fragment
HexadecimalFloatingPointLiteral
    :   HexSignificand BinaryExponent
    ;
fragment
HexSignificand
    :   HexNumeral '.'?
    |   '0' [xX] HexDigits? '.' HexDigits
    ;
fragment
BinaryExponent
    :   BinaryExponentIndicator SignedInteger
    ;
fragment
BinaryExponentIndicator
    :   [pP]
    ;
fragment
DecimalFloatingPointLiteral
    :   Digits '.' Digits+ ExponentPart?
    |   Digits ExponentPart
    ;
fragment
ExponentPart
    :   ExponentIndicator SignedInteger
    ;
fragment
SignedInteger
    :   Sign? Digits+
    ;
fragment
ExponentIndicator
    :   [eE]
    ;
IntegerLiteral
    :   DecimalIntegerLiteral
    |   HexIntegerLiteral
    |   OctalIntegerLiteral
    ;
fragment
OctalIntegerLiteral
    :   OctalNumeral
    ;
fragment
OctalNumeral
    :   '0' Underscores? OctalDigits
    ;
fragment
OctalDigits
    :   OctalDigit (OctalDigitOrUnderscore* OctalDigit)?
    ;
fragment
OctalDigitOrUnderscore
    :   OctalDigit
    |   '_'
    ;
fragment
HexIntegerLiteral
    :   HexNumeral
    ;
fragment
HexNumeral
    :   '0' [xX] HexDigits
    ;
fragment
HexDigits
    :   HexDigit (HexDigitOrUnderscore* HexDigit)?
    ;
fragment
HexDigitOrUnderscore
    :   HexDigit
    |   '_'
    ;
fragment
DecimalIntegerLiteral
    :   DecimalNumeral
    ;
fragment
DecimalNumeral
    :   '0'
    |   NonZeroDigit (Digits? | Underscores Digits)
    ;
fragment
Digits
    :   Digit (DigitOrUnderscore* Digit)?
    ;
fragment
Underscores
    :   '_'+
    ;
fragment
DigitOrUnderscore
    :   Digit
    |   '_'
    ;
fragment
Digit
    :   '0'
    |   NonZeroDigit
    ;
StringLiteral
    :   '"' StringCharacters? '"'
    |   '\'' (~('\'' | '\\') | '\\' . )* '\''
    ;
//UserFunctionId
//    : Scope? Capital ID_LETTER*
//    ;
fragment
StringCharacters
    :   StringCharacter+
    ;
fragment
StringCharacter
    :   ~["\\]
    |   EscapeSequence
    ;
fragment
EscapeSequence
    :   '\\' [btnfr"'\\]
    |   OctalEscape
    |   UnicodeEscape
    ;
fragment
OctalEscape
    :   '\\' OctalDigit
    |   '\\' OctalDigit OctalDigit
    |   '\\' ZeroToThree OctalDigit OctalDigit
    ;

fragment
UnicodeEscape
    :   '\\' 'u' HexDigit HexDigit HexDigit HexDigit
    ;
fragment
ZeroToThree
    :   [0-3]
    ;
fragment
HexDigit
    :   [0-9a-fA-F]
    ;
fragment
OctalDigit
    :   [0-7]
    ;

//标识符
IdLiteral
    : Scope? ID_LETTER (ID_LETTER | DIGIT)* ; // From C language


fragment Scope      : ('g:'|'s:'|'b:'|'w:'|'a:');
fragment ID_LETTER : Lowercase|Capital|'_'|'$' ;
fragment Lowercase : [a-z] ;
fragment Capital   : [A-Z] ;
fragment DIGIT : '0'..'9' ;
fragment NonZeroDigit :   [1-9] ;
fragment Sign : '-' ;
WS  :  [ \t\r\n\u000C]+ -> skip ;
LINE_COMMENT
    :   '"' ~[\r\n]* -> channel(HIDDEN)
    ;
