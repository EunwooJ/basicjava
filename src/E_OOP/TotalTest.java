package E_OOP;

public class TotalTest {	//Method Area에 TotalTest 클래스를 로드해주고, 클래스변수(없음)와 클래스메서드(main())를 찾아 같이 로드해준다.
	public static void main(String[] args) { //main()가 실행되므로 Call Stack에 올려준다.

		TvMaker.color = "Blue"; //왼쪽에 있는 TvMaker 클래스를 Method Area에 로드해준다. 클래스에 같이 올라갈 클래스변수와 클래스메서드를 아래에 있는 TvMaker클래스에서 찾아준다. 
								//"Blue"를 null로 초기화 되어있는 color클래스변수에 넣어준다.
		TvMaker tm = new TvMaker(); // TvMaker 클래스를 Method Area에 로드해준다. 이미 만들어져 있으므로 그대로 사용한다.
									// main()의 지역변수 tm을 Call Stack의 main() 영역에 올려준다.
									// new를 통해 인스턴스화를 진행한 후,TvMaker() 생성자를 Call Stack에 올려준다.
									// 인스턴스화를 통해 만들어진 객체 tm의 주소를 heap 영역에 저장하고, 인스턴스 변수(name, age)와 인스턴스 메서드(TvMaker(),TvMaker(String, int))를 찾아 같은 영역에 올려준다.
		tm.age = 30; // 참조변수.변수명 => 인스턴스 호출방법이다. 인스턴스변수 age의 값을 30으로 바꿔준다. 
		// 3. 메서드 호출
		System.out.println(TvControll.channel); //TvControll()을 Call Stack에 쌓아주고 매개변수 channel을 올려준 뒤, 값을 15으로 바꿔준다. 콘솔창에 출력값 15을 찍는다.
		TvControll.volumeDown(); //volumeDown()을 Call Stack에 쌓아주고 volumeDown()를 찾아간다. 수행 완료 후 Call Stack에서 지워준다.
		System.out.println(TvControll.channel); // return 값으로 반환된 TvControll클래스의 channel의 값을 콘솔창에 출력해준다. 

		// 3.인스턴스 생성
		TvControll tc; // TvControll클래스를 Method Area에 로드해준다.클래스에 같이 올라갈 클래스변수와 클래스메서드를 아래에 있는 TvControll클래스에서 찾아준다. 
					   // TvControll 클래스를 로드해주고,클래스변수(MAX_CHANNEL,MIN_CHANNEL,channel)와 클래스메서드(volumeDown())를 찾아 같이 로드해준다.
				       // MAX_CHANNEL = 0, MIN_CHANNEL=0, channel=0 으로 초기화해준다.
					   // TvControll클래스의 참조변수 tc를 선언하고, main()의 지역변수로 tc를 Call Stack의 영역에 올려준다.
		tc = new TvControll();  // new를 통해 인스턴스화를 진행한 후, TvControll()생성자를 Call Stack에 올려준다.
								// 인스턴스화를 통해 만들어진 객체 tc의 주소를 heap 영역에 저장하고, 인스턴스 변수(MAX_VOLUME, MIN_VOLUME,volume)와 인스턴스 메서드(volumeUp())를 찾아 같은 영역에 올려준다.
								// MAX_CHANNEL = 0, MIN_CHANNEL=0, channel=0 으로 초기화해준다.
		System.out.println(tc.volume); //참조변수.변수명 = > 인스턴스변수 호출방법이다. 인스턴스변수 volume의 초기값인 99를 콘솔창에 출력해준다.
		tc.volumeUp(); // 인스턴스메서드 volumeUp을 호출한다. Call Stack 영역에 로드해준다. 수행 완료 후 Call Stack에서 지워준다.
		System.out.println(tc.volume); //인스턴스변수 volume의 수행후의 값99 을 콘솔창에 출력해준다.
		tc.volumeUp(); // 인스턴스메서드 volumeUp을 호출한다. Call Stack 영역에 로드해준다. 수행 완료 후 Call Stack에서 지워준다.
		System.out.println(tc.volume); //

		//
		Calc cc = new Calc(); //메인메소드의 지역변수 cc가 선언된다 // calc클래스의 인스턴스가 힙메모리가 저장되며 친구들이 같이 로드된다 // 
		System.out.println(cc.add(Integer.MAX_VALUE, 4)); //calc클래스의 메소드를 호출하는데 해당 타입에 맞는 메소드를 호출한다 // 인트의 최댓값 얘기 있으면 +1 // 오버플로우 얘기있으면 +1
		System.out.println(cc.add(3L, Integer.MAX_VALUE));//calc클래스의 메소드를 호출하는데 해당 타입에 맞는 메소드를 호출한다 // 

	}
}

