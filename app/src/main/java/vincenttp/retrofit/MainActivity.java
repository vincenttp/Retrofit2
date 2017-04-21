package vincenttp.retrofit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.http.Field;

public class MainActivity extends AppCompatActivity {
    ApiArticle apiArticle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        apiArticle = ApiUtils.getApiArticle();

        apiArticle.getArticle("1",
                "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaY2FlTFdVVVNDdnloMHYycEQ2b2Fvb1FwY3FVRHpyTytNN1pIeHBleGQ4MD0=",
                "34bbc814aebed6a77062885c966809b8c5fa711a8f4ee86cbb51055638af49e1",
                "3")
                .enqueue(new Callback<ArticleModel>() {
                    @Override
                    public void onResponse(Call<ArticleModel> call, Response<ArticleModel> response) {
                        System.out.println("MainActivity"+ response.body().status);
                    }

                    @Override
                    public void onFailure(Call<ArticleModel> call, Throwable t) {

                    }
                });
    }
}
