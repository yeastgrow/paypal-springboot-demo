// This class was generated on Thu, 16 May 2019 09:53:44 PDT by version 0.1.0-dev+8fcb5f of Braintree SDK Generator
// LinkSchema.java
// @version 0.1.0-dev+8fcb5f
// @type object
// @data H4sIAAAAAAAC/7yVz0/bShDH7++vGPnyQAoJenqPQ248lUpRm4KA9oJQNLHH8bbrWbM7Bqyq/3u1mwSzGCNUTI6e7+z6M7Pz42dy2VSUTJPPin/ARVpQicko+YZW4VLTFyy9mIyST9S0Hx/IpVZVogwn0+SyILB0U5MTyFAQjAXtrxO0K5JxMkqOrcVm/afDUXJOmJ2ybpJpjtqRN9zUylL2YDizpiIrilwyvXpgNMvvlEoXD7NMeRbUCyVUugi3FWcbLaY/5gZaHwgXvBWZa61/jR64UeuFyQPbM/BBjJG1Ps2fAQX0TGBycPXywIXHcmPw+Q95L2sncItaZSgEuELFTgC1jvzj2I7eGhs3L8QWxDg2bgaMzTD5aiuNpXeMsa/uMsoVh8KJSy62x5EOW1n9ZBVxRpz6QzFaJLwnmxOreNVlyy2uSmJZWHJG1+HfjxG3+vljuTtxtm7QXjPeTXK7M0b1TJYwTQam8pO1y+StMdPW0t9owWPgVplTpp5ZIOXG3OJtLd2HDQpIUxEgZ5AaFrqXA+LUZIpXEHqchtsqfXW6VIy2WWz/G9GvtZNW6oYRuLnLDRdEcDWvtaiqtpVxBDMWskwCc1QaTu6F2PnhAXvz2fxkH87QCpwyTeGjsSWKf7z2DDmHK4L/TabIXe8VIpWbTiZijHZjRZKPjV1NCin1xObpP4f//rc/3k2n+zeM0rYxvPTmf5yfyzszhVB+4LFelYmjYTJx/YqhwUaiVKy/33U3MPVv5rUYERmmgTdz6z/wlOkruAqlWDhBG+famy821ie1ZwCrSjcghXLrDkUQA1IQ+DCQU3J/w9fzmRtBuDhI/hvulBTrc7eoa9rR8qlQfDMsqvbok1C9fPZY7bbbxgvaS3ZF30PdjztMf/71GwAA//8=
// DO NOT EDIT
package com.github.yeast.paypal.sdk.orders;

import com.paypal.http.annotations.Model;
import com.paypal.http.annotations.SerializedName;
/**
 * The request data or link target.
 */
@Model
public class LinkSchema {

    // Required default constructor
    public LinkSchema() {}

	/**
	* Any additional items.
	*/
	@SerializedName("additionalItems")
	private Object additionalItems;

	public Object additionalItems() { return additionalItems; }

	public LinkSchema additionalItems(Object additionalItems) {
	    this.additionalItems = additionalItems;
	    return this;
	}
//
//	/**
//	* An array of sub-schemas. The data must validate against all sub-schemas.
//	*/
//	@SerializedName(value = "allOf", listClass = AllOfItem.class)
//	private List<AllOfItem> allOf;
//
//	public List<AllOfItem> allOf() { return allOf; }
//
//	public LinkSchema allOf(List<AllOfItem> allOf) {
//	    this.allOf = allOf;
//	    return this;
//	}
//
//	/**
//	* An array of sub-schemas. The data must validate against one or more sub-schemas.
//	*/
//	@SerializedName(value = "anyOf", listClass = AnyOfItem.class)
//	private List<AnyOfItem> anyOf;
//
//	public List<AnyOfItem> anyOf() { return anyOf; }
//
//	public LinkSchema anyOf(List<AnyOfItem> anyOf) {
//	    this.anyOf = anyOf;
//	    return this;
//	}

	/**
	*/
	@SerializedName("definitions")
	private Object definitions;

	public Object definitions() { return definitions; }

	public LinkSchema definitions(Object definitions) {
	    this.definitions = definitions;
	    return this;
	}

	/**
	*/
	@SerializedName("dependencies")
	private Object dependencies;

	public Object dependencies() { return dependencies; }

	public LinkSchema dependencies(Object dependencies) {
	    this.dependencies = dependencies;
	    return this;
	}

	/**
	* The fragment resolution.
	*/
	@SerializedName("fragmentResolution")
	private String fragmentResolution;

	public String fragmentResolution() { return fragmentResolution; }

	public LinkSchema fragmentResolution(String fragmentResolution) {
	    this.fragmentResolution = fragmentResolution;
	    return this;
	}

	/**
	* An item.
	*/
	@SerializedName("items")
	private Object items;

	public Object items() { return items; }

	public LinkSchema items(Object items) {
	    this.items = items;
	    return this;
	}

	/**
	* The media type and context-encoding scheme.
	*/
	@SerializedName("media")
	private Media media;

	public Media media() { return media; }

	public LinkSchema media(Media media) {
	    this.media = media;
	    return this;
	}

	/**
	*/
	@SerializedName("not")
	private Object not;

	public Object not() { return not; }

	public LinkSchema not(Object not) {
	    this.not = not;
	    return this;
	}

	/**
	* To apply this schema to the instances' URIs, start the URIs with this value.
	*/
	@SerializedName("pathStart")
	private String pathStart;

	public String pathStart() { return pathStart; }

	public LinkSchema pathStart(String pathStart) {
	    this.pathStart = pathStart;
	    return this;
	}

	/**
	* The pattern properties.
	*/
	@SerializedName("patternProperties")
	private Object patternProperties;

	public Object patternProperties() { return patternProperties; }

	public LinkSchema patternProperties(Object patternProperties) {
	    this.patternProperties = patternProperties;
	    return this;
	}

	/**
	*/
	@SerializedName("properties")
	private Object properties;

	public Object properties() { return properties; }

	public LinkSchema properties(Object properties) {
	    this.properties = properties;
	    return this;
	}
}
