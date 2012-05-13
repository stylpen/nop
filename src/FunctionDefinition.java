import java.sql.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.TreeMap;

public class FunctionDefinition extends ScopedStatement {
	private int parameterCounter = 0;
	private HashMap<Integer, String> parameters = new HashMap<Integer, String>();
	private String label; 
	private String name; 
	
	private HashMap<String, String> globalScope;

	static int FUNCOUNTER;
	static{
		FUNCOUNTER = 0;
	}
	
	
	
	public FunctionDefinition(HashMap<String, String> oldScope, TreeMap<String, FunctionDefinition> refFunctionTable, HashMap<String, String> refVarTable) {
		super(oldScope, refFunctionTable, refVarTable); // super copies scope
		globalScope = oldScope;

	}
	
	
	// adds parameter to parameters map and to scope
	public void addParam(String varName){
		String label = "";
		label = super.addVarToScope(varName, null);
		
		parameters.put(parameterCounter++, label);
	
	}
	
	public String getParameterLabelByPosition (Integer position) {
		return parameters.get(position);
	}
	
	public Integer getNumberOfParameters () {
		return (parameterCounter - 1);
	}
	
	
	public String getLabel () {
		return label;
	}
	
	public String getName () {
		return name; 
	}
	
	void addFun(String funName){
		
		label = generateFunLabel(funName);
		name = funName; 
		funTable.put(funName, this);

		// für speicherplatzreservierung von return wert
		String  functionReturnValLabel = generateVarLabel(funName);
		varTable.put(functionReturnValLabel, "0");
		
		globalScope.put(funName, functionReturnValLabel);

		
		printFunTable();
	}
	private String generateFunLabel(String funName){
		return "F" + Integer.toString(FUNCOUNTER++) + funName;
	}
	

	
}
