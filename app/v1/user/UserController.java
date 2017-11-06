package v1.user;

import static play.libs.Json.toJson;

import java.util.Arrays;

import play.mvc.Controller;
import play.mvc.Result;

public class UserController extends Controller {

    public Result show(final String id) {

        if ("99".equals(id)) {
            return notFound();
        }

        UserResource user = new UserResource();
        user.setId(Long.parseLong(id));
        user.setEmail("email_from_" + id + "@server.com");
        user.setCountry("country_from_server_" + id);
        user.setTownCity("town__from_server_" + id);
        user.setName("name__from_server_" + id);
        user.setAddress1("address_line_1_from_server_" + id);
        user.setAddress2("address_line_2__from_server_" + id);
        user.setPostCode(1000 + Integer.parseInt(id));
        user.setTelephoneList(
                Arrays.asList("phone_1_from_server_" + id, "phone_2_from_server_" + id, "phone_3_from_server_" + id));
        return ok(toJson(user));
    }
}
