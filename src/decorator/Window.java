//designpatterns.decorator.Window.java
package decorator;

public class Window extends Component {

		public void clear(){
			System.out.println( "TextBox cleared" );
		}

public void click(){
		    System.out.println( "��ѡ��" );
}
	public void display() {
		System.out.println("��ʾ���壡");
	}
}