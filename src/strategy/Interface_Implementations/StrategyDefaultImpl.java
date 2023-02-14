package strategy.Interface_Implementations;

public class StrategyDefaultImpl implements IStrategy {

	@Override
	public void applyStrategy() {
		System.out.println("etape intermediare => en utilisant la strategie par defaut");
	}
	
}
