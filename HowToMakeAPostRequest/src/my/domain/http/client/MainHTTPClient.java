/* $Id$
 * Author: Luis Colorado <lc@luiscoloradosistemas.com>
 * Date: 22 de dic. de 2015
 * Project: HowToMakeAPostRequest
 * Filename: MainHTTPClient.java
 * Disclaimer: (C) 2015 LUIS COLORADO SISTEMAS S.L.
 * 		All rights reserved.  This program is Open Source, you
 * can distribute and derive work from it, under the coverage of 
 * the BSD license.
 */
package my.domain.http.client;

import java.io.OutputStream;
import java.io.PrintStream;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * Class to test a normal http connection to send a post request to the
 * server.
 * 
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
            String content="{'field_a': 'Arriba Cachipurriana'}";
         
            // Get the connection to the server.
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            
            // Set the method name.
            conn.setRequestMethod("POST");
            
            // content headers to send a fixed length text.
            conn.setRequestProperty("content-type", "text/json");
            conn.setDoOutput(true);
            PrintStream o = new PrintStream(conn.getOutputStream());
            o.print(content);
            o.close();
            
            conn.connect();
            
            int resp_code = conn.getResponseCode();
            String resp_string = conn.getResponseMessage();
            
            System.out.println("" + resp_code + " " + resp_string);
        
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
