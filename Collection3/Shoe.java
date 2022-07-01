package Collection3;

public class Shoe {
	private String brand;
	private int size;
	private int price;
	private boolean isWarrantyAvailable;
	private String shoeType;
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public boolean isWarrantyAvailable() {
		return isWarrantyAvailable;
	}
	public void setWarrantyAvailable(boolean isWarrantyAvailable) {
		this.isWarrantyAvailable = isWarrantyAvailable;
	}
	public String getShoeType() {
		return shoeType;
	}
	public void setShoeType(String shoeType) {
		this.shoeType = shoeType;
	}
	public Shoe(String brand,int size,int price,boolean isWarrantyAvailable,String shoeType) {
		this.brand=brand;
		this.size=size;
		this.price=price;
		this.isWarrantyAvailable=isWarrantyAvailable;
		this.shoeType=shoeType;
	}
	
	public String toString() {
		return "brand=" + brand + ", size=" + size + ", price=" + price + ", isWarrantyAvailable="
				+ isWarrantyAvailable + ", shoeType=" + shoeType;
	}
	

	}
	
	


