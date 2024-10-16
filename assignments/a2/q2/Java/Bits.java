//Bits:top//
//Bits:import//
import java.util.*;

// <bits> **= <bit>
public class Bits /*Bits:class*/ {

    public static final String $className = "Bits";
    public static final String $ruleString =
        "<bits> **= <bit>";

    public List<Bit> bitList;

    public Bits(List<Bit> bitList) {
//Bits:init//
        this.bitList = bitList;
    }

    public static Bits parse(Scan scn$, Trace trace$) {
        if (trace$ != null)
            trace$ = trace$.nonterm("<bits>", scn$.lno);
        List<Bit> bitList = new ArrayList<Bit>();
        while (true) {
            Token t$ = scn$.cur();
            Token.Match match$ = t$.match;
            switch(match$) {
            case ZERO:
            case ONE:
                bitList.add(Bit.parse(scn$, trace$));
                continue;
            default:
                return new Bits(bitList);
            }
        }

    }

    public int eval() {
        int sum = 0;
        if (this.bitList.size() == 0) {
            throw new PLCCException(
                "Parse error",
                "bitList is empty"
            );
        }
        for (Bit b : this.bitList) {
    
            //System.out.println(b.eval(b) + "");
            sum = (sum * 2) + b.eval(b);
        }
        return sum;
    }

//Bits//
}
