// This class was generated on Thu, 16 May 2019 09:53:44 PDT by version 0.1.0-dev+8fcb5f of Braintree SDK Generator
// LinkDescription.java
// @version 0.1.0-dev+8fcb5f
// @type object
// @data H4sIAAAAAAAC/+xX32/bNhB+319xUAcsBvwjKNqs81u2pmiwZgkcdy9BYZ+lk8WFIlXy1MQY9r8PpOQosqImaxUDA/TgB96R1vfdHY/3/R3MNxkF0+CDUNfwlmxoRMZCq2AY/IlG4ErSH5i6HcEw+J021eL+5mkwTwgMfc7J8siQRKYIrt4fz0/Ojy9BCnX96WAS6dBOMBMTQzEZUiG51ciQzbSyZCcvEmTSaEfugB2AULE2KbpPjINhcGwMbgq8h8NgRhidK7kJpjFKS87wOReGojvDhdEZGRZkg+nVHVPLRqh1kx+pcMFuy32epMJ5YWvSTSkSCO4ICAU3iQgTYA02X6WCgauAQISM30tA5VL+M3yURWIorjEoDU34oU4zSUzAaNbE8HH2YQxzDSleU4m+SGOIUg7d9pVQhSclTnQEN4IT4ERYuPo4O4U5pZk7MSqSxhR9OkiYMzudTFhraceCOB5rs54knMqJicOj1z8fDnx5jOGdNpAZGmVGh2StUOshCBXKPCo+uvxxOYTlwXIIqCJYDpYQJmgwZDJ2DI7R0nFdgrB+/zVtYFuAjqtWpFxakP0HLeBdCAqOBR90CbQucYq9+T8ljk3+bXnzxdSsP29+QgUOAS1EFAtFEaw2cDV79xu8PHx1VKXg5uamSoCJQ/dzO8Z8y4NxefdXVATPRagsjD0VblFTO+RLU5P5+/n8YluGpvy6u3wPFu+eGBiSNfjFuon9ygfXAxRa+fQ9elFe//LmzQtLoTsxejUYlu3GkvlC1uUeFZy+hVgbwDJ5rtBzhelKrHOdW7mBqJZiSykqFqEFHd/lfAyXRHDlX4NZidDu1BAq9NjQWrFWKSm2E3d2tKW0uxzfOhqDbi+Sh3gZJpRiMxV2a6+ycWdqfbd8mwZtuiz+6tnRq78o5CZUjCLhsKBcCKbU1kBXztPSV0d/rDZQ7QH/Bx1XO0q50LHH9gB476xDlvI8fgAooMPkas3mq1GRjbJv+7inuWX4glJEyAS4RqEsg2vL9/fXuR19Lze1+Qo376xzU5sOuWlFrtpSbegZObbVnX8sfOHUS65urzPttrLakWWkIlKhO1SHVnM8J7a2Hh8bXLuOtzBktczLSbmCuPXP7rubHWe7Daq/Ge8nuM0eI1o6i+8mHaNynbWJyY9jNUxbS/tF8zs6vipnbpxqGc2aU9ljmsBNqaFWTLc8IhXqSKg1+DtOzy9mVkKh2Sy2362hL3wnleshbaCYVBN3MR2c5ZJFlptMW4JTxWQUMZyhkHByy6Ssax5wcHZ6djKACzQM54qmbsBPkV3yqjNkLa4JftWRIPvoFPTy8NXrwZ6mucYozo9P4d8cn/mNnoIvP3CwnhSJo24i8ekJTUNproWiWD/r26Co/WUunDVEWlHHL3O1v+Mu01ZwGXKysIymHmtnviytO7WnAbNMbgoJXmB1GsjN8o4GqpDsT/BxdmqH4P/Yu9z6nnT/gjKnPT0+GbK7DIusOrpD1bkv7nub163cBdWf7At9C+p2uF3fz69qnkKwXDaVz46j1z+9/un1T69/ev3T659e//T6p9c/vf7p9U+vf/4H+qe1VwmWO82qtDTDV4gb5+6offzwLwAAAP//
// DO NOT EDIT
package com.github.yeast.paypal.sdk.orders;

import com.paypal.http.annotations.Model;
import com.paypal.http.annotations.SerializedName;
/**
 * The request-related [HATEOAS link](/docs/api/reference/api-responses/#hateoas-links) information.
 */
@Model
public class LinkDescription {

    // Required default constructor
    public LinkDescription() {}

	/**
	* The media type in which to submit the request data.
	*/
	@SerializedName("encType")
	private String encType;

	public String encType() { return encType; }

	public LinkDescription encType(String encType) {
	    this.encType = encType;
	    return this;
	}

	/**
	* REQUIRED
	* The complete target URL. To make the related call, combine the method with this [URI Template-formatted](https://tools.ietf.org/html/rfc6570) link. For pre-processing, include the `$`, `(`, and `)` characters. The `href` is the key HATEOAS component that links a completed call with a subsequent call.
	*/
	@SerializedName("href")
	private String href;

	public String href() { return href; }

	public LinkDescription href(String href) {
	    this.href = href;
	    return this;
	}

	/**
	* The media type, as defined by [RFC 2046](https://www.ietf.org/rfc/rfc2046.txt). Describes the link target.
	*/
	@SerializedName("mediaType")
	private String mediaType;

	public String mediaType() { return mediaType; }

	public LinkDescription mediaType(String mediaType) {
	    this.mediaType = mediaType;
	    return this;
	}

	/**
	* The HTTP method required to make the related call.
	*/
	@SerializedName("method")
	private String method;

	public String method() { return method; }

	public LinkDescription method(String method) {
	    this.method = method;
	    return this;
	}

	/**
	* REQUIRED
	* The [link relation type](https://tools.ietf.org/html/rfc5988#section-4), which serves as an ID for a link that unambiguously describes the semantics of the link. See [Link Relations](https://www.iana.org/assignments/link-relations/link-relations.xhtml).
	*/
	@SerializedName("rel")
	private String rel;

	public String rel() { return rel; }

	public LinkDescription rel(String rel) {
	    this.rel = rel;
	    return this;
	}

	/**
	* The request data or link target.
	*/
	@SerializedName("schema")
	private LinkSchema schema;

	public LinkSchema schema() { return schema; }

	public LinkDescription schema(LinkSchema schema) {
	    this.schema = schema;
	    return this;
	}

	/**
	* The request data or link target.
	*/
	@SerializedName("targetSchema")
	private LinkSchema targetSchema;

	public LinkSchema targetSchema() { return targetSchema; }

	public LinkDescription targetSchema(LinkSchema targetSchema) {
	    this.targetSchema = targetSchema;
	    return this;
	}

	/**
	* The link title.
	*/
	@SerializedName("title")
	private String title;

	public String title() { return title; }

	public LinkDescription title(String title) {
	    this.title = title;
	    return this;
	}
}
