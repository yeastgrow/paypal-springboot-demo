// This class was generated on Thu, 16 May 2019 09:53:44 PDT by version 0.1.0-dev+8fcb5f of Braintree SDK Generator
// NetAmountBreakdownItem.java
// @version 0.1.0-dev+8fcb5f
// @type object
// @data H4sIAAAAAAAC/+yWTW8bNxCG7/0Vgz21gGw5/UAB3YKkAdqiiZEaBQrXUEbkrEiEO1SGQ6uLIv+94H7IklZFasOXNj4JyxkOOQ9evpq/qqt2Q9WiYtIlNjGzLldC+N7GLS+9UlPNqt9QPK4CvcbmU6k/UztkVbPqJSUjfqM+crWorhwBk0K/9RzekmZhsrB1xKCOwGQRYtNCrLtvoTqzBZ/A+romIVaoJTYnky+xvcQAaEwpX4oKdYGGxDhkBReDTWXJC5TC6byaVc9FsO0ZXMyqt4T2DYe2WtQYEpWFD9kL2d3CpcQNiXpK1eJ6R++XyNROSZnItyRKduB1AOhEcAps1yWyHchBHQUQas/IxmMAFeSEpuyaQcrGASZAWGFANgRRYINtU+DZTI/Xc1LxvD7R9HDlpYmWDjs+ikzbvVYnRGfGoaBREvjx1zdn33797Ps7EGXvzZdzG02ae1ZaC5YCc+uFjM6Fks7H5LOSnOZfgTpU8JZYfe0pHQjoXkRU8hEQziF8nH2Syi2GfEhjXJlS6CIz2DpvHDR+7RRWtPgjX1x8Y3Lofqn/Cr7/es7QsSDp1DG0VjoN/j3Bu58uf3/XQ0Ah4Kig7cYbDKGFWnrtYDjvi87HqkdngCXjGwy7HafPunr9cu+slFfW33pLttwwgrqYE7JVl04fNx87fBVlcIEePnBuViTlvY8X2QQ0lIYHcaCQGSQiuH4xrr0oQrivbB5DGTd72qA/ixGtaSmoNJXIcfhOKseRqWTGDCgZPX1LStJ4HuQ+mIdGGIynt9LIeyajEZCjOpKHvY4H+UWKWQwtxwMPGp/G/oOecYLKvzQNRVmTnkYzjX1WaO7jpz2qvf/SYQL54UP2txiofxblJWT2Og4Uvfbu+oJXURpUJVv+X0e7jbJzo+4CsPXquloa4dl3YP3aa4LO+QikM/PhgJ2LRc/6KNj2zeYfRpINtuXr1EAyCT2NI0/jyNM48j8bR24+fvE3AAAA//8=
// DO NOT EDIT
package com.github.yeast.paypal.sdk.orders;

import com.paypal.http.annotations.Model;
import com.paypal.http.annotations.SerializedName;
/**
 * The net amount. Returned when the currency of the refund is different from the currency of the PayPal account where the merchant holds their funds.
 */
@Model
public class NetAmountBreakdownItem {

    // Required default constructor
    public NetAmountBreakdownItem() {}

	/**
	* The currency and amount for a financial transaction, such as a balance or payment due.
	*/
	@SerializedName("converted_amount")
	private Money convertedAmount;

	public Money convertedAmount() { return convertedAmount; }

	public NetAmountBreakdownItem convertedAmount(Money convertedAmount) {
	    this.convertedAmount = convertedAmount;
	    return this;
	}

	/**
	* The currency and amount for a financial transaction, such as a balance or payment due.
	*/
	@SerializedName("payable_amount")
	private Money payableAmount;

	public Money payableAmount() { return payableAmount; }

	public NetAmountBreakdownItem payableAmount(Money payableAmount) {
	    this.payableAmount = payableAmount;
	    return this;
	}
}
