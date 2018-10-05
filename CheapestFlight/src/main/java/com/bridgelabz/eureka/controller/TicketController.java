
package com.bridgelabz.eureka.controller;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created By:Medini P.D
 * Date:- 05/10/2018
 * Purpose:Controller class for the
 * cheapest flight detection
 */
@RestController
@RequestMapping(value = "/token")
public class TicketController {

    @RequestMapping(value = "/getToken", method = RequestMethod.POST)
    public String get_token() throws Exception {
        String Basic_PARAMS = "grant_type=client_credentials&username=Josekuzh&password=passw0rd123";
        URL obj = new URL("https://api-crt.cert.havail.sabre.com/v2/auth/token");
        HttpURLConnection con = (HttpURLConnection) obj.openConnection();
        con.setRequestMethod("POST");
        con.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
        con.setRequestProperty("Authorization",
                "Basic VmpFNk5uVndibUl4Wkc4NVkzZ3hjRFJrTVRwUVZVSk1TVU02UlZoVTpTVEJMTTBwMWRtdz0=");

        con.setDoOutput(true);
        OutputStream os = con.getOutputStream();
        os.write(Basic_PARAMS.getBytes());
        os.flush();
        os.close();

        int responseCode = con.getResponseCode();
        System.out.println("POST Response Code :: " + responseCode);

        if (responseCode == HttpURLConnection.HTTP_OK) {
            BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
            String inputLine;
            StringBuffer response = new StringBuffer();

            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);
            }
            in.close();

            System.out.println(response.toString());
        } else {
            System.out.println("POST request not worked");
        }
    return "Connected to the url and, Token Generated";
}

   
  @RequestMapping(value = "/cheapestFlight", method = RequestMethod.GET) private
   String token() throws Exception {
	  String url =
  "https://api-crt.cert.havail.sabre.com/v1/shop/flights/cheapest/fares/LAX?pointofsalecountry=US";
  URL obj = new URL(  "https://api-crt.cert.havail.sabre.com/v1/shop/flights/cheapest/fares/LAX?pointofsalecountry=US");
  HttpURLConnection con = (HttpURLConnection) obj.openConnection();
  con.setRequestMethod("GET");
  con.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
 con.setRequestProperty("Authorization", "Bearer T1RLAQIPXu7Cqs+Fj7nf5XQuj9DYR9IdxxCLh5tBPAhlbdd+4ZFLEBIlAACwS/KhenoZyU7Tk5FQDb16BnqJPvG9DN/m6RGVQfspWRNJb86JPSAlGVE6LCn9zUiHx0lcnT19f6cei2YjL+LenVys165IIXG9OkGdE7aDmxoXuRaKU1s/q7B0EKoIwUdpV7xDVJQNvBCoGS1McuBZqGcCRICvJw3hgDY8tbcw70VInGnFKImLadJqRZwXXPki4NGFMSJbuLQ/vbaQnWeaYaXrqKnjp/lbz/NKauDjDOM*"  
 		);
 int responseCode = con.getResponseCode();
 System.out.println("POST Response Code :: " + responseCode);
 if (responseCode == HttpURLConnection.HTTP_OK) {
     BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
     String inputLine;
     StringBuffer response = new StringBuffer();
     while ((inputLine = in.readLine()) != null) {
         response.append(inputLine);
     }
     in.close();

     System.out.println(response.toString());
 } else {
     System.out.println("POST request not worked");
 }
return "Loaded the class";
}
}
