package week02_2;

public class BarControll implements Runnable{
	int progress = 0;
	final BarView view;
	final BarData bardata;
	private boolean running = true;

	
	public BarControll(BarView bar, BarData data){
		this.view = bar;
		this.bardata = data;
	}
	
	

	@Override
	public void run() {
		while(running){
			try{
				Thread.sleep(50);
				checkRun();
			    if(running=false){
					wait();
				}

			}catch(InterruptedException ignore){}
			    
			    progress = bardata.getValue();
			    view.setValue(progress);
			    
		}
	}

	
    public void checkRun(){
    	running = view.startStop();
    }
 
	

	public static void main(String[] args){
		BarView view = new BarView();
		BarData bardata = new BarData();
		
		BarControll controller = new BarControll(view, bardata);
		view.startProgram();

		new Thread(controller).start();

	}
}
