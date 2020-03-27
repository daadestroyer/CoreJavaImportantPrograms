package com.koolnigam.app14;

class VenueFixThread extends Thread{
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Marriage Venue is fixing");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			if(i ==  9) {
				System.out.println("*****Marriage Venue Fixed*****");
			}
		}
	}
}
class WeddingCardsPrintingThread extends Thread{
	public void run() {
		VenueFixThread vft = new VenueFixThread();
		vft.start();
		try {
			vft.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		for (int i = 0; i < 10; i++) {
			System.out.println("Marriage Wedding card is printing");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			if(i ==  9) {
				System.out.println("*****Marriage Wedding Card Printed*****");
			}
		}
	}
}
class WeddingCardsDistributionThread extends Thread {
	
	public void run() {
		WeddingCardsPrintingThread wcd = new WeddingCardsPrintingThread();
		wcd.start();
		try {
			wcd.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		for (int i = 0; i < 10; i++) {
			System.out.println("Marriage Wedding card is distributing");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			if(i ==  9) {
				System.out.println("*****Marriage Wedding Card Distributed*****");
			}
		}
	}
	
	
}
public class App14 {

	public static void main(String[] args) throws InterruptedException {
	
		WeddingCardsDistributionThread wcp = new WeddingCardsDistributionThread();
		wcp.start();
		wcp.join();
		
		System.out.println("All marriage work completed");

	}

}
