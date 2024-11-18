//Program:top//
//Program:import//
import java.util.*;

public abstract class Program extends _Start /*Program:class*/ {

    public static final String $className = "Program";
    public static Program parse(Scan scn$, Trace trace$) {
        Token t$ = scn$.cur();
        Token.Match match$ = t$.match;
        switch(match$) {
        case DIVOP:
        case VAR:
        case LBRACE:
        case PROC:
        case SUBOP:
        case ADDOP:
        case LET:
        case ADD1OP:
        case IF:
        case LIT:
        case DOT:
        case LETREC:
        case SUB1OP:
        case ZEROP:
        case MULOP:
            return Eval.parse(scn$,trace$);
        case DEFINE:
            return Define.parse(scn$,trace$);
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
