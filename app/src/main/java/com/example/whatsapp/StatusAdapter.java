package com.example.whatsapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class StatusAdapter extends RecyclerView.Adapter<StatusAdapter.ViewHolder> {

    private Context context_Status;
    private List<Status> contactList_Status;
    int []person_Status;
    Status N;


    public StatusAdapter() {
    }
    public StatusAdapter(Context context, List<Status> cList) {
        this.context_Status = context;
        this.contactList_Status = cList;
        this.person_Status=person_Status;
    }
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.statusrow,parent,false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Status name_status = contactList_Status.get(position);
        holder.ContactName_Status.setText(name_status.getName());
        Status persons_status = contactList_Status.get(position);
        holder.profile_Status.setImageResource(persons_status.getPersons());
        Status msg_status = contactList_Status.get(position);
        holder.msg_Status.setText(msg_status.getMessage());

    }

    @Override
    public int getItemCount() {
        return contactList_Status.size();

    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        TextView ContactName_Status, msg_Status;
        ImageView profile_Status;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            ContactName_Status = itemView.findViewById(R.id.status_title);
            profile_Status = itemView.findViewById(R.id.status_profile);
            msg_Status = itemView.findViewById(R.id.status_message);

        }

        @Override
        public void onClick(View v) {

        }

    }

}
