// This class was generated on Thu, 16 May 2019 09:53:44 PDT by version 0.1.0-dev+8fcb5f of Braintree SDK Generator
// AuthorizationStatusDetails.java
// @version 0.1.0-dev+8fcb5f
// @type object
// @data H4sIAAAAAAAC/6SPQUsDQQxG7/6KkPMinvcmVESEtUjxItJGN3UD05kxySCj9L9LmbqgvQheXx7hfZ+4qpmxRyo+JZUPcklxbU5ebD2ykwTDDh9IhZ4DD7T7g33L9Shihwu2F5V8MLHH1cRwFCFtwSeG72c8Qqa64+jQPp5jh5eqVFvjRYf3TONdDBX7LQXjA3grojzOYKkps7qwYf84rzNXia+nO5TJUvxRPKPT7naC96n+7m69IAab5dWwuBmuN/+NjyWE/dP+7AsAAP//
// DO NOT EDIT
package com.github.yeast.paypal.sdk.orders;

import com.paypal.http.annotations.Model;
import com.paypal.http.annotations.SerializedName;
/**
 * The details of the authorized payment status.
 */
@Model
public class AuthorizationStatusDetails {

    // Required default constructor
    public AuthorizationStatusDetails() {}

	/**
	* The reason why the authorized status is `PENDING`.
	*/
	@SerializedName("reason")
	private String reason;

	public String reason() { return reason; }

	public AuthorizationStatusDetails reason(String reason) {
	    this.reason = reason;
	    return this;
	}
}
