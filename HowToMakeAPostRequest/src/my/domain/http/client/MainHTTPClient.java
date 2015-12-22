/* $Id$
 * Author: Luis Colorado <lc@luiscoloradosistemas.com>
 * Date: 22 de dic. de 2015
 * Project: HowToMakeAPostRequest
 * Filename: MainHTTPClient.java
 * Disclaimer: (C) 2015 LUIS COLORADO SISTEMAS S.L.
 * 		All rights reserved.  This file must considered
 *		confidential.
 */
package my.domain.http.client;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * @author Luis Colorado <code>&lt;lc@luiscoloradosistemas.com&gt;</code>}
 *
 */
public class MainHTTPClient {

    public static void main( String[] args ) {
        final URL URL_TO_POST = new URL("http://host.to.post/");
        HttpURLConnection conn = new HttpURLConnection(URL_TO_POST) {

            @Override
            public void disconnect() {
                // TODO Auto-generated method stub
                
            }

            @Override
            public boolean usingProxy() {
                // TODO Auto-generated method stub
                return false;
            }

            @Override
            public void connect() throws IOException {
                // TODO Auto-generated method stub
                
            }
            
        };
    }

}
