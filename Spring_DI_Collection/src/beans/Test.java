package beans;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Test {
	private List fruits;
	private Set cricketers;
	private Map countrycap;
	private Properties statecap;

	public void setFruits(List fruits) {
		this.fruits = fruits;
	}

	public void setCricketers(Set cricketers) {
		this.cricketers = cricketers;
	}

	public void setCountrycap(Map countrycap) {
		this.countrycap = countrycap;
	}

	public void setStatecap(Properties statecap) {
		this.statecap = statecap;
	}

	public void printData() {
		System.out.println("Fruits=========");
		for (Object val : fruits) {
			System.out.println(val);
		}
		System.out.println("cricketers=======");
		for (Object val : cricketers) {
			System.out.println(val);
		}

		System.out.println("countrycap=======");
		Set keys = countrycap.keySet();
		for (Object key : keys) {
			System.out.println(key + "==" + countrycap.get(key));
		}
		System.out.println("statescap==========");
		keys = statecap.keySet();
		for (Object key : keys) {
			System.out.println(key + "==" + statecap.get(key));
		}
	}

}