class TvMaker {
	// 1. 멤버변수
	// 1.1 클래스변수 color를 초기값 null로 설정하고, 클래스변수 inch를 초기값 0으로 설정한다. 그 뒤 Method Area의 TvMaker클래스 영역에 로드해준다. 
	static String color;
	static int inch;
	// 1.2 인스턴스변수 name를 초기값 null로 설정하고, 인스턴스변수 age를 초기값 0으로 설정한다. 그 뒤 heap 영역의 tm의 주소에 저장한다 
	String name = "";
	int age;

	// 2.TvMaker 생성자 : 생성자의 이름은 클래스의 이름과 같아야 한다. 생성자는 리턴값이 없다
	// 2.TvMaker 생성자 초기값은 "man", 25이다.
	TvMaker() {
		this("man", 25);
	}

	// 2.2 인스턴스메서드 TvMaker(String, int)를  heap 영역의 tm의 주소에 저장한다.
	TvMaker(String name, int age) { //TvMaker메서드를 Call Stack 영역에 쌓고 인자값을 String,int로 넣어준다.
									//매개변수 name과 age를 인자값으로 초기화해준다.
		this.name = name; 
		this.age = age;
	}
}

class TvControll {
	final int MAX_VOLUME = 100;
	final int MIN_VOLUME = 0;
	static final int MAX_CHANNEL = 50;
	static final int MIN_CHANNEL = 1;

	static int channel = 15;
	int volume = 99;

	// 4. return문
	int volumeUp() { // volumeUp클래스 메서드가 실행된다.
		if (volume == MAX_VOLUME) { // 채널의 값은 99이다. MAX_VOLUMEL의 값과 같지 않다.
			volume = MIN_VOLUME;//위의 조건이 일치하지 않으므로 실행하지 않는다. 만약 일치한다면 MIN_VOLUMEL의 값을  volume에 넣어준다.
		} else { // 채널의 값은 99이다. MAX_VOLUME의 값과 같지 않으므로 다음 조건문을 실행한다.
			volume++; //볼륨의 값을 1올려준다.
		} //조건문 종료

		return volume; //볼륨의 값을 return해준다.
	}// volumeDown클래스 메서드 종료

	static int volumeDown() { // volumeDown클래스 메서드가 실행된다.
		if (channel == MAX_CHANNEL) { // 채널의 값은 15이다. MAX_CHANNEL의 값과 같지 않다.
			channel = MIN_CHANNEL; //위의 조건이 일치하지 않으므로 실행하지 않는다. 만약 일치한다면 MIN_CHANNEL의 값을  channel에 넣어준다.
		} else { // 채널의 값은 15이다. MAX_CHANNEL의 값과 같지 않으므로 다음 조건문을 실행한다.
			channel++; //채널의 값을 1올려준다.
		} //조건문 종료
		return channel; //채널의 값을 return해준다.
	} // volumeDown클래스 메서드 종료
}

class Calc {
	// 5.메소드 오버로딩에 대한 설명 필요!(안하면 0점) // 오버로딩의 조건 포함되어 있으면 +1점 //
	int add(int a, int b) {
		return a + b;
	}

	long add(long a, int b) {
		return a + b;
	}

	int minus(int a, int b) {
		return a + b;
	}
}