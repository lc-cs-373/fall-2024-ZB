//Program:top//
//Program:import//
import java.util.*;

public abstract class Program extends _Start /*Program:class*/ {

    public static final String $className = "Program";
    public static Program parse(Scan scn$, Trace trace$) {
        Token t$ = scn$.cur();
        Token.Match match$ = t$.match;
        switch(match$) {
        case DEFINE:
            return Define.parse(scn$,trace$);
        case SUB1OP:
        case LIT:
        case LET:
        case LETREC:
        case IF:
        case ADDOP:
        case ZEROP:
        case DIVOP:
        case MULOP:
        case PROC:
        case ADD1OP:
        case VAR:
        case LBRACE:
        case DOT:
        case SET:
        case SUBOP:
            return Eval.parse(scn$,trace$);
        default:
            throw new PLCCException(
                "Parse error",
                "Program cannot begin with " + t$.errString()
            );
        }
    }

    public static Env env = Env.initEnv(); // the initial environment

//Program//
}
