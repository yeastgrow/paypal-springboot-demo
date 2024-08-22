// This class was generated on Thu, 16 May 2019 09:53:44 PDT by version 0.1.0-dev+8fcb5f of Braintree SDK Generator
// ShippingOption.java
// @version 0.1.0-dev+8fcb5f
// @type object
// @data H4sIAAAAAAAC/7xWzW4cNwy+9ymIubQFxrvuD1DAQA6G3QDuT7Ko3QKFG2S4Go5FWCMplGR7WvSQB+iD9NpXSPpeheZnvbNrtE1g5DQQSYn8yI/k/FZcdJ6KoyJo9p7t1UvnIztblMVPKIxrQ8+wfdjgW+pGXVEWpxSU8KA6Ki40wWAXIGqMEDWBx44InEBLojTaCK5pSAJEt9FLPmRX2c6zuobks5IFOFIbFkVZHItgN4R9WBY/ENbPremKowZNoCx4lVio3ghW4jxJZArF0eUG8PfOUrcPE1uXbJyh24j2MaokQlZ1gLaGwQ4aJ4DQsEWrGA1EQRtQ5VslhKQ0YACENRq0qs+Hx64lG6FO9Hj4QhS2V/sAp5BfKlfTDOeuZh/uZdRCdKA0CqpIAmfnzw++/Pyzr+4Tke+++GRZOxWWbCNdCeYHljULqbgUCnE5GR9k47D8dKAI12QjN0yhZ8Nk9E4ZiZJ2EmKTMb+X/5mVGzRpno1Jsp+FXlPCrWaloeUrHWFNR7+kw8MvVDL9l4aT4eF0bKHPBUnPjhFaRmr4mqD6ZvVzNSQBhcC6CLHzrNCYDhoZuINmMTy6nF7d8QE1KW7RbG487Ovi2emWr5DWNd9wTXWOMPehSwFtHXV42N1yQvjUSV8nGZMPNrVrEnDNJhBvUFEYG2LGkBICEVyeTLKTTIR3pc1jMOPF/+AG1zNi9Mc5K44hWX6VCM5O97iMw1w7CGRIRaphGqTjgPww/Da4JjODMUl2kdT35/nollyzMPFek/F9o7agtHOBAC2g9+K8MEbagwmZMHSHrTdUQvVUiOB8tKlKqH48X53DStgJx26m+frOv/mz5j4iPxggC0G+UZV5gA6Xu7//SHf89rWF5u1r0OnNX9UCvnMKDf9KEDWHObitrfNxAJMN6XGrsXbOED60TEcyzCqyJZwX5azpIz1enfXdRiFCoBig2nDqCeRYqhI4gpAXCmTjMEd36vBv65juPKnY7+M1gRe6J20zdvtAhFtN+SHqoGEJEW6Ybnt1NXlbjNu/Au4tYYXdCg2caFLXLg2+hMkqWsBxAI+SfwfGiRK8s4GAG8C9JytQzkZku4X/yfuhz4we8dUp982weFySQDkYNQV7y1GPCBaQyQDO0kORoc2ZCxRzDnfC+zCNvvlNi9lum16jYH+ftRS1q2Hdja29VWe0Ax2uKD7mX9g4ej/6BwAA//8=
// DO NOT EDIT
package com.github.yeast.paypal.sdk.orders;

import com.paypal.http.annotations.Model;
import com.paypal.http.annotations.SerializedName;
/**
 * The options that the payee or merchant offers to the payer to ship or pick up their items.
 */
@Model
public class ShippingOption {

    // Required default constructor
    public ShippingOption() {}

	/**
	* The currency and amount for a financial transaction, such as a balance or payment due.
	*/
	@SerializedName("amount")
	private Money amount;

	public Money amount() { return amount; }

	public ShippingOption amount(Money amount) {
	    this.amount = amount;
	    return this;
	}

	/**
	* REQUIRED
	* A unique ID that identifies a payer-selected shipping option.
	*/
	@SerializedName("id")
	private String id;

	public String id() { return id; }

	public ShippingOption id(String id) {
	    this.id = id;
	    return this;
	}

	/**
	* REQUIRED
	* A description that the payer sees, which helps them choose an appropriate shipping option. For example, `Free Shipping`, `USPS Priority Shipping`, `Expédition prioritaire USPS`, or `USPS yōuxiān fā huò`. Localize this description to the payer's locale.
	*/
	@SerializedName("label")
	private String label;

	public String label() { return label; }

	public ShippingOption label(String label) {
	    this.label = label;
	    return this;
	}

	/**
	* REQUIRED
	* If the API request sets `selected = true`, it represents the shipping option that the payee or merchant expects to be pre-selected for the payer when they first view the `shipping.options` in the PayPal Checkout experience. As part of the response if a `shipping.option` contains `selected=true`, it represents the shipping option that the payer selected during the course of checkout with PayPal. Only one `shipping.option` can be set to `selected=true`.
	*/
	@SerializedName("selected")
	private Boolean selected;

	public Boolean selected() { return selected; }

	public ShippingOption selected(Boolean selected) {
	    this.selected = selected;
	    return this;
	}

	/**
	* The method by which the payer wants to get their items.
	*/
	@SerializedName("type")
	private String shippingType;

	public String shippingType() { return shippingType; }

	public ShippingOption shippingType(String shippingType) {
	    this.shippingType = shippingType;
	    return this;
	}
}
