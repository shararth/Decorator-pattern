
public class 	Paneer extends ToppingDecorator {
	public 	Paneer (Pizza pizza) {
		this.pizza = pizza;
	}
 
	public String getDescription() {
		return pizza.getDescription() + ", Paneer";
	}
 
	public double cost() {
		return pizza.cost() + .75; 
}
}
