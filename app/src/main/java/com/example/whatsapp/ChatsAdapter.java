package com.example.whatsapp;

import android.annotation.SuppressLint;
import android.content.Context;
import android.icu.text.Transliterator;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ChatsAdapter extends RecyclerView.Adapter<ChatsAdapter.ViewHolder> {

    private Context context;
    private List<Chats> contactList;
    int []person;
    Chats N;


    public ChatsAdapter() {
    }
    public ChatsAdapter(Context context, List<Chats> studentsList) {
        this.context = context;
        this.contactList = studentsList;
        this.person=person;
    }
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.chatsrow,parent,false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Chats name = contactList.get(position);
        holder.contact_name.setText(name.getName());
        Chats persons = contactList.get(position);
        holder.profile.setImageResource(persons.getPersons());
        Chats msg = contactList.get(position);
        holder.msg.setText(name.getMessage());
        Chats time = contactList.get(position);
        holder.time.setText(name.getTime());

    }

    @Override
    public int getItemCount() {
        return contactList.size();

    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        TextView contact_name, msg, time;
        ImageView profile;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            contact_name = itemView.findViewById(R.id.name_Title);
            profile = itemView.findViewById(R.id.profile);
            msg = itemView.findViewById(R.id.message);
            time = itemView.findViewById(R.id.time);

        }

        @Override
        public void onClick(View v) {

        }

    }

}
