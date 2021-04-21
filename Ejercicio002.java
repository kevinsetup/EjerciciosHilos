package ejerciciosjava;

import ejercicios.hilocomida;

public class Ejercicio002 {
	private static int[] numbers = {
			2,7,5,4,9,3,6,8,1,10
			};
	public static void main(String[] args) {
		int s = 0;
		for(int number : numbers ) {
		
			s += Math.pow(number,3);
			
			Thread exec = new Thread(new cubes(number));
			exec.start();
		}
	System.out.println("La suma es = " + s);
	}
}
class cubes extends Thread {
	private int number;
	public cubes(int number) {
		this.number = number;
	}
	public void run() {	
		System.out.println(this.number + " **Al cubo **  " + Math.pow(this.number, 3));		
	}
}
