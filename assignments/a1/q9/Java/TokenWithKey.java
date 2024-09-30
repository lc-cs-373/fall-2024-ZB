//TokenWithKey:top//
//TokenWithKey:import//
import java.util.*;

// <token_key>TokenWithKey ::= <TOKEN_KEY> <TOKEN_NAME>
public class TokenWithKey extends Token_key /*TokenWithKey:class*/ {

    public static final String $className = "TokenWithKey";
    public static final String $ruleString =
        "<token_key>TokenWithKey ::= <TOKEN_KEY> <TOKEN_NAME>";

    public Token token_key;
    public Token token_name;

    public TokenWithKey(Token token_key, Token token_name) {
//TokenWithKey:init//
        this.token_key = token_key;
        this.token_name = token_name;
    }

    public static TokenWithKey parse(Scan scn$, Trace trace$) {
        if (trace$ != null)
            trace$ = trace$.nonterm("<token_key>TokenWithKey", scn$.lno);
        Token token_key = scn$.match(Token.Match.TOKEN_KEY, trace$);
        Token token_name = scn$.match(Token.Match.TOKEN_NAME, trace$);
        return new TokenWithKey(token_key, token_name);
    }

    public String toString() {
        return "" + token_name;
    }

//TokenWithKey//
}
