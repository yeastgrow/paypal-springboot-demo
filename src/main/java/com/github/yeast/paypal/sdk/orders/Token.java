// This class was generated on Thu, 16 May 2019 09:53:44 PDT by version 0.1.0-dev+8fcb5f of Braintree SDK Generator
// Token.java
// @version 0.1.0-dev+8fcb5f
// @type object
// @data H4sIAAAAAAAC/6zQwUoDMRCA4btPMcw5iue9CXspgi5SvIiHsZntBrNJnEwOUfruktrWahERPOafQL7JGy5rYuxQ4zMHNHhP4ujJ8w3Nx/ma666gwZ7zSlxSFwN2uJwYttfcK1tIVGcOCjkWWbUBjCVYoP3gAg1eiVD9ePfS4B2TvQ2+YjeSz9zCS3HC9hAGiYlFHWfsHg7irOLC+pTs7Bfv9ngqHqgO5M/XHFhI2cKihzEK6H6bP0FVyjdnKN5vzK9YbeNj7i78+MXUEsysU7SgEyl8rtDsi/4/4I+bs3cAAAD//w==
// DO NOT EDIT
package com.github.yeast.paypal.sdk.orders;

import com.paypal.http.annotations.Model;
import com.paypal.http.annotations.SerializedName;
/**
 * The tokenized payment source to fund a payment.
 */
@Model
public class Token {

    // Required default constructor
    public Token() {}

	/**
	* REQUIRED
	* The PayPal-generated ID for the token.
	*/
	@SerializedName("id")
	private String id;

	public String id() { return id; }

	public Token id(String id) {
	    this.id = id;
	    return this;
	}

	/**
	* REQUIRED
	* The tokenization method that generated the ID.
	*/
	@SerializedName("type")
	private String type;

	public String type() { return type; }

	public Token type(String type) {
	    this.type = type;
	    return this;
	}
}
