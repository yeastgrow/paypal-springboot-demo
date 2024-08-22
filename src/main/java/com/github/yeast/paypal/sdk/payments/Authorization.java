// This class was generated on Wed, 22 Aug 2018 20:48:41 PDT by version 0.1.0-dev+904328-dirty of Braintree SDK Generator
// Authorization.java
// @version 0.1.0-dev+904328-dirty
// @type object
// @data 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
// DO NOT EDIT
package com.github.yeast.paypal.sdk.payments;

import com.paypal.http.annotations.Model;
import com.paypal.http.annotations.SerializedName;

import java.util.List;
/**
 * The authorized payment transaction.
 */
@Model
public class Authorization {

    // Required default constructor
    public Authorization() {}

	/**
	* The currency and amount for a financial transaction, such as a balance or payment due.
	*/
	@SerializedName("amount")
	private Money amount;

	public Money amount() { return amount; }

	public Authorization amount(Money amount) {
	    this.amount = amount;
	    return this;
	}

	/**
	* The date and time, in [Internet date and time format](https://tools.ietf.org/html/rfc3339#section-5.6). Seconds are required while fractional seconds are optional.<blockquote><strong>Note:</strong> The regular expression provides guidance but does not reject all invalid dates.</blockquote>
	*/
	@SerializedName("create_time")
	private String createTime;

	public String createTime() { return createTime; }

	public Authorization createTime(String createTime) {
	    this.createTime = createTime;
	    return this;
	}

	/**
	* The date and time, in [Internet date and time format](https://tools.ietf.org/html/rfc3339#section-5.6). Seconds are required while fractional seconds are optional.<blockquote><strong>Note:</strong> The regular expression provides guidance but does not reject all invalid dates.</blockquote>
	*/
	@SerializedName("expiration_time")
	private String expirationTime;

	public String expirationTime() { return expirationTime; }

	public Authorization expirationTime(String expirationTime) {
	    this.expirationTime = expirationTime;
	    return this;
	}

	/**
	* The PayPal-generated ID for the authorized payment.
	*/
	@SerializedName("id")
	private String id;

	public String id() { return id; }

	public Authorization id(String id) {
	    this.id = id;
	    return this;
	}

	/**
	* The API caller-provided external invoice number for this order. Appears in both the payer's transaction history and the emails that the payer receives.
	*/
	@SerializedName("invoice_id")
	private String invoiceId;

	public String invoiceId() { return invoiceId; }

	public Authorization invoiceId(String invoiceId) {
	    this.invoiceId = invoiceId;
	    return this;
	}

	/**
	* An array of related [HATEOAS links](/docs/api/overview/#hateoas-links).
	*/
	@SerializedName(value = "links", listClass = LinkDescription.class)
	private List<LinkDescription> links;

	public List<LinkDescription> links() { return links; }

	public Authorization links(List<LinkDescription> links) {
	    this.links = links;
	    return this;
	}

	/**
	* The level of protection offered as defined by [PayPal Seller Protection for Merchants](https://www.paypal.com/us/webapps/mpp/security/seller-protection).
	*/
	@SerializedName("seller_protection")
	private SellerProtection sellerProtection;

	public SellerProtection sellerProtection() { return sellerProtection; }

	public Authorization sellerProtection(SellerProtection sellerProtection) {
	    this.sellerProtection = sellerProtection;
	    return this;
	}

	/**
	* The status for the authorized payment.
	*/
	@SerializedName("status")
	private String status;

	public String status() { return status; }

	public Authorization status(String status) {
	    this.status = status;
	    return this;
	}

	/**
	* The date and time, in [Internet date and time format](https://tools.ietf.org/html/rfc3339#section-5.6). Seconds are required while fractional seconds are optional.<blockquote><strong>Note:</strong> The regular expression provides guidance but does not reject all invalid dates.</blockquote>
	*/
	@SerializedName("update_time")
	private String updateTime;

	public String updateTime() { return updateTime; }

	public Authorization updateTime(String updateTime) {
	    this.updateTime = updateTime;
	    return this;
	}
}
