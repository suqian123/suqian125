//designpatterns.decorator.TextBox.java
package decorator;

public class TextBox extends Component {
	Window box;
	TextBox(Window box){
		this.box=box;
	}
	public void clear(){
		System.out.println( "扩展代码1" );
		box.clear();
		System.out.println( "扩展代码2" );
	}
	public void display() {
		System.out.println("显示文本框！");
	}
}