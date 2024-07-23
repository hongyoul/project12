package generic;

public class Ex2 {

	public static void main(String[] args) {

		ThreeDprinter3 printer = new ThreeDprinter3();
		
		Powder p1 = new Powder(); // Powder를 재료로 선택
		
		printer.setMaterial(p1); // 매개변수가 자동으로 형변환됨
		
		Object object = printer.getMaterial();
	//  ↑ Object는 형변환 되어 있는 상태 
		
//		Powder p2 = (Powder)printer.getMaterial(); //  재료를 꺼낼때는 직접 형변환을 해야함
		Powder p2 = (Powder)object; // 재료를 꺼낼때는 직접 형변환을 해야함 (다운캐스팅 된 상태)

		p2.doPrinting();
		
	}

}


//  파우더와 플라스틱을 재료로 사용하는 프린터 만들기
class ThreeDprinter3 {
	
	private Object material; //자료형을 Object로 선언하면 파우더와 플라스틱을 모두 저장할 수 있음

	public Object getMaterial() {
		return material;
	}

	public void setMaterial(Object material) {
		this.material = material;
	}
	
}