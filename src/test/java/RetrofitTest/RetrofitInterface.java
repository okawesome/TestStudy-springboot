package RetrofitTest;

import retrofit.Call;
import retrofit.http.GET;

import java.util.List;

public interface RetrofitInterface {

    @GET("/posts")
    Call<List<ResponseModel>> getFromSamplePage();


}
