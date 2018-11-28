package F_OOP2;

public class TimeTest {
	public static void main(String[] args) {
		Time t = new Time();
		
		t.setHour(100);
		int hour = t.getHour();
		System.out.println(hour); //4
		
		t.setMinute(150);
		int minute = t.getMinute();
		System.out.println(t.getHour() + " : " + minute); //6 : 30
		
		t.setSecond(10000);
		int second = t.getSecond();
		System.out.println(t.getHour() + " : " + t.getMinute() + " : " + second); //9 : 36 : 40
		
		
	}
}

class Time{
	private int hour;
	private int minute;
	private int second;
	
	
	//시
	 void setHour(int hour){  //내가 원하는 방식으로 나오게 셋팅가능
//		if(hour > 23){
			this.hour = hour%24;
//	    } else {
//	    	this.hour = hour;
//	    }
	}
	
	int getHour(){
		return hour;
	}
	
	//분
	void setMinute(int minute){  
//		if(minute > 59){
			this.minute = minute%60;
			setHour(hour + minute/60);
//	    } else {
//	    	this.minute = minute;
//	    }
	}
	
	int getMinute(){
		return minute;
	}
	
	//초
	void setSecond(int second){  
//		if(second > 59){
			this.second = second%60;
			setMinute(minute+second/60);
//	    } else {
//	    	this.second = second;
//	    }
	}
	
	int getSecond(){
		return second;
	}
}





























