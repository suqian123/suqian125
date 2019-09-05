//designpatterns.decorator.Client.java
package decorator;

public class Client {
	private static Object BlackBorderDecorator;


	public static void main(String args[]) {
		Component component, componentSB, componentBB;  //使用抽象构件定义全部对象
		component = new Window();         //创建具体构件对象
		componentSB = new ScrollBarDecorator(component); //创建装饰后的构件对象        
		componentBB = new BlackBorderDecorator(componentSB); //将装饰了一次的对象注入另一个装饰类中，进行第二次装饰
		componentBB.display();
		Window window=new Window();
Window ScrollbarDecorator=new TextBox( new ListBox(window));
ScrollbarDecorator.move();

	}

	}

