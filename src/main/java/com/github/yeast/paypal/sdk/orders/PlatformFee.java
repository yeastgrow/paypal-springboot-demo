// This class was generated on Thu, 16 May 2019 09:53:44 PDT by version 0.1.0-dev+8fcb5f of Braintree SDK Generator
// PlatformFee.java
// @version 0.1.0-dev+8fcb5f
// @type object
// @data H4sIAAAAAAAC/7xW3W4cNw+9/56CmKuvwNqbOkkL+KpJjKJuUcdo3QJFathcibNDWCNNSGk30yLvXkgzsz/eDZogQa8WS4kieXh4OH9XN31H1XnVOYx1kPauJqpm1e8ojAtHV9geOf2J+vGgmlUXpEa4ixx8dV7dNATTbQgCHUr0JFATzcCEtmVVDn6WzxYSHkhwSfkUYoMRWAFVg2GMZGHNsYHYEERBr2hyjFO4ChEQlDoUjJQfYg2uOOzcA0dLqCW05QF6F0k8OuhItCMTeUWnsJdszoEVHLecn2IPakJHgN6WtNwa++PZBeEll8exb8lHqIOUgy6JaVAJkud4Ws2qFyLYD4g/mVW/ENrX3vXVeY1OKRveJhayG8O1hI4kMml1/mbTq5+Dp/6wSdiG5ONeezamwyaZJELe9KW+4V7JG6Fmj94wul04Z6DJNIAKCAt06A0N7R0qtok+qb4o6YPlaRT2y8P6pozvTLD7LHx8cljtm9gI0YlpUNBEErj89fXJs7Ovv93ikH1v/z+3weicfaSlYH5gblnIxLmQxvl0+SRf1vlXI2kt+cg1k5auT5c+ExCfnHs/+1dUVujSPhqT5RCFcjKDdcOmgZaXTYQFnf+Znjx5apIrvzT8czz8e+GhYJEnOMhUWq7U8QPB/Y/Xf9wPIKAQ+BAh9h0bdK6HWgbqoDsdHp1Prz6KAZYMt+g2Hsdj3Vxd7MTStLC8YltGNQaITUiK3sZGj4ebTxV+P06njOCDT+2CBEK9SaRzaEjHedhjyAyUCN68mmyvMhE+lTZfghm3O9zosCe6W6Aek+7dsy1JivkoSSxFZKcbEWspi5iPsG4CCBni1Uj0OnmrRT/q5Gp2Tkc5tCSDuG58i4BqgAcf1j6rSJHHnMOXk8UP6oZj8vGO7b5m7FiPrLC0cGzg8mKr5TnZk6x5U1EnRqgsAuy6U7j0UYJNJm+hAJq6LkiEpAQGlXSrny8F2d9I3jZbugzL5Br7a3R5QEnGiHBPLbK7Q2uFVO9zAvdTBnds7zO0ee5whexy1Z8L6EfqTklrD9G9RI+imgsWj4Mo8F9kofjA6DPO7cIF8/A2hUi746tRgl8OlqsQJ9ma79rhty6D/80z2Ai9FrFA58KaLCyoDjKs9LPnzz90C+u8IXLThxh5aocA341BtxZQXvpT+CGsaUUyK15L8iRFAtEY6jJFWnzHbWrBkV/GZhAWv199buTZ893Uxw8UjBk1WJFMOyZLoIfkC0j2Y7MEescaN+r4GOb/hjY71N0jz779kDrDaJSZELi8mJZY1hVoUR/IZoDyp2XW8bj1QGPKt80o8pmCPi+N3II8neNXHIst36pMI+yP/RSESoSF64G8kb40tnw9QSehE6aI0sMqF+xjTuMlKj09y75JB10gn5syrh9NLn6Rab19f/v+f/8AAAD//w==
// DO NOT EDIT
package com.github.yeast.paypal.sdk.orders;

import com.paypal.http.annotations.Model;
import com.paypal.http.annotations.SerializedName;
/**
 * The platform or partner fee, commission, or brokerage fee that is associated with the transaction. Not a separate or isolated transaction leg from the external perspective. The platform fee is limited in scope and is always associated with the original payment for the purchase unit.
 */
@Model
public class PlatformFee {

    // Required default constructor
    public PlatformFee() {}

	/**
	* REQUIRED
	* The currency and amount for a financial transaction, such as a balance or payment due.
	*/
	@SerializedName("amount")
	private Money amount;

	public Money amount() { return amount; }

	public PlatformFee amount(Money amount) {
	    this.amount = amount;
	    return this;
	}

	/**
	* The details for the merchant who receives the funds and fulfills the order. The merchant is also known as the payee.
	*/
	@SerializedName("payee")
	private PayeeBase payeeBase;

	public PayeeBase payeeBase() { return payeeBase; }

	public PlatformFee payeeBase(PayeeBase payeeBase) {
	    this.payeeBase = payeeBase;
	    return this;
	}
}
