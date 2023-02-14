package strategy;
import java.util.Scanner;
import java.lang.Class;

import strategy.Interface_Implementations.*;


public class App {

	public static void main(String[] args) throws Exception{
		Context context = new Context();
		
		boolean fin = false;
		Scanner scanner = new Scanner(System.in);
		while(!fin ) {
			System.out.println("Donner la strategie");
			String strategyClassName = scanner.nextLine();
			/* il faut donner le nom complet de la classe 
			 * exp: strategy.Interface_Implementations.StrategyImpl1
			 */
			IStrategy strategy = (IStrategy) Class.forName(strategyClassName).newInstance();
			context.setStrategy(strategy);
			context.process();
		}
	}

}
