import java.util.HashMap;
import java.util.HashSet;
import java.util.TreeMap;

public class GenericStatement {
	HashMap<String, String> scope;
	TreeMap<String, FunctionDefinition> funTable;
	HashMap<String, String> varTable;
	static int VARCOUNTER;
	static{
		VARCOUNTER = 0;
	}
	
	public GenericStatement(HashMap<String, String> oldScope, TreeMap<String, FunctionDefinition> reffunTable, HashMap<String, String> refVarTable){
		scope = oldScope;
		funTable = reffunTable;
		varTable = refVarTable;
	}
	
	public HashMap<String, String> getScope() {
		return scope;
	}

	protected String generateVarLabel(String varName){
		return "V" + Integer.toString(VARCOUNTER++) + varName;
	}
	

	
	public String addVarToScope(String varName, String val){
		if (val == null) {
			val = "0";
		}
		
		String label = generateVarLabel(varName);
		varTable.put(label, val);
		scope.put(varName, label);
		printVarTable();
		printScope();
		
		return label;
	}
	
	public void printFunTable(){
		System.out.println("Hier kommt ne funTable");

		for (String key : funTable.keySet()) {
			System.out.println(key + " : " + funTable.get(key).getLabel());			
		}
	}
	
	public void printVarTable(){
		System.out.println("Hier kommt ne varTable");

		for (String key : varTable.keySet()) {
			System.out.println(key + " : " + varTable.get(key));			
		}
	}
	
	public void printScope(){
		System.out.println("Hier kommt der Scope");
		for (String key : scope.keySet()) {
			System.out.println(key + " : " + scope.get(key));			
		}
	}
	
	public String asm(){
		return "";
	}
}
