package clock;

public class Clock {
	
	// Fields
    private int hours;
    private int minutes;
    private int seconds;
    
    private String leadh;
    private String leadm;
    private String leads;
 
    // Constructor
    /**
     * 
     * @param h
     * @param m
     * @param s
     */
    public Clock(int h, int m, int s) {
        hours = h; minutes = m; seconds = s;
        if(hours<0 || hours>23 ||
        		minutes<0 || minutes>59 ||
        		seconds<0 || seconds>59) {
        	hours=0;
        	minutes=0;
        	seconds=0;
        }
    }
 
    // Reset method
    public void resetToMidnight() {
        hours = 0; minutes = 0; seconds = 0;
    }
 
    // Check if morning method
    public boolean isMorning() {
        return hours > 12;
    }
 
    // Advance one second method
    public void tick() {
        seconds++;
        if (seconds == 60) {
            seconds = 0;
            minutes++;
            if(minutes == 60) {
            	minutes = 0;
            	hours++;
            	if(hours == 24) {
            		hours = 0;
            	}
            }
        }
    }
    /**
     * 
     * @param h
     * @throws Exception
     */
    public void setHours(int h) throws Exception {
    	if(h>=0 && h<=23) {
    		hours=h;
    	}else throw new Exception("hours are not in range");
    }
    
    /**
     * 
     * @param m
     * @throws Exception
     */
    public void setMinutes(int m) throws Exception {
    	if(m>=0 && m<=59) {
    		minutes=m;
    	}else throw new Exception("minutes are not in range");
    }
    
    /**
     * 
     * @param s
     * @throws Exception
     */
    public void setSeconds(int s) throws Exception {
    	if(s>=0 && s<=59) {
    		seconds=s;
    	}else throw new Exception("seconds are not in range");
    }
    
    public int getHours() {
    	return hours;
    }
    
    public int getMinutes() {
    	return minutes;
    }
    
    public int getSeconds() {
    	return seconds;
    }
    
    public void leadHours() {
    	if(hours<10) {
    		leadh="0";
    	} else {
    		leadh="";
    	}
    }
    
    public void leadMinutes() {
    	if(minutes<10) {
    		leadm="0";
    	} else {
    		leadm="";
    	}
    }
    
    public void leadSeconds() {
    	if(seconds<10) {
    		leads="0";
    	} else {
    		leads="";
    	}
    }

    
    public String toString() {
    	return leadh+hours+":"+leadm+minutes+":"+leads+seconds;
    }
}
