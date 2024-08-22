// This class was generated on Wed, 22 Aug 2018 20:48:41 PDT by version 0.1.0-dev+904328-dirty of Braintree SDK Generator
// RefundRequest.java
// @version 0.1.0-dev+904328-dirty
// @type object
// @data H4sIAAAAAAAC/8yVTW/zNgzH7/sUhC/bAKfuXoABuQVPMaAd1hZtMWDoipSW6FqbLLkUlc0Y+t0HWXFaNxnWojs8t4giTfLHv5i/i5uhp2JZXFETnYYreowUpCiLX5AN1pbOsUv3RVn8RMPz4YSCYtOL8W4XHQBBYS+RSUOPQ0dOSqgHOD05gh89A0ITrQUevUswTtmoCdABdb0McHZ9cQ6cS4Da62EK65HF4MHI3+Lx8XdKeU3jL8LORyfZWj2bwde/kxIwDqSlA5mKslgx45B5HJfFFaG+cHYolg3aQMnwGA2T3hku2ffEYigUy9sdyZ+9o2EfYK5rhnFnmsO8aQlUZCanBkCnIftBkwkah04lGMLoAqoUVUKIqgVME6jRolMEnqcZgI70rv6E47+2F4SNe9jvb6p4nZjP2nx9s9/trbRMtFAtMiohhtPri8X3337zwzOHFHv3VaW9CpVxQg+M6QOVNkxKKqYg1eS8SM6h+hqkRQGjyYlpDIVx8pPTB4G4aO1T+Z9UNmjjnMZk2acw3pTwZ2tUC515aAVqWmYlR5tlnE/W5NPKwciCeBTHtrXUqTV/ENyfXf56nyEgEzgvIENvFFo7QMNZOmiPto9l+uqrHKBJmQ7tLuJwrpvzkxe5Qqy12RhNOlXoQVofAzotbTicrpo6TA8+zYm38MHFriYG3+wK6S0qCtv3MFNICYEIbj9Ntk9JCO+Vzf+hjLs3aMO4jTeK1kbPBDIz76tkdXkKaYLEi559Rkx/CbFDC9vYiVkzsjQBPGviI1j1PSGHtARrL+3IuceB+MvwcptAa4J4zssn+VCHxoY83V0MMCkyGwofXZ1vfErOC63Fr8fkM2Kvb/ahMWHYCjdrK/2NfNY87p6++AcAAP//
// DO NOT EDIT
package com.github.yeast.paypal.sdk.payments;

import com.paypal.http.annotations.Model;
import com.paypal.http.annotations.SerializedName;
/**
 * Refunds a captured payment, by ID. For a full refund, include an empty JSON request body. For a partial refund, include an <code>amount</code> object in the JSON request body.
 */
@Model
public class RefundRequest {

    // Required default constructor
    public RefundRequest() {}

	/**
	* REQUIRED
	* The currency and amount for a financial transaction, such as a balance or payment due.
	*/
	@SerializedName("amount")
	private Money amount;

	public Money amount() { return amount; }

	public RefundRequest amount(Money amount) {
	    this.amount = amount;
	    return this;
	}

	/**
	* The API caller-provided external invoice number for this order. Appears in both the payer's transaction history and the emails that the payer receives.
	*/
	@SerializedName("invoice_id")
	private String invoiceId;

	public String invoiceId() { return invoiceId; }

	public RefundRequest invoiceId(String invoiceId) {
	    this.invoiceId = invoiceId;
	    return this;
	}

	/**
	* The reason for the refund. Appears in both the payer's transaction history and the emails that the payer receives.
	*/
	@SerializedName("note_to_payer")
	private String noteToPayer;

	public String noteToPayer() { return noteToPayer; }

	public RefundRequest noteToPayer(String noteToPayer) {
	    this.noteToPayer = noteToPayer;
	    return this;
	}
}
