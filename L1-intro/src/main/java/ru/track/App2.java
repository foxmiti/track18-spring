package ru.track;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import org.apache.commons.lang3.StringUtils;

public class App2 {
        public static final String URL = "http://guarded-mesa-31536.herokuapp.com/track";
        public static final String FIELD_NAME = "name";
        public static final String FIELD_GITHUB = "github";
        public static final String FIELD_EMAIL = "email";

        public static void main (String[]args) throws Exception {
            // 1) Use Unirest.post()
            // 2) Get response .asJson()
            // 3) Get json body and JsonObject
            // 4) Get field "success" from JsonObject
            HttpResponse<JsonNode> jsonResponse = Unirest.post(URL)
                    .header("accept", "application/json")
                    .field(FIELD_NAME, "Mitrikas Anton")
                    .field(FIELD_GITHUB, "github.com/foxmiti")
                    .field(FIELD_EMAIL, "mitrikasanton@gmail.com")
                    .asJson();
            System.out.println(jsonResponse.getBody().toString());


            boolean success = false;
//        String str = StringUtils.capitalize(args[0]);
//       System.out.println(str);
        }
}
