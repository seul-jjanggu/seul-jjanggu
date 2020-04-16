package D0414_class;
class Box {
	public void simpleWrap() {
		System.out.println("Simple wrapping");
	}
}

class PaperBox extends Box {
	public void paperwrap() {
		System.out.println("Paper Wrapping");
	}
}

class GoldPaperBox extends PaperBox {
	public void goldWrap() {
		System.out.println("Gold Wrapping");
		}
	}
	
public class test3 {
	public static void main(String[] args) {
		Box box1 = new Box();
		PaperBox box2 = new PaperBox();
		GoldPaperBox box3 = new GoldPaperBox();
		
		wrapBox(box1);
		wrapBox(box2);
		wrapBox(box3);
	}

		public static void wrapBox(Box box) {
			if (box instanceof GoldPaperBox) {
				((GoldPaperBox)box).goldWrap();
			}
			else if (box instanceof PaperBox) {
				((PaperBox)box).paperwrap();
			}
			else {
				box.simpleWrap();
			}
		}
}
