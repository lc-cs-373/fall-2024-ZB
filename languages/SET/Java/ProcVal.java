import java.util.*;

public class ProcVal extends Val {

    public Formals formals;
    public Exp body;
    public Env env;

    public ProcVal(Formals formals, Exp body, Env env) {
    	this.formals = formals;
        this.body = body;
        this.env = env;
    }

    public Val apply(List<Val> valList) {
        List<Ref> refList = Ref.valsToRefs(valList);
        Bindings bindings = new Bindings(formals.varList, refList);
        Env nenv = env.extendEnvRef(bindings);
        return body.eval(nenv);
    }

    public ProcVal procVal() {
        return this;
    }

    public String toString() {
        return "proc";
    }
}