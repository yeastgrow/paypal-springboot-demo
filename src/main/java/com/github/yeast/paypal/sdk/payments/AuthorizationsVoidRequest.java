// This class was generated on Wed, 22 Aug 2018 20:48:41 PDT by version 0.1.0-dev+904328-dirty of Braintree SDK Generator
// AuthorizationsVoidRequest.java
// @version 0.1.0-dev+904328-dirty
// @type request
// @data H4sIAAAAAAAC/6yTQW/TQBCF7/yK0ZyXukScfIsaUCsENSSqhFCFJt5JvXSzu8yOI0yU/47WMdCUckDiZr15Hr1vnr3Hd7RlrJF67aK476Quhny2i86iwQXnVlwqGtZ4E53NBqJAS6Flnw1QgJ9vsoVEw5aDGlgPcLU4g4+xL9YQFcrCp92gHSl0lGHNHGDTez9AS0l7YXuGBt/3LENDQltWloz1p1uDl0yW5UTd42pIhSWruHCHBm9IHK09T4zzh4xo8A0Pf5mccs/blnMGjfcln8Tt9MjBpuiCQrV7UcVCNqvGSUk9F6HhGOjc4Acmex38gPWGfOYifO2dsMVapWeDjcTEoo4z1qH3/nBr8HWU7WPuhrT7N+qTZj+Ptf4G/4N11TE0NDTkn99xYCFlC1cL2EQB7fjJ/uLY7n+CLh7OelxSxCLlFEPmh9pFDMphsiGl5F07ElZf8ljhpWp6y9pFizU218sVHo+HNVa7WTWFz9Xph1/tH5/rUE3/wvLepV8kr74lbpXtUkn7fBEtYz07f3l49gMAAP//
// DO NOT EDIT
package com.github.yeast.paypal.sdk.payments;

import com.paypal.http.HttpRequest;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
/**
 * Voids, or cancels, an authorized payment, by ID. You cannot void an authorized payment that has been fully captured.
 */
public class AuthorizationsVoidRequest extends HttpRequest<Void> {

    public AuthorizationsVoidRequest(String authorizationId) {
        super("/v2/payments/authorizations/{authorization_id}/void?", "POST", Void.class);
        try {
            path(path().replace("{authorization_id}", URLEncoder.encode(String.valueOf(authorizationId), "UTF-8")));
        } catch (UnsupportedEncodingException ignored) {}

        header("Content-Type", "application/json");
    }


}
