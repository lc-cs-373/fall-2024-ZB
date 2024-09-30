//RuleLine:top//
//RuleLine:import//
import java.util.*;

// <line>RuleLine ::= <rule>
public class RuleLine extends Line /*RuleLine:class*/ {

    public static final String $className = "RuleLine";
    public static final String $ruleString =
        "<line>RuleLine ::= <rule>";

    public Rule rule;

    public RuleLine(Rule rule) {
//RuleLine:init//
        this.rule = rule;
    }

    public static RuleLine parse(Scan scn$, Trace trace$) {
        if (trace$ != null)
            trace$ = trace$.nonterm("<line>RuleLine", scn$.lno);
        Rule rule = Rule.parse(scn$, trace$);
        return new RuleLine(rule);
    }

    public void $run() {
        System.out.println(rule.toString());
    }

//RuleLine//
}
