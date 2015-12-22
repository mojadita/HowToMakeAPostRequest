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
import java.net.MalformedURLException;
import java.net.URL;

/**
 * @author Luis Colorado <code>&lt;lc@luiscoloradosistemas.com&gt;</code>}
 *
 */
public class MainHTTPClient {

    public static void main( String[] args ) {
        try {
            URL url = new URL("http://host.to.post/");
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("POST");
        } catch (MalformedURLException e) {
            /* TODO Auto-generated catch block */
            e.printStackTrace();
        } catch (IOException e) {
            /* TODO Auto-generated catch block */
            e.printStackTrace();
        }
    }

}
