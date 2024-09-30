//Line:top//
//Line:import//
import java.util.*;

public abstract class Line extends _Start /*Line:class*/ {

    public static final String $className = "Line";
    public static Line parse(Scan scn$, Trace trace$) {
        Token t$ = scn$.cur();
        Token.Match match$ = t$.match;
        switch(match$) {
        case SKIP_KEYWORD:
        case TOKEN_KEY:
        case TOKEN_NAME:
            return RuleLine.parse(scn$,trace$);
        case COMMENT:
            return CommentLine.parse(scn$,trace$);
        default:
            throw new PLCCException(
                "Parse error",
                "Line cannot begin with " + t$.errString()
            );
        }
    }

//Line//
}
