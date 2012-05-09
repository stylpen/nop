import java.util.HashMap;
import java.util.HashSet;
import java.util.TreeMap;


public class GenericStatement {
	HashMap<String, String> scope;
	TreeMap<String, String> functionTable;
	HashSet<String> varTable;
	static int VARCOUNTER;
	static int FUNCOUNTER;
	static{
		VARCOUNTER = 0;
		FUNCOUNTER = 0;
	}
	
	public GenericStatement(HashMap<String, String> oldScope, TreeMap<String, String> refFunctionTable, HashSet<String> refVarTable){
		scope = oldScope;
		functionTable = refFunctionTable;
		varTable = refVarTable;
	}
	
	public HashMap<String, String> getScope() {
		return scope;
	}
	public void setScope(HashMap<String, String> scope) {
		this.scope = scope;
	}
	private String generateVarLabel(String varName){
		return "V" + Integer.toString(VARCOUNTER++) + varName;
	}
	
	void addVarToScope(String varName){
		String label = generateVarLabel(varName);
		varTable.add(label);
		scope.put(varName, label);
	}
	
	public void printVarTable(){
		System.out.println("Hier kommt ne varTable");
		for (String label : varTable) {
			System.out.println(label);			
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
