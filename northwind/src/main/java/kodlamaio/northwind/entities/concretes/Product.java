package kodlamaio.northwind.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="products")
public class Product {
	
	@Id
	@GeneratedValue
	@Column(name="product_id")
	private int id;
	
	@Column(name="category_id")
	private int categoryId;
	
	@Column(name="product_name")
	private String productName;
	
	@Column(name="unit_price")
	private double unitPrice;
	
	@Column(name="units_in_stock")
	private short unitsInStock;
	
	@Column(name="quantity_per_unit")
	private String quantityPerUnitString;
	
	public Product() {
		
	}
	
	public Product(int id, int categoryId, String productNameString, double unitPrice, short unitsInStock,
			String quantityPerUnitString) {
		super();
		this.id = id;
		this.categoryId = categoryId;
		this.productName = productNameString;
		this.unitPrice = unitPrice;
		this.unitsInStock = unitsInStock;
		this.quantityPerUnitString = quantityPerUnitString;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}
	public String getProductNameString() {
		return productName;
	}
	public void setProductNameString(String productNameString) {
		this.productName = productNameString;
	}
	public double getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}
	public short getUnitsInStock() {
		return unitsInStock;
	}
	public void setUnitsInStock(short unitsInStock) {
		this.unitsInStock = unitsInStock;
	}
	public String getQuantityPerUnitString() {
		return quantityPerUnitString;
	}
	public void setQuantityPerUnitString(String quantityPerUnitString) {
		this.quantityPerUnitString = quantityPerUnitString;
	}

}
