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
            // This is the URL we are going to connect to.
            URL url = new URL("http://www.google.com/");
            // This is the data (json text) we are going to send.
            // We need to know it in advance to calculate the
            // Content-length header.
            String content="{'field_a': 'Arriba Cachipurriana'}\n";
            // Get the connection to the server.
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            // Set the method name.
            conn.setRequestMethod("POST");
            // content headers to send a fixed length text.
            conn.setRequestProperty("content-type", "text/json");
            conn.setRequestProperty("content-length", "" + content.length());
            conn.connect();
            int resp_code = conn.getResponseCode();
            String resp_string = conn.getResponseMessage();
            System.out.println("" + resp_code + " " + resp_string);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
