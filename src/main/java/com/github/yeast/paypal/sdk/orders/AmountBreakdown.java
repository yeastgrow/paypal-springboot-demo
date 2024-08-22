// This class was generated on Thu, 16 May 2019 09:53:44 PDT by version 0.1.0-dev+8fcb5f of Braintree SDK Generator
// AmountBreakdown.java
// @version 0.1.0-dev+8fcb5f
// @type object
// @data H4sIAAAAAAAC/+yYXWvbTBCF799fMejqLShR+gEF36UJhbY0CW0olDQ4492xNWS1q86ukoiS/14kWaoUO5RAruq9snV29mOOjx4s/UrO65KSWYKFq2yYL4TwWrtbm6TJNxTGhaETLB6p+ET1ejBJk2PySrgM7GwyS85zgqEU3BJCTtAtsQ/vhoFS3A1r8qApIBsPvlI5oIfgAhrgQMV6VrqWAt4Nis+5LNmuUsjRatN+Y+srQasoBbQaNHvVFPsUeAlo6/0kTQ5FsO4aP0iTL4T61Jo6mS3ReGqEnxUL6UE4E1eSBCafzC4Gyz47S/WmT/2OE39G4qZPqhIhq+r2wF1vsHQCCEu2aBU3bQtaj6qZlQ4mISzQNL2CEyixLsgG0BU9X48+CNvVZpP9kefKaZp0+nBks92LkAvRnspRUAUS+PD1dO/Nq5dv/xjRzL38P9NO+YxtoJVgs0CmWUiFTMiHrC/ea4p99gJCjgFYkw28ZPJt4vqiJzkSpHpgiK2MuU//6soNmmrqRq9sutCOpHCbs8qh4FUeYEGzH9XBwWtVmfaTuivD3dWhhdYLkjYd69aaTg1fE1x9PPt+1ZmAQmBdgFCXrNCYGpbSZQfNfrdo1q/6YA/QpLhAM8zYvtf5yfFoL18tNDf3sW5O6CDkrvJodcj99u2yvsP3TtrfSdbmg62KBUkDjP4gpUFFfn1DTBKSgieCi6NeO2qC8NTYPEcyLkfZeIQKPaAm6RiJkQqRCpEKu0aF4c/KJB5jNXIhciFyYee4EKiYt887UzCM5UiGSIZIhl0jQ//KY5KOkRipEKkQqbCrVJhvffm4bTRyInIicmLXOBHwbstjxViNXIhciFz4x7hwef/fbwAAAP//
// DO NOT EDIT
package com.github.yeast.paypal.sdk.orders;

import com.paypal.http.annotations.Model;
import com.paypal.http.annotations.SerializedName;
/**
 * The breakdown of the amount. Breakdown provides details such as total item amount, total tax amount, shipping, handling, insurance, and discounts, if any.
 */
@Model
public class AmountBreakdown {

    // Required default constructor
    public AmountBreakdown() {}

	/**
	* The currency and amount for a financial transaction, such as a balance or payment due.
	*/
	@SerializedName("discount")
	private Money discount;

	public Money discount() { return discount; }

	public AmountBreakdown discount(Money discount) {
	    this.discount = discount;
	    return this;
	}

	/**
	* The currency and amount for a financial transaction, such as a balance or payment due.
	*/
	@SerializedName("handling")
	private Money handling;

	public Money handling() { return handling; }

	public AmountBreakdown handling(Money handling) {
	    this.handling = handling;
	    return this;
	}

	/**
	* The currency and amount for a financial transaction, such as a balance or payment due.
	*/
	@SerializedName("insurance")
	private Money insurance;

	public Money insurance() { return insurance; }

	public AmountBreakdown insurance(Money insurance) {
	    this.insurance = insurance;
	    return this;
	}

	/**
	* The currency and amount for a financial transaction, such as a balance or payment due.
	*/
	@SerializedName("item_total")
	private Money itemTotal;

	public Money itemTotal() { return itemTotal; }

	public AmountBreakdown itemTotal(Money itemTotal) {
	    this.itemTotal = itemTotal;
	    return this;
	}

	/**
	* The currency and amount for a financial transaction, such as a balance or payment due.
	*/
	@SerializedName("shipping")
	private Money shipping;

	public Money shipping() { return shipping; }

	public AmountBreakdown shipping(Money shipping) {
	    this.shipping = shipping;
	    return this;
	}

	/**
	* The currency and amount for a financial transaction, such as a balance or payment due.
	*/
	@SerializedName("shipping_discount")
	private Money shippingDiscount;

	public Money shippingDiscount() { return shippingDiscount; }

	public AmountBreakdown shippingDiscount(Money shippingDiscount) {
	    this.shippingDiscount = shippingDiscount;
	    return this;
	}

	/**
	* The currency and amount for a financial transaction, such as a balance or payment due.
	*/
	@SerializedName("tax_total")
	private Money taxTotal;

	public Money taxTotal() { return taxTotal; }

	public AmountBreakdown taxTotal(Money taxTotal) {
	    this.taxTotal = taxTotal;
	    return this;
	}
}
