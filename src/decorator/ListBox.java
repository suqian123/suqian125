//designpatterns.decorator.ListBox.java
package decorator;

public class ListBox extends Component {
Window box;
ListBox(Window box){
	this.box=box;
}
public void click(){
System.out.println( "����չ1��" );

	}
	public void display() {
		System.out.println("��ʾ�б��");
	}
}