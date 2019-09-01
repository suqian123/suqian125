//designpatterns.decorator.TextBox.java
package decorator;

public class TextBox extends Component {
	Window box;
	TextBox(Window box){
		this.box=box;
	}
	public void clear(){
		System.out.println( "��չ����1" );
		box.clear();
		System.out.println( "��չ����2" );
	}
	public void display() {
		System.out.println("��ʾ�ı���");
	}
}