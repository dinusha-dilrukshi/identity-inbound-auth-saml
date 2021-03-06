/*
 * Copyright (c) 2017, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 * WSO2 Inc. licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.wso2.carbon.identity.authenticator.inbound.saml2sso.test;

public class TestConstants {

    public static final String SAML_REQUEST_INVALID_SIGNATURE =
            "nVNdj9owEPwrkd8hIVLvwCKcKOhUpGubQq4PffOZDTF1vKnX4ePf10lIRasWob6uZ2dnZ9bTp1OpgwNYUmgSNhpGLAAjcavMLmGv2fNgzJ5mUxKlrvi8doVZw48ayAW%2BzxBvHxJWW8NRkCJuRAnEneSb%2BccXHg8jXll0KFGzYE4E1vlBCzRUl2A3YA9Kwuv6JWGFcxUPQ41S6ALJ8XE0jkJnxQF8TbnzUGIZFljCcE8VC5ZehDLCtbqbZvqtexJP4nAnHBzFmQXPaCW08hOWC03AgtUyYdpoFLjHqtqBFghqhzstZJ5XWhVv%2B%2B9aqAKhNB5NqSBSB0iYs3XTTlTDypATxiUsjkaPgygexI%2FZKObxA38XDSfRwzcWpJft3yvTeXrLqrcORPxDlqWD9PMmY8HXPhsPYH0S7XR7fwaid57N%2FnB0Gl4zdvxxxT95itUyRa3k%2BWpMfH%2FWWuNxYcEn0FvmQyiFu03QVNR2kLdQXjW7kwPjWLBJG01faqFVrsAmrFPMwl%2BaL5cJ2zZof2MOTu6%2FxC%2BwrIRV1NgOJyHdxXh%2BzbzQ3tU15FcT7g7hJkxy2VD7cnNzR7Tb5ohA%2Bs0yKwxVaF0X21%2F1zLq3fxky6xO%2F%2Fs2znw%3D%3D&SigAlg=http%3A%2F%2Fwww.w3.org%2F2000%2F09%2Fxmldsig%23rsa-sha1&Signature=jYIfq5HEdqzRasdfasdI9xTbrA15E95L2SXKJRgrX%2FLr0uGIe43hwsyjETbbU3F0%2F0sc53lZwibpS0aP2Ec15sZZR4%2B0iB3vDVYX8k%2Bb%2FNISed7D0kcniK5naVBjeBsNdGK6vAxTQSGxs0W4cXzdZQ%2FAinT5iRYmsVW%2BOmLpcP2U%3D";

    public static final String HOST_NAME = "localhost";
    public static final int PORT = 8080;
    public static final String GATEWAY_ENDPOINT = "http://" + HOST_NAME + ":" + PORT + "/gateway";
    public static final String SAMPLE_PROTOCOL = "sampleProtocol";
    public static final String RELAY_STATE = "RelayState";
    public static final String EXTERNAL_IDP = "externalIDP";
    public static final String ASSERTION = "Assertion";
    public static final String QUERY_PARAM_SEPARATOR = "&";
    public static final String AUTHENTICATED_USER = "authenticatedUser";
    public static final String AUTHENTICATED_USER_NAME = "ExternalAuthenticatedUser";
    public static final String RESPONSE_CONTEXT = "/response";
    public static final String SAMPLE_SP_NAME = "sample";
    public static final String SAMPLE_ISSUER_NAME = "travelocity.com";
    public static final String SAMPLE_IDP_NAME = "myidp";
    public static final String SAML_REQUEST_PARAM = "SAMLRequest";
    public static final String SP_ENTITY_ID = "spEntityId";
    public static final String ACS_URL = "http://localhost:8080/travelocity.com/home.jsp";
}

