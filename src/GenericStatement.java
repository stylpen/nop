import java.util.HashMap;
import java.util.HashSet;
import java.util.TreeMap;


public class GenericStatement {
	HashMap<String, String> scope;
	TreeMap<String, String> funTable;
	HashMap<String, String> varTable;
	static int VARCOUNTER;
	static int FUNCOUNTER;
	static{
		VARCOUNTER = 0;
		FUNCOUNTER = 0;
	}
	
	public GenericStatement(HashMap<String, String> oldScope, TreeMap<String, String> reffunTable, HashMap<String, String> refVarTable){
		scope = oldScope;
		funTable = reffunTable;
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
	
	private String generateFunLabel(String funName){
		return "F" + Integer.toString(FUNCOUNTER++) + funName;
	}
	
	void addFun(String funName){
		
		String label = generateFunLabel(funName);
		funTable.put(funName, label);

		// f�r speicherplatzreservierung von return wert
		String  functionReturnValLabel = generateVarLabel(funName)
		varTable.put(functionReturnValLabel, "0");
		
		printFunTable();
	}
	
	
	void addVarToScope(String varName, String val){
		if (val == null) {
			val = "0";
		}
		
		String label = generateVarLabel(varName);
		varTable.put(label, val);
		scope.put(varName, label);
		printVarTable();
		printScope();
	}
	
	public void printFunTable(){
		System.out.println("Hier kommt ne funTable");

		for (String key : funTable.keySet()) {
			System.out.println(key + " : " + funTable.get(key));			
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
