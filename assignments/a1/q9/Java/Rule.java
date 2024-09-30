//Rule:top//
//Rule:import//
import java.util.*;

public abstract class Rule /*Rule:class*/ {

    public static final String $className = "Rule";
    public static Rule parse(Scan scn$, Trace trace$) {
        Token t$ = scn$.cur();
        Token.Match match$ = t$.match;
        switch(match$) {
        case TOKEN_KEY:
        case TOKEN_NAME:
            return RuleTok.parse(scn$,trace$);
        case SKIP_KEYWORD:
            return RuleSkip.parse(scn$,trace$);
        default:
            throw new PLCCException(
                "Parse error",
                "Rule cannot begin with " + t$.errString()
            );
        }
    }

//Rule//
}
