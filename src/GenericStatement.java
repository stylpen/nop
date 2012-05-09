import java.util.HashMap;


public class GenericStatement {
	HashMap<String, String> scope;
	
	public GenericStatement(HashMap<String, String> oldScope){
		scope = oldScope;
	}
	
	public HashMap<String, String> getScope() {
		return scope;
	}
	public void setScope(HashMap<String, String> scope) {
		this.scope = scope;
	}
	void addToScope(String varName, String label){
		scope.put(varName, label);
	}
	public String asm(){
		return "";
	}
}
