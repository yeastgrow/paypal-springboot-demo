// This class was generated on Wed, 22 Aug 2018 20:48:41 PDT by version 0.1.0-dev+904328-dirty of Braintree SDK Generator
// CaptureRequest.java
// @version 0.1.0-dev+904328-dirty
// @type object
// @data H4sIAAAAAAAC/+xY348TNxB+718xyktByl3o8aPSPfWAol4r4ATXShVFuYk9m7XOay9jO8e26v9ejb2bZJNUBXHl6cQDxPZ4PN98880sf00uu5Ymp5Nn2MbEBG/oQ6IQJ9PJb8gGF5ZeYSMHJtPJL9RtfjynoNi00Xi3MQ9AJtbEgNB6lj3wDLEmqJK1gCnWns2fpAEbn1wEXwG67fUWu4ZcPJ5MJ2fM2JXnPZhO3hDq1852k9MKbSBZ+JAMk14vXLBviaOhMDl9tw7spXfU7YdT/I+CWi+NQ7usCVRiJqc6QLd+euUlzMo4dMqghcjoAiqxmkJIqgYMgLBAi06R4NDHBjrR7cUXIhu33A9wePJceU2jOHd39sN9F2smOlI1MqpIDOdvXx89Ovnu+w0QYvv+3kx7FWbGRVoyygUzbZhUnDGFOBsOH8nhMLsPscYIRpOLpjIUMjGGQ5+FSOS0A4hL1v49/U9UVmjTGI1hZR+FvDOFm9qoGhqzrCMs6PSP9ODBQ5Vs/pvKL2vKrzMHGQvizI4+NInUmmuCq58vfr8qICATOB8hdq1RaG0HFRfuoD0ul86GW3d8gCZlGrRri8O+Ll893/IV0kKbldGk5YUeYu1TQKdjHQ67mw0RvugLmHvwwaVmQSyVOzyktago9AUxYsgUAhG8ezasPRMifC5tboMZ77e4sfDeErp9ckgt27kqUjYiye7OmCznThuFkQLc1JTlr/MJFDpo8JoAtTYls6AGmcQlGhdiRvaA+sFbihA9XEk4V2CqfKP2mTOCm9Oy3V+37aG/4bCHjPXm8gze+vYvvfYLFe0TC9i4lTeK5kaPEjRa3i/ls4tzkDIjPmrZlzqgj5FYYuttB2JXmfAmgGdNfAxnbUvIAYyDhY91jrzFjvjbsK35UJsQPZcWIWeoQWNDKcG1DTApMisKtwzXRd9azl2InPKD9rHrkzg3o0MbEA/vj9E8c90BXsCWSRGCC+wuRKPyPzk6EokK0TfE4Rh+dPKsABVhqYcqt8d8LmQEG+RrikVZNu1Uk8WONGgTFokDZd9yXHlrqeRBRgqRpFh5bqAiyim0oow6CalKYkEx4UY+C+X1huieh+NDOcjFe6Ua/v9Ovh3svNnt5od29wugSk6HTTuoyWrwDhZUo60kMmFoQ6xq/PLha5ebQy5eEB0gZb87r4jCmI47O7tEBJQ3yuNXyMYnoZOQRfmmMSEIFacQTRumOZne5XTvJuzJ3Wh5N1rejZZ3o+VtjJYvewWFpxjoYAMm2m25dJgimmKeH6oepEGc4ab26ymi/7QWbRf5qJKtjLVluR9fLrdtTQC0wcO18zdORGQYTL6GaliTh4vx4La9ug9CmxbWqE1dF/Jj25buTRoW3QidWQkGzl1kr5OiPNCG1LaeI6RAoDBQgHtyDx0vj+Epo3GXTARbpIEbE+t+hrkvUz33MJWpbo5aM4U8JAye50YLvFJ5uEJjJfKvNBOP3jRCd3dnH2EJmktnRJsHm2wDvU1fwQvr1fWH5CNtF3KI7N2yrLzycRCw2fY6/NpKBp48grXkhywbaK2/kQRS5eWn03Dy+PG/ncJKeoVkuviQ+i0OfuidblYgmKU7hp/8Da2Ip9lqSY44iyEqRa0wp8GPpkkNWHLLWBdiuXH0ktCTx9tPL/XUYhTUYEU8dBsRQwfJZZD0p74S6KMJca2TuzB/HfpsMXhEnvH6PnX6Eb9815w/H9qZaAw0GK5JC0Chn8njxgKVymNOL/flw5N0ToGUaC6+WBvW+ZvAUA/7rl0ApuxhYTsgp7jLic2DFLTsWzYUkbs8H2L530YR5ocnYptCEQdykpS+EYVkb2f8fd//+eYfAAAA//8=
// DO NOT EDIT
package com.github.yeast.paypal.sdk.payments;

import com.paypal.http.annotations.Model;
import com.paypal.http.annotations.SerializedName;
/**
 * Captures either a portion or the full authorized amount of an authorized payment.
 */
@Model
public class CaptureRequest {

    // Required default constructor
    public CaptureRequest() {}

	/**
	* The currency and amount for a financial transaction, such as a balance or payment due.
	*/
	@SerializedName("amount")
	private Money amount;

	public Money amount() { return amount; }

	public CaptureRequest amount(Money amount) {
	    this.amount = amount;
	    return this;
	}

	/**
	* Indicates whether you can make additional captures against the authorized payment. Set to `true` if you do not intend to capture additional payments against the authorization. Set to `false` if you intend to capture additional payments against the authorization.
	*/
	@SerializedName("final_capture")
	private Boolean finalCapture;

	public Boolean finalCapture() { return finalCapture; }

	public CaptureRequest finalCapture(Boolean finalCapture) {
	    this.finalCapture = finalCapture;
	    return this;
	}

	/**
	* The API caller-provided external invoice number for this order. Appears in both the payer's transaction history and the emails that the payer receives.
	*/
	@SerializedName("invoice_id")
	private String invoiceId;

	public String invoiceId() { return invoiceId; }

	public CaptureRequest invoiceId(String invoiceId) {
	    this.invoiceId = invoiceId;
	    return this;
	}

	/**
	* Any additional payment instructions for PayPal for Partner customers. Enables features for partners and marketplaces, such as delayed disbursement and collection of a platform fee. Applies during order creation for captured payments or during capture of authorized payments.
	*/
	@SerializedName("payment_instruction")
	private PaymentInstruction paymentInstruction;

	public PaymentInstruction paymentInstruction() { return paymentInstruction; }

	public CaptureRequest paymentInstruction(PaymentInstruction paymentInstruction) {
	    this.paymentInstruction = paymentInstruction;
	    return this;
	}
}
