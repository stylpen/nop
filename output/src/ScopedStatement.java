import java.util.HashMap;
import java.util.HashSet;
import java.util.TreeMap;


public class ScopedStatement extends GenericStatement {

	public ScopedStatement(HashMap<String, String> oldScope, TreeMap<String, String> refFunctionTable, HashMap<String, String> refVarTable) {
		super(new HashMap<String, String>(oldScope), refFunctionTable, refVarTable);
	}
}
