package ejerciciosjava;


public class Ejercicio001{
	public static void main(String[] args) {
		Thread h1 = new Thread(new hilo1());
		Thread h2 = new Thread(new hilo2());
		h1.start();
		h2.start();
		
	}
	
 }

//otras clases
 class hilo1 extends Thread {
	 public void run() {
		for(int i = 1; i <= 10 ; i++) {
			System.out.println(i);
		}
		 
	 }
	 
	 
 }
 class hilo2 extends Thread {
	 public void run() {
		 for(int i = 10 ; i >= 1 ; i--) {
				System.out.println(i);
			} 
		 
	 }
 }








