package strategy;
import strategy.Interface_Implementations.StrategyImpl1;

public class App {

	public static void main(String[] args) {
		Context context = new Context();
		context.setStrategy(new StrategyImpl1());
		context.process();
	}

}
