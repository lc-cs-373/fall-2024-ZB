//Exp:top//
//Exp:import//
import java.util.*;

public abstract class Exp /*Exp:class*/ {

    public static final String $className = "Exp";
    public static Exp parse(Scan scn$, Trace trace$) {
        Token t$ = scn$.cur();
        Token.Match match$ = t$.match;
        switch(match$) {
        case LET:
            return LetExp.parse(scn$,trace$);
        case VAR:
            return VarExp.parse(scn$,trace$);
        case IF:
            return IfExp.parse(scn$,trace$);
        case LIT:
            return LitExp.parse(scn$,trace$);
        case ZEROP:
        case ADD1OP:
        case ADDOP:
        case SUB1OP:
        case MULOP:
        case SUBOP:
        case DIVOP:
            return PrimappExp.parse(scn$,trace$);
        default:
            throw new PLCCException(
                "Parse error",
                "Exp cannot begin with " + t$.errString()
            );
        }
    }

    public abstract Val eval(Env env);

//Exp//
}
