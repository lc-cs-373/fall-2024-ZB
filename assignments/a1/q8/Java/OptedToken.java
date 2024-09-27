//OptedToken:top//
//OptedToken:import//
import java.util.*;

// <token_key>OptedToken ::= TOKEN_KEY IDENTIFIER
public class OptedToken extends Token_key /*OptedToken:class*/ {

    public static final String $className = "OptedToken";
    public static final String $ruleString =
        "<token_key>OptedToken ::= TOKEN_KEY IDENTIFIER";



    public OptedToken() {
//OptedToken:init//

    }

    public static OptedToken parse(Scan scn$, Trace trace$) {
        if (trace$ != null)
            trace$ = trace$.nonterm("<token_key>OptedToken", scn$.lno);
        scn$.match(Token.Match.TOKEN_KEY, trace$);
        scn$.match(Token.Match.IDENTIFIER, trace$);
        return new OptedToken();
    }

//OptedToken//
}
