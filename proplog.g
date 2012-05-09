grammar proplog;
start:expr EOF;
expr:term(logop term)*{System.out.println("expr: " + $expr.text);};
term:NOT*(OP|('('expr')')){System.out.println("term: " + $term.text);};
logop:('and'|'or'|'if'|'iff'){System.out.println("logop: " + $logop.text);};
OP:('A'..'Z')('A'..'Z')*{System.out.println("op");};
NOT:'not'{System.out.println("not ");};
WS:(' '|'\t'|'\n'|'\r'){skip();};
