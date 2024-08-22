// This class was generated on Wed, 22 Aug 2018 20:48:41 PDT by version 0.1.0-dev+904328-dirty of Braintree SDK Generator
// SellerProtection.java
// @version 0.1.0-dev+904328-dirty
// @type object
// @data H4sIAAAAAAAC/6SSQavUQAzH736KMCeFuvXkobcHXkTUog8vj4ekM+l2YHZmTNItg+x3l+lCd9cVRDz23zTJ75f+NI8lk+nMVwqBGHpOSlZ9iqYx35A9DoE+4aGWmMZ8oHJ5eEdi2ee1uDOPE0GgIwVII+StDaRxJCYHKOBo9JEcDAWeeiw9BrgbC2Ni+EhsJ4wqzy8n1Sxd2y7LsstYMoadTYd2lnahAXOW9pBzK2Rn9lpaWfu9vsx/tTONeWDGcgZ905gvhO5zDMV0IwahGvyYPZPbgp5TJlZPYrqnTZEo+7i/9+K85Fnpu0WlfeL61bWpP76+dfcQAeuKVZ1N0fmaC+iECsgENh1Xh9WNTgTKGAVXvt/w3v4rXpxDODV/ZRRFnW+5tuiW5X10vqIKLBPpRHcbgxeg4Pd+CLQSnW929c/878lWpufTi18AAAD//w==
// DO NOT EDIT
package com.github.yeast.paypal.sdk.payments;

import com.paypal.http.annotations.Model;
import com.paypal.http.annotations.SerializedName;

import java.util.List;
/**
 * The level of protection offered as defined by [PayPal Seller Protection for Merchants](https://www.paypal.com/us/webapps/mpp/security/seller-protection).
 */
@Model
public class SellerProtection {

    // Required default constructor
    public SellerProtection() {}

	/**
	* An array of conditions that are covered for the transaction.
	*/
	@SerializedName(value = "dispute_categories", listClass = String.class)
	private List<String> disputeCategories;

	public List<String> disputeCategories() { return disputeCategories; }

	public SellerProtection disputeCategories(List<String> disputeCategories) {
	    this.disputeCategories = disputeCategories;
	    return this;
	}

	/**
	* Indicates whether the transaction is eligible for seller protection.
	*/
	@SerializedName("status")
	private String status;

	public String status() { return status; }

	public SellerProtection status(String status) {
	    this.status = status;
	    return this;
	}
}
