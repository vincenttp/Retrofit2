package vincenttp.retrofit;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

/**
 * Created by DELL on 4/21/2017.
 */

public interface ApiArticle {
    @FormUrlEncoded
    @POST("mobile/choice")
    Call<ArticleModel> getArticle(@Field("api_id") String api_id,
                                  @Field("api_key") String api_key,
                                  @Field("api_secret") String api_secret,
                                  @Field("user_id") String user_id);
}
