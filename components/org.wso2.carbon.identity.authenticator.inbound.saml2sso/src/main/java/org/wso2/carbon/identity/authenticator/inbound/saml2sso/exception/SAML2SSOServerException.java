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

package org.wso2.carbon.identity.authenticator.inbound.saml2sso.exception;

import org.wso2.carbon.identity.gateway.api.exception.GatewayServerException;

/**
 * SAML2 SSO Inbound Authenticator Server Exception.
 */
public class SAML2SSOServerException extends GatewayServerException {

    private static final long serialVersionUID = 8405974698567446778L;

    private String inResponseTo;
    private String acsUrl;

    public SAML2SSOServerException(String message) {
        super(message);
    }

    public SAML2SSOServerException(String errorCode, String message) {
        super(errorCode, message);
    }

    public SAML2SSOServerException(String errorCode, String message, Throwable cause) {
        super(errorCode, message, cause);
    }

    public String getInResponseTo() {
        return this.inResponseTo;
    }

    public void setInResponseTo(String inResponseTo) {
        this.inResponseTo = inResponseTo;
    }

    public String getAcsUrl() {
        return this.acsUrl;
    }

    public void setAcsUrl(String acsUrl) {
        this.acsUrl = acsUrl;
    }
}
