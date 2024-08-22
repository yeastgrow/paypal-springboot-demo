// This class was generated on Thu, 16 May 2019 09:53:44 PDT by version 0.1.0-dev+8fcb5f of Braintree SDK Generator
// PhoneWithType.java
// @version 0.1.0-dev+8fcb5f
// @type object
// @data H4sIAAAAAAAC/9xVQYucTBC9f7+i6NMMuOO3kOTgLbh7CkyWzZDLMgyt1mhBW226SyYS9r+HVmOYcSQJCUvITeu9qnr9qmy/qF3XoEpUU1nGw4mkOkiIROqjdqQzg1tdXye8w27EVKTu0OeOGiHLKlG7CqFPAOKjdbUO8Y2K1FvndDe0/D9Sj6iL92w6lRy18RgCn1pyWEyBB2cbdELoVfI0iX0IpZckcltn6M70XQBLWgdCBMRA4iHXbJlybYBY0HF/CG3g6X5z++bVyCYuoTGaYTjmflWJND6J49PptCFpN8QSO8zj3c3jfXrTp8bI618yQ1y76IWXoGFuRm5bFtcdcm0McXnIbXE+tIkwAHNTRgKMFSAQYZWm6xdyCAYRdUaMBRjkUiqwR5AKIU1Bc9E/Tl2HdlC3XoCtQIZQOtSCDqTSDLevoaCSxA+VL/Nyy568+NBCf0cL9ELD2+jA9i5d9919mwXPQvJYY/Vhu/7dNefWmOfoh/PFz4LsyfK1hb8Czuc7kUb1LyT8m7PXdM+xueyLuf0Fy7j4ofwbOzq/ffpJ739i1sPFO/tfnIWXbuMA/5GV3D//9xUAAP//
// DO NOT EDIT
package com.github.yeast.paypal.sdk.orders;

import com.paypal.http.annotations.Model;
import com.paypal.http.annotations.SerializedName;
/**
 * The phone information.
 */
@Model
public class PhoneWithType {

    // Required default constructor
    public PhoneWithType() {}

	/**
	* REQUIRED
	* The phone number, in its canonical international [E.164 numbering plan format](https://www.itu.int/rec/T-REC-E.164/en).
	*/
	@SerializedName("phone_number")
	private Phone phoneNumber;

	public Phone phoneNumber() { return phoneNumber; }

	public PhoneWithType phoneNumber(Phone phoneNumber) {
	    this.phoneNumber = phoneNumber;
	    return this;
	}

	/**
	* The phone type.
	*/
	@SerializedName("phone_type")
	private String phoneType;

	public String phoneType() { return phoneType; }

	public PhoneWithType phoneType(String phoneType) {
	    this.phoneType = phoneType;
	    return this;
	}
}
