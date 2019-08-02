package com.thangnc.l5chatter.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;

import com.thangnc.l5chatter.R;
import com.thangnc.l5chatter.adapter.MessengerAdapter;
import com.thangnc.l5chatter.api.ApiUtil;
import com.thangnc.l5chatter.model.Messenger;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    private List<Messenger> messengers;
    private MessengerAdapter messengerAdapter;
    private RecyclerView messengerRV;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        messengers = new ArrayList<>();

        messengerAdapter = new MessengerAdapter(messengers, this);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);

        messengerRV.setLayoutManager(linearLayoutManager);

        messengerRV.setAdapter(messengerAdapter);

        getMessenger();


    }

    public void getMessenger(){
        ApiUtil.getInstance().getMessenger(1, 20).enqueue(new Callback<List<Messenger>>() {
            @Override
            public void onResponse(Call<List<Messenger>> call, Response<List<Messenger>> response) {
                if (response.isSuccessful()){
                    messengers.addAll(response.body());
                    messengerRV.notifyAll();
                }
            }

            @Override
            public void onFailure(Call<List<Messenger>> call, Throwable t) {

            }
        });
    }

}
