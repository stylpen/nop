import java.util.HashMap;


public class ScopedStatement extends GenericStatement {

	public ScopedStatement(HashMap<String, String> oldScope) {
		super(new HashMap<String, String>(oldScope));
	}
}
