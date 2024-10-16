//BitZero:top//
//BitZero:import//
import java.util.*;

// <bit>BitZero ::= <ZERO>
public class BitZero extends Bit /*BitZero:class*/ {

    public static final String $className = "BitZero";
    public static final String $ruleString =
        "<bit>BitZero ::= <ZERO>";

    public Token zero;

    public BitZero(Token zero) {
//BitZero:init//
        this.zero = zero;
    }

    public static BitZero parse(Scan scn$, Trace trace$) {
        if (trace$ != null)
            trace$ = trace$.nonterm("<bit>BitZero", scn$.lno);
        Token zero = scn$.match(Token.Match.ZERO, trace$);
        return new BitZero(zero);
    }

    public int eval(Bit b) {
        return 0;
    }

//BitZero//
}
