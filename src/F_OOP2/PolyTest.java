package F_OOP2;

public class PolyTest {
	public static void main(String[] args) {
		//1. 스마트 티비 3대 저장하세요
		Tv[] smarttv = new SmartTv[3];
//		smarttv[0] = new SmartTv();
		Tv st1 = new SmartTv();
		smarttv[0] = st1;
		
		smarttv[1] = new SmartTv();
		smarttv[2] = new SmartTv();
		
		//2. ThreeDTV 2대 저장하세요
		ThreeDTv[] threedtv = new ThreeDTv[2];
		threedtv[0] = new ThreeDTv();
		threedtv[1] = new ThreeDTv();
		
		//3. AfreecaTv 4대 저장하세요
		AfreecaTv[] afreecatv = new AfreecaTv[4];
		afreecatv[0] = new AfreecaTv();
		afreecatv[1] = new AfreecaTv();
		afreecatv[2] = new AfreecaTv();
		afreecatv[3] = new AfreecaTv();
		
		//다형성
		Tv[] t = new Tv[9];
		t[0] = /*(Tv)*/new SmartTv();  //up-casting
		t[1] = new SmartTv();
		t[2] = new SmartTv();
		t[3] = new ThreeDTv();
		t[4] = new ThreeDTv();
		t[5] = new AfreecaTv();
		t[6] = new AfreecaTv();
		t[7] = new AfreecaTv();
		t[8] = new AfreecaTv();
		
		SmartTv st4 = (SmartTv)t[2]; //down-casting
//		st4.internet();
		
//		SmartTv tt = (SmartTv)new Tv();  //불가
		
		
	}
}


class Tv{
	boolean power;
	int channel;
	
	void power(){
		power = !power;
	}
	
	void channelUp(){
		channel++;
	}
}


class SmartTv extends Tv{
	void internet(){
		
	}	
}
	

class ThreeDTv extends Tv{
	void threeD(){
		
	}
}


class AfreecaTv extends Tv{
	void starBalloon(){
		
	}
}







