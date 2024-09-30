//RuleTok:top//
//RuleTok:import//
import java.util.*;

// <rule>RuleTok ::= <token_key> <IDENTIFIER>
public class RuleTok extends Rule /*RuleTok:class*/ {

    public static final String $className = "RuleTok";
    public static final String $ruleString =
        "<rule>RuleTok ::= <token_key> <IDENTIFIER>";

    public Token_key token_key;
    public Token identifier;

    public RuleTok(Token_key token_key, Token identifier) {
//RuleTok:init//
        this.token_key = token_key;
        this.identifier = identifier;
    }

    public static RuleTok parse(Scan scn$, Trace trace$) {
        if (trace$ != null)
            trace$ = trace$.nonterm("<rule>RuleTok", scn$.lno);
        Token_key token_key = Token_key.parse(scn$, trace$);
        Token identifier = scn$.match(Token.Match.IDENTIFIER, trace$);
        return new RuleTok(token_key, identifier);
    }

    public String toString() {
        return "token " + token_key.toString() + " " + identifier;
    }

//RuleTok//
}
