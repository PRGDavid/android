package com.pruebas.testandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.google.firebase.iid.FirebaseInstanceId;
import com.loopj.android.http.AsyncHttpResponseHandler;
import com.loopj.android.http.RequestParams;

import cz.msebera.android.httpclient.Header;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        String token = FirebaseInstanceId.getInstance().getToken();
//        Log.d("FirebaseMain", token);
//
//        RequestParams params = new RequestParams();
//        params.put("name", "Android");
//        params.put("email", "test@test.com");
//        params.put("password", "123");
//        params.put("token", token);
//        RestClient.post("", params, new AsyncHttpResponseHandler() {
//            @Override
//            public void onSuccess(int statusCode, Header[] headers, byte[] responseBody) {
//                Log.d("MainActivity", "Success");
//            }
//
//            @Override
//            public void onFailure(int statusCode, Header[] headers, byte[] responseBody, Throwable error) {
//                Log.d("MainActivity", "Error");
//                Log.d("MainActivity", String.valueOf(statusCode));
//                Log.d("MainActivity", error.getMessage());
//            }
//        });
    }
}
