/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package city_planning.api;

import static com.google.common.net.HttpHeaders.USER_AGENT;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.logging.Level;
import java.util.logging.Logger;
import mijzcx.synapse.desk.utils.SqlStringUtil;

/**
 *
 * @author synsoftech
 */
public class Test {

    public static void main(String[] args) throws Exception {
        try {
//            getUsers();
            sendPost2();
        } catch (IOException ex) {
            Logger.getLogger(Test.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private static void getUsers() throws IOException {
        try {
            String url = "http://128.199.80.53/api/users";

            URL obj = new URL(url);
            HttpURLConnection con = (HttpURLConnection) obj.openConnection();

            // optional default is GET
            con.setRequestMethod("GET");

            //add request header
            con.setRequestProperty("User-Agent", USER_AGENT);

            int responseCode = con.getResponseCode();
            System.out.println("\nSending 'GET' request to URL : " + url);
            System.out.println("Response Code : " + responseCode);

            BufferedReader in = new BufferedReader(
                    new InputStreamReader(con.getInputStream()));
            String inputLine;
            StringBuffer response = new StringBuffer();

            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);
            }
            in.close();

            //print result
            System.out.println(response.toString());
        } catch (MalformedURLException ex) {
            Logger.getLogger(Test.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    // HTTP POST request
    private static void sendPost() throws Exception {

        String name = "Test2";
        String email = "test2@gmail.com";
        String password = "$2y$10$HxNpcxpJkG8nd6bPxsmHtOX1zebfzs.JRte.Yncu3E1HSVCyUCj2m";
        String urlParameters = ""
                + "name=" + name
                + "&email=" + email
                + "&password=" + password
                + "";
        String url = "http://128.199.80.53/api/user.add";
        URL obj = new URL(url);
        HttpURLConnection conn = (HttpURLConnection) obj.openConnection();
        conn.setDoOutput(true);
        OutputStreamWriter writer = new OutputStreamWriter(conn.getOutputStream());

        writer.write(urlParameters);
        writer.flush();

        int responseCode = conn.getResponseCode();
        System.out.println("\nSending 'POST' request to URL : " + url);
        System.out.println("Response Code : " + responseCode);

        String line;
        BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getInputStream()));

        while ((line = reader.readLine()) != null) {
            System.out.println(line);
        }
        writer.close();
        reader.close();

    }

    private static void sendPost2() throws Exception {
        
        String urlParameters = "";
        
        
//        String data="{"households":[{"id":1,"created_at":"2016-11-28 16:55:53","updated_at":"2016-11-28 16:55:53","created_by":"4","updated_by":"4","region":"VISAYAS REGION VI (WESTERN VISAYAS)","region_id":"9","province":"Negros Oriental","province_id":"Negros Oriental","city":"Manjuyod","city_id":"1","barangay":"Alangilanan","barangay_id":"1","purok":"","purok_id":" ","status":0,"house_no":"AHHHAB","household_no":"AHHHAB-1","occupancy_types":"Owned","tenure":"0,0","is_occupant_owns_the_land":1,"is_occupant_owns_the_bldg":1,"monthly_rental":0.0,"drainage_system_concern":"","street_maintenance_concern":"","garbage_collection_concern":"","fire_protection_concern":"","police_protection_concern":"","ambulance_service_concern":"","livelihood_programs_concern":"","adolescent_pregnancy_rate":"","child_abuse_rating":"","crime_rating":"","domestic_violence_rating":"","drug_abuse_rating":"","hunger_rating":"","environmental_contamination_rating":"","health_disparities_rating":"","assets":[],"household_expenditures":[],"household_consumptions":[],"household_members":[],"no_of_household_members":0},{"id":2,"created_at":"2016-11-28 16:56:02","updated_at":"2016-11-28 16:56:02","created_by":"4","updated_by":"4","region":"VISAYAS REGION VI (WESTERN VISAYAS)","region_id":"9","province":"Negros Oriental","province_id":"Negros Oriental","city":"Manjuyod","city_id":"1","barangay":"Alangilanan","barangay_id":"1","purok":"","purok_id":" ","status":0,"house_no":"AHHHAB","household_no":"AHHHAB-2","occupancy_types":"Owned","tenure":"0,0","is_occupant_owns_the_land":1,"is_occupant_owns_the_bldg":1,"monthly_rental":0.0,"drainage_system_concern":"","street_maintenance_concern":"","garbage_collection_concern":"","fire_protection_concern":"","police_protection_concern":"","ambulance_service_concern":"","livelihood_programs_concern":"","adolescent_pregnancy_rate":"","child_abuse_rating":"","crime_rating":"","domestic_violence_rating":"","drug_abuse_rating":"","hunger_rating":"","environmental_contamination_rating":"","health_disparities_rating":"","assets":[],"household_expenditures":[],"household_consumptions":[],"household_members":[],"no_of_household_members":0}]}";
        
        
        String url = "http://localhost:8000/api/upload.new";
        URL obj = new URL(url);
        HttpURLConnection conn = (HttpURLConnection) obj.openConnection();
        conn.setDoOutput(true);
        OutputStreamWriter writer = new OutputStreamWriter(conn.getOutputStream());

        writer.write(urlParameters);
        writer.flush();

        int responseCode = conn.getResponseCode();
        System.out.println("\nSending 'POST' request to URL : " + url);
        System.out.println("Response Code : " + responseCode);

        String line;
        BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getInputStream()));

        while ((line = reader.readLine()) != null) {
            System.out.println(line);
        }
        writer.close();
        reader.close();

    }
}
