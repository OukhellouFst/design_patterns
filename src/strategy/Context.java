package strategy;

import strategy.Interface_Implementations.IStrategy;
import strategy.Interface_Implementations.StrategyDefaultImpl;

public class Context {
	
	/* the week-relation 
	 * ( the implementation to be injected )*/
	private IStrategy strategy;
	
	public Context() {
		strategy = new StrategyDefaultImpl();
	}
	
	public void process() {
		System.out.println("etape 1 de l'algo");
		
		/* the portion of algorithm which is dynamically
		 *  and constantly changing */
		strategy.applyStrategy();
		
		System.out.println("etape finale de l'algo ");
	}


	public void setStrategy(IStrategy strategy) {
		this.strategy = strategy;
	}

}
