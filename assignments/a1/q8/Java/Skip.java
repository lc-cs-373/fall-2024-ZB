//Skip:top//
//Skip:import//
import java.util.*;

// <rule>Skip ::= SKIP_KEYWORD IDENTIFIER
public class Skip extends Rule /*Skip:class*/ {

    public static final String $className = "Skip";
    public static final String $ruleString =
        "<rule>Skip ::= SKIP_KEYWORD IDENTIFIER";



    public Skip() {
//Skip:init//

    }

    public static Skip parse(Scan scn$, Trace trace$) {
        if (trace$ != null)
            trace$ = trace$.nonterm("<rule>Skip", scn$.lno);
        scn$.match(Token.Match.SKIP_KEYWORD, trace$);
        scn$.match(Token.Match.IDENTIFIER, trace$);
        return new Skip();
    }

//Skip//
}
