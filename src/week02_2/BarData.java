package week02_2;

public class BarData{
    int progress = 0;
    int max = 100;
    boolean check = true; 
    
    public int getValue(){
    	if(check){
    		if(progress < max){
    		    progress++;
    		}
    		else if(progress==max){
    			check =false;
    		}
    	}
    	else{
    		if(progress > 0){
        		progress--;
    		}
    		else if(progress == 0){
    			check = true;
    		}
    	}
    	
    	return progress;
    }
    
}
