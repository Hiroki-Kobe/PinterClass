package week02_2;

public class BarControll implements Runnable{
	int progress = 0;
	final BarView view;
	final BarData bardata;
	private boolean running = true;
	String status;

		
	
	public BarControll(BarView bar, BarData data){
		this.view = bar;
		this.bardata = data;
	}
	
	
	
	@Override
	public void run() {
		while(running){
			try{
				Thread.sleep(50);
				stopRun();
			}catch(InterruptedException ignore){}
			    
			    progress = bardata.getValue();
			    view.setValue(progress);
			    
		}
	}


	public void stopRun(){
		status = view.StartStop();
		if(status == "stop"){
			running = false;
		}else{
			running =true;
		}
	}

	
	
	public void startRun(){
		status = view.StartStop();
		if(status == "start"){
			running = false;
		}else{
			running =true;
		}
	}
	

	
	public static void main(String[] args){
		BarView view = new BarView();
		BarData bardata = new BarData();
		
		BarControll controller = new BarControll(view, bardata);
		view.startProgram();

		new Thread(controller).start();

	}
}
