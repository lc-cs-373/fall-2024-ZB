//RuleSkip:top//
//RuleSkip:import//
import java.util.*;

// <rule>RuleSkip ::= <SKIP_KEYWORD> <TOKEN_NAME> <IDENTIFIER>
public class RuleSkip extends Rule /*RuleSkip:class*/ {

    public static final String $className = "RuleSkip";
    public static final String $ruleString =
        "<rule>RuleSkip ::= <SKIP_KEYWORD> <TOKEN_NAME> <IDENTIFIER>";

    public Token skip_keyword;
    public Token token_name;
    public Token identifier;

    public RuleSkip(Token skip_keyword, Token token_name, Token identifier) {
//RuleSkip:init//
        this.skip_keyword = skip_keyword;
        this.token_name = token_name;
        this.identifier = identifier;
    }

    public static RuleSkip parse(Scan scn$, Trace trace$) {
        if (trace$ != null)
            trace$ = trace$.nonterm("<rule>RuleSkip", scn$.lno);
        Token skip_keyword = scn$.match(Token.Match.SKIP_KEYWORD, trace$);
        Token token_name = scn$.match(Token.Match.TOKEN_NAME, trace$);
        Token identifier = scn$.match(Token.Match.IDENTIFIER, trace$);
        return new RuleSkip(skip_keyword, token_name, identifier);
    }

    public String toString() {
        return "skip " + token_name + " " + identifier;
    }

//RuleSkip//
}
