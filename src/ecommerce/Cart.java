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
	
	
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public int getUserId() {
		return userId;
	}


	public void setUserId(int userId) {
		this.userId = userId;
	}


	public BigDecimal getTotalNetPrice() {
		return totalNetPrice;
	}


	public void setTotalNetPrice(BigDecimal totalNetPrice) {
		this.totalNetPrice = totalNetPrice;
	}


	public BigDecimal getTotalGrossPrice() {
		return totalGrossPrice;
	}


	public void setTotalGrossPrice(BigDecimal totalGrossPrice) {
		this.totalGrossPrice = totalGrossPrice;
	}


	public BigDecimal getTotalTax() {
		return totalTax;
	}


	public void setTotalTax(BigDecimal totalTax) {
		this.totalTax = totalTax;
	}


	public Tax getTax() {
		return tax;
	}


	public void setTax(Tax tax) {
		this.tax = tax;
	}
	
	public class Discount {
		private String discountName;
		private double discountRate;
		

		public Discount(String discountName, double discountRate) {
			this.setDiscountName(discountName);
			this.setDiscountRate(discountRate);
		}


		public String getDiscountName() {
			return discountName;
		}


		public void setDiscountName(String discountName) {
			this.discountName = discountName;
		}


		public double getDiscountRate() {
			return discountRate;
		}


		public void setDiscountRate(double discountRate) {
			this.discountRate = discountRate;
		}
		
		
	}


	public static class Tax {
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
