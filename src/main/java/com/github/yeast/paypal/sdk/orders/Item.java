// This class was generated on Thu, 16 May 2019 09:53:44 PDT by version 0.1.0-dev+8fcb5f of Braintree SDK Generator
// Item.java
// @version 0.1.0-dev+8fcb5f
// @type object
// @data H4sIAAAAAAAC/+yUXUscPxTG7/+f4pArhdHx3xYKeydKoRVfqLZQrOjZ5OxO2GwyJifaofjdS+ZlO+MoYitLL7wa8uQk+eXMk+enOKtKEhOhmZYiE1/Ra5waOsJlTz2gqhVEJvYpSK9L1s6KiTgrCBQxahNg5jxwQZBWBWAHU4IyellgILUtMrHrPVbNgTuZ+Eyojq2pxGSGJlASrqP2pFbCiXcledYUxOR8hRrYazsfw0pkmjtfDYB74hg8gUJXAVyV9LeUNhpzlz2Jqnoofdqh/linSTXkveo1cdv06QO3wiOtTbOQTKHZPK+17OOfEV5HtKx5aIKe+AhpV7ENhzFwMi7CbeEMgY3LKfn1wIdFHHA34zFyYCcXsCAqtZ1DtJph4/Tgy+bgBb6wJQ6dpWqMzPhjgNyMx8gyek9WVoBWAS5dtFzTIsy0RSs1GmCPNqBMqzIIURaAARCmaNDK2kglVkuyDCrSGvKkRb6UTg1df39mfN1zLjzRlizQo2Ty8PH0eOvdm//f/25EWnuxkSsnQ64t09xj2iBX2pPk3FPgvCveSsUh3wQukEErsqxnmkL9s7ui9Xj0Bk0cdqNTxl2oZzK4LbQsYKnnRXpZk+9xZ+etjKb+UjMyuhntWqh7Qb52R3u1dFOjFwRXn06+XTVNQE9gHafU1hKNqWDmG++g2W42zbtd750BiqReolmtePiss6P93lkhTpW+0SqFr2UHXLgY0CouwsPH5d0NP7SP0rfNbyMF3GwFUhqUFNoHMXBIBoEIzvc6bS8Z4bm2eQlnXDydBSmILpu3PTDIUP/XsmF839doeI2G12h4TjRc3P33CwAA//8=
// DO NOT EDIT
package com.github.yeast.paypal.sdk.orders;

import com.paypal.http.annotations.Model;
import com.paypal.http.annotations.SerializedName;
/**
 * The details for the items to be purchased.
 */
@Model
public class Item {

    // Required default constructor
    public Item() {}

	/**
	* The item category type.
	*/
	@SerializedName("category")
	private String category;

	public String category() { return category; }

	public Item category(String category) {
	    this.category = category;
	    return this;
	}

	/**
	* The detailed item description.
	*/
	@SerializedName("description")
	private String description;

	public String description() { return description; }

	public Item description(String description) {
	    this.description = description;
	    return this;
	}

	/**
	* REQUIRED
	* The item name or title.
	*/
	@SerializedName("name")
	private String name;

	public String name() { return name; }

	public Item name(String name) {
	    this.name = name;
	    return this;
	}

	/**
	* REQUIRED
	* The item quantity. Must be a whole number.
	*/
	@SerializedName("quantity")
	private String quantity;

	public String quantity() { return quantity; }

	public Item quantity(String quantity) {
	    this.quantity = quantity;
	    return this;
	}

	/**
	* The stock keeping unit (SKU) for the item.
	*/
	@SerializedName("sku")
	private String sku;

	public String sku() { return sku; }

	public Item sku(String sku) {
	    this.sku = sku;
	    return this;
	}

	/**
	* The currency and amount for a financial transaction, such as a balance or payment due.
	*/
	@SerializedName("tax")
	private Money tax;

	public Money tax() { return tax; }

	public Item tax(Money tax) {
	    this.tax = tax;
	    return this;
	}

	/**
	* REQUIRED
	* The currency and amount for a financial transaction, such as a balance or payment due.
	*/
	@SerializedName("unit_amount")
	private Money unitAmount;

	public Money unitAmount() { return unitAmount; }

	public Item unitAmount(Money unitAmount) {
	    this.unitAmount = unitAmount;
	    return this;
	}
}
