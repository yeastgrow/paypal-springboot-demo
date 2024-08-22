// This class was generated on Wed, 22 Aug 2018 20:48:41 PDT by version 0.1.0-dev+904328-dirty of Braintree SDK Generator
// MerchantPayableBreakdown.java
// @version 0.1.0-dev+904328-dirty
// @type object
// @data H4sIAAAAAAAC/+yZ32/bOBLH3++vGPipBdy4TZsekKdLf+Fyh02DbnaBRbdwx+TIIkKR6nBkV7vY/31BUbItW9lNi6DApnoyzCFFzpczH43I3ydXdUmT08kPxCpHJ3CJNS4swQsmvNZ+7SbTyc/IJjZeYBH7TqaT/1O9/fOKgmJTivFucjq5ygkW3WDwGUhOwJRVTh9NppMzZqzTpI+nk3eE+q2z9eQ0QxsoNnyqDJPeNFyyL4nFUJicvt8u1zuqD1e2ZB/CHAtfOemtcs9wuGJVMZNTNaDTkPpB5hkQMuPQKYMWhNEFVHHUFEKlcsAACAu06BSBZyixLsgJ6IruztcgbNzy0NluyXPlNfW83bccuvteciZ6pHJkVEIM5z++ffTs+Mm/t0LEsR8ezLRXYWac0JIxPmCmDZOSGVOQWdf5UewcZg9BchQwmpyYzFBo9r7r9EWKCFd7grjK2j+mf6vKCm3VV6NrOVShsUxhnRuVQ2GWucCCTn+tHj9+qirb/FL6Z036d+ag0YK4iY7WteipNdcEH/93+cvHJAIygfMCUpdGobU1ZJxiB+1Reuise+reHKBJmQLtZsTwXFcXr3bmCtVCm5XRpOMKPUjuq4BOSx6Gp5t1Hr7x3OZoEh9cVSyIY+p2CyktKgptQvQiZAqBCN6/7NpexkD40rC5i8j4sBMbN9DBkQyxodc8kmEkw0iGe0uGCxI4Szm8KXDgXKj4K1rMFzu10BA3eh36wXTmAOP6o2bbqqgJr6Ra1NeRtGQ5gnckFTvSsM7J9bKkX0uBCaBNlhFHrGTsi8HOl1hfogVUqnF6nRNTYyi6gi/3VjfpaBjig8Oe5s/vvEpT3q2IhfQQjQeMI5NHJo9MvrdMfv05gmhJ8A6FDkOEWvOck3kbKvuWw5DpekDskdTXJMSFcW24t/AQDy14Ekq924GMeEDnJSf+uuz4Kl4EX7GieTdhz/FD2z+QGQOq3BIagrwkGZbm0PZdSfMlPE1S7bxL2wrk9afKrNBSSouYCZUz0hUUKfa2fsEbzwWKkI7v1w63njc0ahYAayN58yzx8OQEtFkaCdCQj4AbmLcTbCjmjZM7ke0Wn4ZlOvUaKkgOTGM5MpYjYzlyz8qR2zGiRDvPiPb5sG0e2TCyYWTDvf1UubQomecC3tDAl0rZWiMLQp8Re5abz4i6ninpWVwMCKIwBeWLwoRgvAvTaF2wvybGJTX2zVnS4E3b3Z/hDBRKY4E0QnCE4Hdwu9adHL/AQINl0mGFdENxpEnQ2C28NofS69wDkyKzasO8OZlu8JFVNjPWpmbPmvgIrnbHmgBog4dr59cuQiR2bNbwDahhDTmZG90nxk7roQhltbBGbfM6BT+WJSgmjB/Wi7qnziw5A+dO2OtKkY4f0qEqS88CVSBQGCjAg/gcOloewQtG466YCHaCJn2TpwuCh+3NQPNkoAKNnaPWTCFE8nYzz01z7xAzD1dobPT8G51s9NbUPwbcsxwqHJ1mhwkP5jfSyUNox7QZvLBeXX+qvNBuIgdh75ap5cJLB7DZbjv8VMYdeP4MNsgPDTbQWr+OG0iZj3+dhuOTk5t6YRbfFXGn0xwxf9ME/2kn3bZAMEt3BP/1a1oRT5tRS3LEDQxRKSpj5BT42RRVAZbcUvIUWK7vfdzQ45Pdpad8KlGiarAi7t42EYYOKteIpG+7SqDPJsiGk/syf5vw2YngXvD02w9Dp70/i3nBcP6qe51FxkCB4Zp0FChWZTfcuLW4jyHo4usjbkFM0Sb5JDesmzrPUCv7/rgATM0MC1sDOcV1s7FNIQUl+5INCXINq+iwa47RIpifHsexVUhwIBc3pX0Rhcre1cHaLT6bxQvaeSpLh6/8buox1pFjHTnWkffuoO1ffwIAAP//
// DO NOT EDIT
package com.github.yeast.paypal.sdk.payments;

