//CommentLine:top//
//CommentLine:import//
import java.util.*;

// <line>CommentLine ::= COMMENT
public class CommentLine extends Line /*CommentLine:class*/ {

    public static final String $className = "CommentLine";
    public static final String $ruleString =
        "<line>CommentLine ::= COMMENT";



    public CommentLine() {
//CommentLine:init//

    }

    public static CommentLine parse(Scan scn$, Trace trace$) {
        if (trace$ != null)
            trace$ = trace$.nonterm("<line>CommentLine", scn$.lno);
        scn$.match(Token.Match.COMMENT, trace$);
        return new CommentLine();
    }

    public void $run() {
    
    }

//CommentLine//
}
