package cl.tarce.sap.core.execution;

public class Counter {
	private static Integer counter = 0;
	
	public static void addCounter(){
		counter = counter + 1;
	}
	
	public static Integer getCounter(){
		return counter;
	}
}
