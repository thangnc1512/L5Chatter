package com.thangnc.l5chatter.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.thangnc.l5chatter.model.Messenger;

import java.util.List;

public class MessengerAdapter extends RecyclerView.Adapter<MessengerAdapter.ViewHolder> {

    private static int VIEW_GUEST = 1;
    private static int VIEW_USER = 2;

    List<Messenger> messengers;
    Context context;

    public MessengerAdapter(List<Messenger> messengers, Context context) {
        this.messengers = messengers;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }


    public class ViewHolder extends RecyclerView.ViewHolder {
        EditText etChat;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }

    public class SendViewHolder extends RecyclerView.ViewHolder {

        public SendViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }

    public class RecieveViewHolder extends RecyclerView.ViewHolder{

        public RecieveViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
