// This class was generated on Thu, 16 May 2019 09:53:44 PDT by version 0.1.0-dev+8fcb5f of Braintree SDK Generator
// PaymentMethod.java
// @version 0.1.0-dev+8fcb5f
// @type object
// @data H4sIAAAAAAAC/6zRT0sDMRAF8LufIsw5Fc97E7wJKlK8iCwx++oG8s/J7CFIv7uUbUOlK/Sw17xh8n7MD21rBnWUTQ2I0gfImAbS9GbYmU+PJxMW80fUY0SaHlAsuywuRepoO0LZqUgKYGXioALYjiaKOm5RmbEDI1qUW9J0z2zqXORO0yvM8Bx9pW5nfMHh4XtyjKE9vHDKYHEo1L03QhF28WuxOtDPXx62nHe/zC4pp/abNtYcJU28giFO3u/1VRDuCzysLDj+RP9fZHOaaor5pipFJWdcVZxgFdnH/uYXAAD//w==
// DO NOT EDIT
package com.github.yeast.paypal.sdk.orders;

import com.paypal.http.annotations.Model;
import com.paypal.http.annotations.SerializedName;
/**
 * The customer and merchant payment preferences.
 */
@Model
public class PaymentMethod {

    // Required default constructor
    public PaymentMethod() {}

	/**
	* The merchant-preferred payment sources.
	*/
	@SerializedName("payee_preferred")
	private String payeePreferred;

	public String payeePreferred() { return payeePreferred; }

	public PaymentMethod payeePreferred(String payeePreferred) {
	    this.payeePreferred = payeePreferred;
	    return this;
	}

	/**
	* The customer-selected payment method on the merchant site.
	*/
	@SerializedName("payer_selected")
	private String payerSelected;

	public String payerSelected() { return payerSelected; }

	public PaymentMethod payerSelected(String payerSelected) {
	    this.payerSelected = payerSelected;
	    return this;
	}
}
