//BitOne:top//
//BitOne:import//
import java.util.*;

// <bit>BitOne ::= <ONE>
public class BitOne extends Bit /*BitOne:class*/ {

    public static final String $className = "BitOne";
    public static final String $ruleString =
        "<bit>BitOne ::= <ONE>";

    public Token one;

    public BitOne(Token one) {
//BitOne:init//
        this.one = one;
    }

    public static BitOne parse(Scan scn$, Trace trace$) {
        if (trace$ != null)
            trace$ = trace$.nonterm("<bit>BitOne", scn$.lno);
        Token one = scn$.match(Token.Match.ONE, trace$);
        return new BitOne(one);
    }

    public int eval(Bit b) {
        return 1;
    }

//BitOne//
}
