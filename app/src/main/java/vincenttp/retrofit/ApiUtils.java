package vincenttp.retrofit;

/**
 * Created by DELL on 4/21/2017.
 */

public class ApiUtils {
    private ApiUtils() {}

    public static ApiArticle getApiArticle() {

        return RetrofitClient.getClient().create(ApiArticle.class);
    }
}
