//NoToken:top//
//NoToken:import//
import java.util.*;

// <token_key>NoToken ::= IDENTIFIER
public class NoToken extends Token_key /*NoToken:class*/ {

    public static final String $className = "NoToken";
    public static final String $ruleString =
        "<token_key>NoToken ::= IDENTIFIER";



    public NoToken() {
//NoToken:init//

    }

    public static NoToken parse(Scan scn$, Trace trace$) {
        if (trace$ != null)
            trace$ = trace$.nonterm("<token_key>NoToken", scn$.lno);
        scn$.match(Token.Match.IDENTIFIER, trace$);
        return new NoToken();
    }

//NoToken//
}
