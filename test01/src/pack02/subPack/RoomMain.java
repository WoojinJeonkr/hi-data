package pack02.subPack;

public class RoomMain {

	public static void main(String[] args) {
		Phone p = new Phone(); //4개가 만들어졌음.
		System.out.println(p);
		p.color = "빨강";
		p.price = 10;
		p.size = 5;
		System.out.println(p);
		
		//필요한 tv2대 가져다 놔주세요.
		TV myTv = new TV();
		TV yourTv = new TV();
		myTv.ch = 7;
		myTv.vol = 9;
		myTv.onOff = true;
		
		//첫번째 tv에 ch, vol, onOff값 넣어주세요.
		//그림과 비교해주세요.
		
		//전체 변수가 몇 개 생겼을까요.??
		System.out.println(myTv);
		//생성된 객체의 주소를 가지고 멤버메서드를 호출할 수 있다.
		
		myTv.on(10);
		//2번째 	tv에 멤버변수값을 넣어보고, 
		//멤버변수를 프린트해보세요.
		//System.out.println(myTv.ch);
		//그림을 그려보세요.!
	}

}
