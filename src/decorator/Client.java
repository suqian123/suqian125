//designpatterns.decorator.Client.java
package decorator;

public class Client {
	private static Object BlackBorderDecorator;


	public static void main(String args[]) {
		Component component, componentSB, componentBB;  //ʹ�ó��󹹼�����ȫ������
		component = new Window();         //�������幹������
		componentSB = new ScrollBarDecorator(component); //����װ�κ�Ĺ�������        
		componentBB = new BlackBorderDecorator(componentSB); //��װ����һ�εĶ���ע����һ��װ�����У����еڶ���װ��
		componentBB.display();
		Window window=new Window();
Window ScrollbarDecorator=new TextBox( new ListBox(window));
ScrollbarDecorator.move();

	}

	}

