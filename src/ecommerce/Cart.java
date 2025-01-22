package ecommerce;

import java.math.BigDecimal;

public class Cart {
	
	private static final int DEFAULT_CART_CAPACITY = 10;
	private static final int MONEY_SCALE = 2;
	private static final double DEFAULT_TAX_RATE = 0.15;
	private static final String DEFAULT_TAX_TYPE = "incomeTax";
	private static final double DEFAULT_DISCOUNT_RATE = 0;
	private static final String DEFAULT_DISCOUNT_NAME = "zeroDiscount";
	
	private static int cartCounter;
	
	private int id;
	private int userId;
	private BigDecimal totalNetPrice; //without taxes
	private BigDecimal totalGrossPrice; //with taxes
	private BigDecimal totalTax;
	private Tax tax;
	
	
	
	

	public Cart() {
		// TODO Auto-generated constructor stub
	}
	
	
	public static class Tax{
		private String taxType;
		private double taxRate;
		
		public Tax(String taxType, double taxRate) {
			this.taxType = taxType;
			this.taxRate = taxRate;
		}
		
		public String getTaxType() {
			return taxType;
		}
		
		
	}

}
