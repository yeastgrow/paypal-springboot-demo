// This class was generated on Thu, 16 May 2019 09:53:44 PDT by version 0.1.0-dev+8fcb5f of Braintree SDK Generator
// TaxInfo.java
// @version 0.1.0-dev+8fcb5f
// @type object
// @data H4sIAAAAAAAC/6yRT0vDQBBH736KYS9eQrDgKTelFxG0aPAi0k6zk2Zxs7vObLSL9LtL0j9ordCCx/nlkfBePlWZAqlCRVxOjau9ytQTssG5pTts957cUtqMKlNjkopNiMY7VaiyIYi4hJsx+BpiQ1B1En1LnEP57QIjgFY8vDr/4QBlYAOmHrz2sYHZ8EE9A3R6e0xjCjQDZAKmt84w6Vxl6ooZ01rgIlMPhPre2aSKGq1QP6zR3TBhH4ijIVHF805dIhu3+ENc/9DeTb/lt4LnsumQw2MXgudIGmrPg+cE0wRtr9uSi9BSbLwG72zKoUzBVGhtygZ0E9MIjEZQNchYRWIB691ieJ9x2rwb3aGVIdXo8iA278Q4EiE5qVjkbi+Y66xdZUdWG37YgXTb/Yh+0KMnRvwHw5fV2RcAAAD//w==
// DO NOT EDIT
package com.github.yeast.paypal.sdk.orders;

import com.paypal.http.annotations.Model;
import com.paypal.http.annotations.SerializedName;
/**
 * The tax ID of the customer. The customer is also known as the payer. Both `tax_id` and `tax_id_type` are required.
 */
@Model
public class TaxInfo {

    // Required default constructor
    public TaxInfo() {}

	/**
	* REQUIRED
	* The customer's tax ID. Supported for the PayPal payment method only. Typically, the tax ID is 11 characters long for individuals and 14 characters long for businesses.
	*/
	@SerializedName("tax_id")
	private String taxId;

	public String taxId() { return taxId; }

	public TaxInfo taxId(String taxId) {
	    this.taxId = taxId;
	    return this;
	}

	/**
	* REQUIRED
	* The customer's tax ID type. Supported for the PayPal payment method only.
	*/
	@SerializedName("tax_id_type")
	private String taxIdType;

	public String taxIdType() { return taxIdType; }

	public TaxInfo taxIdType(String taxIdType) {
	    this.taxIdType = taxIdType;
	    return this;
	}
}
