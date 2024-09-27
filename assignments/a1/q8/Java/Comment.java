//Comment:top//
//Comment:import//
import java.util.*;

// <line>Comment ::= COMMENT
public class Comment extends Line /*Comment:class*/ {

    public static final String $className = "Comment";
    public static final String $ruleString =
        "<line>Comment ::= COMMENT";



    public Comment() {
//Comment:init//

    }

    public static Comment parse(Scan scn$, Trace trace$) {
        if (trace$ != null)
            trace$ = trace$.nonterm("<line>Comment", scn$.lno);
        scn$.match(Token.Match.COMMENT, trace$);
        return new Comment();
    }

//Comment//
}
