//Tok:top//
//Tok:import//
import java.util.*;

// <rule>Tok ::= <token_key> IDENTIFIER
public class Tok extends Rule /*Tok:class*/ {

    public static final String $className = "Tok";
    public static final String $ruleString =
        "<rule>Tok ::= <token_key> IDENTIFIER";

    public Token_key token_key;

    public Tok(Token_key token_key) {
//Tok:init//
        this.token_key = token_key;
    }

    public static Tok parse(Scan scn$, Trace trace$) {
        if (trace$ != null)
            trace$ = trace$.nonterm("<rule>Tok", scn$.lno);
        Token_key token_key = Token_key.parse(scn$, trace$);
        scn$.match(Token.Match.IDENTIFIER, trace$);
        return new Tok(token_key);
    }

//Tok//
}
