package Java_elements;

public class calculate_profit_its_percentage {
	public static void main(String[] args) {
		System.out.println("Profit = selling price - cost price\r\n"
				+ "Profit Percentage = profit / cost price * 100\r\n"
				+ "");
		double selling_price = 191;
		double cost_price = 129;
		double profit = selling_price-cost_price;
		double profit_percentage = (profit/cost_price)*100;
		System.out.println("The Cost Price is INR "+cost_price+" and Selling Price is INR "+selling_price+"\n"
				+ "The Profit is INR "+profit+" and the Profit Percentage is "+profit_percentage+"\n"+"");
		
	}

}
