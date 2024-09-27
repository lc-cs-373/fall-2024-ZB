//ParensNode:top//
//ParensNode:import//
import java.util.*;

// <parens>ParensNode ::= LP <parens>p1 RP <parens>p2
public class ParensNode extends Parens /*ParensNode:class*/ {

    public static final String $className = "ParensNode";
    public static final String $ruleString =
        "<parens>ParensNode ::= LP <parens>p1 RP <parens>p2";

    public Parens p1;
    public Parens p2;

    public ParensNode(Parens p1, Parens p2) {
//ParensNode:init//
        this.p1 = p1;
        this.p2 = p2;
    }

    public static ParensNode parse(Scan scn$, Trace trace$) {
        if (trace$ != null)
            trace$ = trace$.nonterm("<parens>ParensNode", scn$.lno);
        scn$.match(Token.Match.LP, trace$);
        Parens p1 = Parens.parse(scn$, trace$);
        scn$.match(Token.Match.RP, trace$);
        Parens p2 = Parens.parse(scn$, trace$);
        return new ParensNode(p1, p2);
    }

//ParensNode//
}
