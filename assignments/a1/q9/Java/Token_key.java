//Token_key:top//
//Token_key:import//
import java.util.*;

public abstract class Token_key /*Token_key:class*/ {

    public static final String $className = "Token_key";
    public static Token_key parse(Scan scn$, Trace trace$) {
        Token t$ = scn$.cur();
        Token.Match match$ = t$.match;
        switch(match$) {
        case TOKEN_NAME:
            return TokenNoKey.parse(scn$,trace$);
        case TOKEN_KEY:
            return TokenWithKey.parse(scn$,trace$);
        default:
            throw new PLCCException(
                "Parse error",
                "Token_key cannot begin with " + t$.errString()
            );
        }
    }

//Token_key//
}
