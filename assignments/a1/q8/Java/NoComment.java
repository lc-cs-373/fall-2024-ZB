//NoComment:top//
//NoComment:import//
import java.util.*;

// <line>NoComment ::= <rule>
public class NoComment extends Line /*NoComment:class*/ {

    public static final String $className = "NoComment";
    public static final String $ruleString =
        "<line>NoComment ::= <rule>";

    public Rule rule;

    public NoComment(Rule rule) {
//NoComment:init//
        this.rule = rule;
    }

    public static NoComment parse(Scan scn$, Trace trace$) {
        if (trace$ != null)
            trace$ = trace$.nonterm("<line>NoComment", scn$.lno);
        Rule rule = Rule.parse(scn$, trace$);
        return new NoComment(rule);
    }

//NoComment//
}
