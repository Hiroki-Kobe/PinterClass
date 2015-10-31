package week01;

import java.util.Calendar;

class clocktimer extends Thread{
	static int hour;
	static int min;
	static int sec;
	static boolean a = true;
	
	@Override
	public void run(){
	    while(a==true){

		    hour = Calendar.getInstance().get(Calendar.HOUR_OF_DAY); // Get HOUR
	        min  = Calendar.getInstance().get(Calendar.MINUTE);      // Get MINUTE
	        sec  = Calendar.getInstance().get(Calendar.SECOND);      // Get SECOND


	    try{
	    	Thread.sleep(500);
		    System.out.print(String.format("%1$02d : %2$02d : %3$02d", hour, min, sec));
		    
	        }catch(InterruptedException e) {}
	    }
	}
	
	
	public static void main(String[] args){
		clocktimer cl = new clocktimer();
		cl.start();
    }
}
