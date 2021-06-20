package com.example.whatsapp;

import android.content.Context;
import android.telecom.Call;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class CallAdapter extends RecyclerView.Adapter<CallAdapter.ViewHolder> {

    private Context context_calls;
    private List<Calls> contactList_calls;
    int []person_calls;
    Calls N;


    public CallAdapter() {
    }
    public CallAdapter(Context context, List<Calls> studentsList) {
        this.context_calls = context;
        this.contactList_calls = studentsList;
        this.person_calls=person_calls;
    }
    @NonNull
    @Override
    public CallAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.callsrow,parent,false);

        return new CallAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CallAdapter.ViewHolder holder, int position) {
        Calls name_calls = contactList_calls.get(position);
        holder.contact_calls.setText(name_calls.getName());
        Calls persons_calls = contactList_calls.get(position);
        holder.profile_calls.setImageResource(persons_calls.getPersons());
        Calls call_icon_calls = contactList_calls.get(position);
        holder.call_icon_calls.setImageResource(name_calls.getCallIcon());
        Calls time_calls = contactList_calls.get(position);
        holder.time_calls.setText(time_calls.getTime());

    }

    @Override
    public int getItemCount() {
        return contactList_calls.size();

    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        TextView contact_calls, time_calls;
        ImageView profile_calls,call_icon_calls;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            contact_calls = itemView.findViewById(R.id.name_Title);
            profile_calls = itemView.findViewById(R.id.profile_calls);
            call_icon_calls = itemView.findViewById(R.id.call_icon_call);
            time_calls = itemView.findViewById(R.id.time_call);

        }

        @Override
        public void onClick(View v) {

        }

    }

}
