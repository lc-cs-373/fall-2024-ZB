//TokenNoKey:top//
//TokenNoKey:import//
import java.util.*;

// <token_key>TokenNoKey ::= <TOKEN_NAME>
public class TokenNoKey extends Token_key /*TokenNoKey:class*/ {

    public static final String $className = "TokenNoKey";
    public static final String $ruleString =
        "<token_key>TokenNoKey ::= <TOKEN_NAME>";

    public Token token_name;

    public TokenNoKey(Token token_name) {
//TokenNoKey:init//
        this.token_name = token_name;
    }

    public static TokenNoKey parse(Scan scn$, Trace trace$) {
        if (trace$ != null)
            trace$ = trace$.nonterm("<token_key>TokenNoKey", scn$.lno);
        Token token_name = scn$.match(Token.Match.TOKEN_NAME, trace$);
        return new TokenNoKey(token_name);
    }

    public String toString() {
        return "" + token_name;
    }

//TokenNoKey//
}
