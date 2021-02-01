
public class Spinach  extends ToppingDecorator {
	public Spinach(Pizza pizza) {
		this.pizza = pizza;
	}
 
	public String getDescription() {
		return pizza.getDescription() + ", Spinach";
	}
 
	public double cost() {
		return pizza.cost() + .50; 
}
}