import com.paypal.http.annotations.Model;
import com.paypal.http.annotations.SerializedName;

import java.util.List;
/**
 * The breakdown of the refund.
 */
@Model
public class MerchantPayableBreakdown {

    // Required default constructor
    public MerchantPayableBreakdown() {}

	/**
	* The currency and amount for a financial transaction, such as a balance or payment due.
	*/
	@SerializedName("gross_amount")
	private Money grossAmount;

	public Money grossAmount() { return grossAmount; }

	public MerchantPayableBreakdown grossAmount(Money grossAmount) {
	    this.grossAmount = grossAmount;
	    return this;
	}

	/**
	* The currency and amount for a financial transaction, such as a balance or payment due.
	*/
	@SerializedName("net_amount")
	private Money netAmount;

	public Money netAmount() { return netAmount; }

	public MerchantPayableBreakdown netAmount(Money netAmount) {
	    this.netAmount = netAmount;
	    return this;
	}

	/**
	* An array of breakdown values for the net amount. Returned when the currency of the refund is different from the currency of the PayPal account where the merchant holds their funds.
	*/
	@SerializedName(value = "net_amount_breakdown", listClass = NetAmountBreakdownItem.class)
	private List<NetAmountBreakdownItem> netAmountBreakdown;

	public List<NetAmountBreakdownItem> netAmountBreakdown() { return netAmountBreakdown; }

	public MerchantPayableBreakdown netAmountBreakdown(List<NetAmountBreakdownItem> netAmountBreakdown) {
	    this.netAmountBreakdown = netAmountBreakdown;
	    return this;
	}

	/**
	* The currency and amount for a financial transaction, such as a balance or payment due.
	*/
	@SerializedName("paypal_fee")
	private Money paypalFee;

	public Money paypalFee() { return paypalFee; }

	public MerchantPayableBreakdown paypalFee(Money paypalFee) {
	    this.paypalFee = paypalFee;
	    return this;
	}

	/**
	* An array of platform or partner fees, commissions, or brokerage fees for the refund.
	*/
	@SerializedName(value = "platform_fees", listClass = PlatformFee.class)
	private List<PlatformFee> platformFees;

	public List<PlatformFee> platformFees() { return platformFees; }

	public MerchantPayableBreakdown platformFees(List<PlatformFee> platformFees) {
	    this.platformFees = platformFees;
	    return this;
	}

	/**
	* The currency and amount for a financial transaction, such as a balance or payment due.
	*/
	@SerializedName("total_refunded_amount")
	private Money totalRefundedAmount;

	public Money totalRefundedAmount() { return totalRefundedAmount; }

	public MerchantPayableBreakdown totalRefundedAmount(Money totalRefundedAmount) {
	    this.totalRefundedAmount = totalRefundedAmount;
	    return this;
	}
}
