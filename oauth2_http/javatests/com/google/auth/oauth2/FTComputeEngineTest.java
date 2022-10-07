package com.google.auth.oauth2;


import com.google.auth.oauth2.ComputeEngineCredentials;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import com.google.auth.http.HttpTransportFactory;
import com.google.auth.oauth2.GoogleCredentialsTest.MockHttpTransportFactory;
import com.google.api.client.http.HttpTransport;
import com.google.auth.oauth2.DefaultCredentialsProvider;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collection;

public final class FTComputeEngineTest {

//    static class MockMetadataServerTransportFactory implements HttpTransportFactory {
//
//        MockMetadataServerTransport transport = new MockMetadataServerTransport();
//
//        @Override
//        public HttpTransport create() {
//            return transport;
//        }
//    }

    @Test
    public void CheckGCEEnvironment() throws Exception{}

    @Test
    public void refreshTest() throws Exception {

        // test keychain
        // test again
//        String accessToken = "1/MkSJoj1xsli0AccessToken_NKPY2";
//        String accountEmail = "mail@mail.com";
//
//        MockMetadataServerTransportFactory transportFactory = new MockMetadataServerTransportFactory();
//        transportFactory.transport.setAccessToken(accessToken);
//        transportFactory.transport.setServiceAccountEmail(accountEmail);

        ComputeEngineCredentials credentials = ComputeEngineCredentials.create();

        credentials.refresh();

        assertNotNull(credentials.getAccessToken());
        assertNotNull(credentials.getAccount());

        // TODO: test scope
//        assertEquals(credentials.getScopes(), "foo");
    }

    @Test
    public void defaultTest() throws Exception {
    }

    @Test
    public void idTokenFromMetadataTest() throws Exception {

    }

    @Test
    public void fetchIdTokenTest() throws Exception {}

}
