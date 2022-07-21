package org;

public class ProductBuilder {
	private String name;
	private int price;
	private int id = 0;
	private String brand = "nothing";

	// Method 1
	public ProductBuilder(){}​

	// Method 2
	public Product buildProduct(){​
    return new Product(id,name,brand,price);
	​
    }​// Method 3
	
	public ProductBuilder id(int passedId){​
        this.id = passedId;​
    return this;​
    }​

	// Method 4
	public ProductBuilder name(String passedName){​
        this.name = passedName;​
    return this;​
    }​

	public ProductBuilder brand(String passedBrand){​
        this.brand = passedBrand;​
    return this;​
    }​

	// Method 4
	public ProductBuilder price(int passedPrice){​
        this.price = passedPrice;​
    return this;​
    }
   }

	