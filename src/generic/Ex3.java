package generic;

public class Ex3 {

	public static void main(String[] args) {

		// 파우더를 사용하는 프린터기 생성
		ThreeDPrinter<Powder> printer1 = new ThreeDPrinter<>();  //객체를 생성할 때 타입을 파우더로 지정 
		printer1.setMaterial(new Powder());
		Powder powder = printer1.getMaterial(); //재료를 꺼낼 때 Powder가 반환됨
		powder.doPrinting();
		
		//플라스틱을 사용하는 프린터기 생성
		ThreeDPrinter<Plastic> plastic2 = new ThreeDPrinter(); //객체를 생성할 때 타입을 플라스틱으로 지정
		plastic2.setMaterial(new Plastic());
		Plastic plastic = plastic2.getMaterial();
		plastic.doPrinting();
		
		
		
	}

}

// 제너릭 클래스 만들기
class ThreeDPrinter<T> { // 다이아몬드 연산자안에 문자T 작성
	
	private T material; // Object 대신에 문자T 작성

	public T getMaterial() {
		return material;
	}

	public void setMaterial(T material) {
		this.material = material;
	}
	
}
