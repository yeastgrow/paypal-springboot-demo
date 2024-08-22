// This class was generated on Thu, 16 May 2019 09:53:44 PDT by version 0.1.0-dev+8fcb5f of Braintree SDK Generator
// OrdersPatchRequest.java
// @version 0.1.0-dev+8fcb5f
// @type request
// @data H4sIAAAAAAAC/8xY32/bNhB+319x4EtfFCvthgLzUGBumqHZ1sRLvAJDE9g0eY7YSDyVPKbzgvzvAykpseVkTdDM21Mi/rj77rvj8aOvxKGsUAwFOY3OD2rJqhCZeINeOVOzISuG4vdaS0YP0kJaB58NF8AFwmzveH802X8zA3IwG43Hx0fv45dnycEPTsPu7rdq7vL0D/5BAZS0lhhCMnmnxaN341/3J/dbmRBU8iLtbaxksKQAVfAMtaNLoxEkzBwu0KFVODV61rdxsEh7qDK8sRYW5HrAyCLUwalCeoRgDWcwlsuxLEHjQoaSPTBtGqIFzJ7PMvhcGFUAWjkv0SfHTBB8hFlLLoYNuNphA+5UxNFTMYRTkXdup9Gtz39c9fDq1bPnz/IryezMPDDukNuh+UdUfH0qGqP5jdV7kgEp5ZH6iKezFHOtobGVYlNU1SUytgupRidjdfgWfChb7OmrNKtfinSLwVhGyy2y22GIf168rLT0xQ/gsC6l6vDm67bus7xO08M8ZCC1/ho3H84GKnimamr0I1xm4LCiS/xK1/r2jG7feS2XiAOspCm3R7YvTF0be779cDvPAysr3H7AA6m1Q7/Fuva04GlXYeS2z7isKGyjVXw4Gxh7SSY11P/kHFVoeWqsZxfUww/z0/sdaOPnwXlME1W396FI5iWpi0+BGFcheHbUHlg8JMb2ushXx+H1srtHM+gjfwAo4zd2HRyeTEaHk421HWt3g31KMutS8oJcNV0g+ierq7y7Z0UmfgvolmPpZIWMzovhh7NMvEWp0a2NXonJso4az7Mz9lxk4r10JmqRVvuNAhfkzF/pQheZ+AWX98ysy8JOiB3vn0xgND4AJcvSZ2CsKoNOUgHmKB06YLpAC8YCF8ZDkUCuaL7XadUMZOACLRuVHIJXBVY4gEmBcCnLkFLdLm5TPlIKvd+ZRPsNM40UfS29UV1ZlCZlRw89KofcrhuITIyck8uGnt1MHKPUR7ZciuFClh7jwKdgHGoxZBcwE2MXhQ8b9GJoQ1leZ18kd4+S5tlJy1a57U30qC0QKtRGAi9rHEAHJGnTW/HVUCjB4aeAnmFOetmnS9Z12RLaKD8Vy1J2LER1ig5h1ozO0p6PnuyT8HOWiZ/IVf0qHUsuHlejSYxPjV6j8E7aDt5E3R3LqhHwUWqnZ8ITxXPccN0YucE9bh9OPdhJXE/b9Kxh78+sBzKyICPUGMrPJ0eHrUpfEeQxrUuopWMjyzbCNOHQU3AKfS/el/8YbzuwGvCXk7JwVK0F1Q5sJqUpPAmFw8WrU1Ew136Y50xU+oFBXgzInecFV2XuFurl97vP2wcMpujHFF8OnQqRbQ9lSmlm6c6RQZMKsQtDSW37iGjatxcTxKaa1qej0TtSfIPxtkfHDZuN++bwPaqc7qD3gf2D6jWG0+cmv9tGFR+o/XIu/j+Zl3yb99WX67/GU3MwN3lKtbZGVDeyyVTTsruj3bTxfk26L1UlaEIPljjdCcYhyLbgnyLgs+u4ytdkPTZ24nDW3WUtGas3TrxJRCbeMtfvkAvSsVeOJntvRXMLiKHIL1/kqkB1QYHz5neo/Krr99ciEycXpr7BtP9njYpRn6TfhvZIoxi+2P3u+pu/AQAA//8=
// DO NOT EDIT
package com.github.yeast.paypal.sdk.orders;

import com.paypal.http.HttpRequest;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.List;
/**
 * Updates an order with the `CREATED` or `APPROVED` status.<br/>You cannot update an order with the `COMPLETED` status.<br/>To make an update, you must provide a `reference_id`.<br/>If you omit a `reference_id` for an order with one purchase unit, PayPal defaults to a `reference_id` of `1`, which enables you to use a path:<pre>"path": "/purchase_units/@reference_id=='1'/{attribute-or-object}"</pre>.<br/>You can patch these attributes and objects to complete these operations:<ul><li><code>intent</code> &mdash; replace.</li><li><code>purchase_units</code> &mdash; replace, add.</li><li><code>purchase_units[].custom_id</code> &mdash; replace, add, remove.</li><li><code>purchase_units[].description</code> &mdash; replace, add, remove.</li><li><code>purchase_units[].payee.email</code> &mdash; replace, add.</li><li><code>purchase_units[].shipping</code> &mdash; replace, add, remove.</li><li><code>purchase_units[].shipping.name</code> &mdash; replace, add.</li><li><code>purchase_units[].shipping.address</code> &mdash; replace, add.</li><li><code>purchase_units[].soft_descriptor</code> &mdash; replace, add, remove.</li><li><code>purchase_units[].amount</code> &mdash; replace.</li><li><code>purchase_units[].invoice_id</code> &mdash; replace, add, remove.</li><li><code>purchase_units[].payment_instruction</code> &mdash; replace.</li><li><code>purchase_units[].payment_instruction.disbursement_mode</code> &mdash; replace.<blockquote><strong>Note:</strong> By default, <code>disbursement_mode</code> is <code>INSTANT</code>.</blockquote></li><li><code>purchase_units[].payment_instruction.platform_fees</code> &mdash; replace, add, remove.</li></ul>
 */
public class OrdersPatchRequest extends HttpRequest<Void> {

    public OrdersPatchRequest(String orderId) {
        super("/v2/checkout/orders/{order_id}?", "PATCH", Void.class);
        try {
            path(path().replace("{order_id}", URLEncoder.encode(String.valueOf(orderId), "UTF-8")));
        } catch (UnsupportedEncodingException ignored) {}

        header("Content-Type", "application/json");
    }
    public OrdersPatchRequest authorization(String authorization) {
        header("Authorization", String.valueOf(authorization));
        return this;
    }

    public OrdersPatchRequest contentType(String contentType) {
        header("Content-Type", String.valueOf(contentType));
        return this;
    }



    public OrdersPatchRequest requestBody(List<Patch> patchRequest) {
        super.requestBody(patchRequest);
        return this;
    }
}
