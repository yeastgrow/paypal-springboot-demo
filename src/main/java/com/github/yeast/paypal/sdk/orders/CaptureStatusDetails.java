// This class was generated on Thu, 16 May 2019 09:53:44 PDT by version 0.1.0-dev+8fcb5f of Braintree SDK Generator
// CaptureStatusDetails.java
// @version 0.1.0-dev+8fcb5f
// @type object
// @data H4sIAAAAAAAC/6SPQUvDQBBG7/6KYc5BPOcmJEgRYpHiRaQZm6kZ2O6uMxNkkf53kYSAFHrx+uYxvO8bdyUz1nig7JPy3px8sv3AThIMK3whFXoP3NHpqvfIZVGwwobtoJJdUsQadyPDIkI6go8My5sBMpUTR4f53y1WeK9KZa66q/CZaXiKoWB9pGD8Cz4nUR5WsNWUWV3YsH5d95irxI/LfmWyFP/0ruiyej7B11iuVYMY9Nu2azbdQw9JoW/abtM2/X/nxCmE89v55gcAAP//
// DO NOT EDIT
package com.github.yeast.paypal.sdk.orders;

import com.paypal.http.annotations.Model;
import com.paypal.http.annotations.SerializedName;
/**
 * The details of the captured payment status.
 */
@Model
public class CaptureStatusDetails {

    // Required default constructor
    public CaptureStatusDetails() {}

	/**
	* The reason why the captured payment status is `PENDING` or `DENIED`.
	*/
	@SerializedName("reason")
	private String reason;

	public String reason() { return reason; }

	public CaptureStatusDetails reason(String reason) {
	    this.reason = reason;
	    return this;
	}
}
