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
        case SUBOP:
        case ADD1OP:
        case IF:
        case LIT:
        case SUB1OP:
        case ADDOP:
        case LBRACE:
        case ZEROP:
        case DOT:
        case MULOP:
        case PROC:
        case VAR:
        case SET:
        case LETREC:
        case LET:
        case DIVOP:
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
