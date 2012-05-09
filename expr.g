grammar expr;

@header
{
import java.util.TreeMap;
}

@members
{
TreeMap<String, Float> varTable = new TreeMap<String, Float>();
}


start:(x = statement{System.out.println("\nEndergebnis: " + $x.ret + "\n\n");})*;


statement returns [float ret]: expr{$ret = $expr.ret;} | assignment{$ret = $assignment.ret;};

expr returns [float ret]:{int flag = -1;}(
                          x = product{$ret = $x.ret;}(('+'{flag = 0;}|'-' {flag = 1;}) y = product{
  if (flag == 0){
    $ret += $y.ret;
  }else if (flag == 1){
    $ret -= $y.ret;
  }
})*
)
{  
  System.out.println("expr: " + $expr.text);
  System.out.println("Zwischenergebnis expr: " + $ret);
};

assignment returns[float ret]: 
    VARNAME '=' statement
      {
        varTable.put($VARNAME.text, $statement.ret);  System.out.println("variable: " + $VARNAME.text + " = " + $statement.ret); $ret = $statement.ret;
      };

VARNAME:('A'..'Z')('A'..'Z')*;

product returns [float ret]:{int flag = -1;}(
                          x = factor{$ret = $x.ret;}(('*'{flag = 0;}|'/'{flag = 1;})y = factor{
  if (flag == 0){
    $ret *= $y.ret;
  }else if (flag == 1){
    $ret /= $y.ret;
  }
})*
)
{
  System.out.println("product: " + $product.text);
  System.out.println("Zwischenergebnis product: " + $ret);
};

factor returns [float ret]:(
                          '('expr')' {System.out.println("hier" + $expr.ret); $ret = $expr.ret;} | NUMBER {$ret = Float.parseFloat($NUMBER.text);} | VARNAME {$ret = varTable.get($VARNAME.text);}
){System.out.println("factor: " + $factor.text);};

NUMBER:('0'..'9')('0'..'9')*;

WS:(' '|'\t'|'\n'|'\r'){skip();};
 q
