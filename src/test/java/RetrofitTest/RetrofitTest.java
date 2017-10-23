package RetrofitTest;

import org.junit.Assert;
import org.junit.Test;
import retrofit.Call;
import retrofit.GsonConverterFactory;
import retrofit.Retrofit;

import java.util.List;

public class RetrofitTest {

    @Test
    public void retrofitTest() throws Exception {
        Retrofit.Builder builder = new Retrofit.Builder()
                .baseUrl("https://jsonplaceholder.typicode.com/")
                .addConverterFactory(GsonConverterFactory.create());
        Retrofit retrofit = builder.build();

        RetrofitInterface retrofitInterface = retrofit.create(RetrofitInterface.class);
        Call<List<ResponseModel>> call = retrofitInterface.getFromSamplePage();
        List<ResponseModel> resp = call.execute().body();

        resp.forEach(rm -> {
            System.out.println("userId : " + rm.getUserId().toString());
            System.out.println(" id : " + rm.getId().toString() + "\n");
        });

         Assert.assertEquals(resp.get(0).getId().toString(),"1");
    }
}
