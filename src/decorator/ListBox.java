//designpatterns.decorator.ListBox.java
package decorator;

public class ListBox extends Component {
Window box;
ListBox(Window box){
	this.box=box;
}
public void click(){
System.out.println( "已扩展1项" );

	}
	public void display() {
		System.out.println("显示列表框！");
	}
}