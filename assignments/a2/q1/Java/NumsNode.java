//NumsNode:top//
//NumsNode:import//
import java.util.*;

// <nums>:NumsNode ::= <NUM> <nums>
public class NumsNode extends Nums /*NumsNode:class*/ {

    public static final String $className = "NumsNode";
    public static final String $ruleString =
        "<nums>:NumsNode ::= <NUM> <nums>";

    public Token num;
    public Nums nums;

    public NumsNode(Token num, Nums nums) {
//NumsNode:init//
        this.num = num;
        this.nums = nums;
    }

    public static NumsNode parse(Scan scn$, Trace trace$) {
        if (trace$ != null)
            trace$ = trace$.nonterm("<nums>:NumsNode", scn$.lno);
        Token num = scn$.match(Token.Match.NUM, trace$);
        Nums nums = Nums.parse(scn$, trace$);
        return new NumsNode(num, nums);
    }

    public int min(int minSoFar) {
        //System.out.println(minSoFar);
        int currentNum = Integer.parseInt(this.num + "");
        if (currentNum < minSoFar) {
            //System.out.println(currentNum + " " + minSoFar);
            return nums.min(currentNum);
        } else {
            //System.out.println(currentNum + " " + minSoFar);
            return nums.min(minSoFar);
        }
    
    }

//NumsNode//
}