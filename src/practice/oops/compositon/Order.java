package practice.oops.compositon;

import java.util.ArrayList;
import java.util.List;

public class Order {
	
	 private int id;
	    private String name;
	    private List<LineItem> lineItems;

	    public Order(int id, String name) {
	         super();
	         this.id = id;
	         this.name = name;
	         this.lineItems = new ArrayList<LineItem>();
	    }

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public List<LineItem> getLineItems() {
			return lineItems;
		}

		public void setLineItems(List<LineItem> lineItems) {
			this.lineItems = lineItems;
		}

		@Override
		public String toString() {
			return "Order [id=" + id + ", name=" + name + ", lineItems=" + lineItems + "]";
		}
	    
		 public void addItem(int id, int quantity, Product p) {
	         this.lineItems.add(new LineItem(id, quantity, p));
	    }
		 
		 
		 

}
