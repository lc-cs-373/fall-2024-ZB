//NumsNode:top//
//NumsNode:import//
import java.util.*;

// <nums>:NumsNode ::= NUM <nums>
public class NumsNode extends Nums /*NumsNode:class*/ {

    public static final String $className = "NumsNode";
    public static final String $ruleString =
        "<nums>:NumsNode ::= NUM <nums>";

    public Nums nums;

    public NumsNode(Nums nums) {
//NumsNode:init//
        this.nums = nums;
    }

    public static NumsNode parse(Scan scn$, Trace trace$) {
        if (trace$ != null)
            trace$ = trace$.nonterm("<nums>:NumsNode", scn$.lno);
        scn$.match(Token.Match.NUM, trace$);
        Nums nums = Nums.parse(scn$, trace$);
        return new NumsNode(nums);
    }

//NumsNode//
}
