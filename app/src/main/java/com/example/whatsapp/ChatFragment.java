package com.example.whatsapp;

import android.graphics.drawable.Drawable;
import android.os.Bundle;

import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;
import java.util.List;

import static android.widget.LinearLayout.HORIZONTAL;

public class ChatFragment extends Fragment {
    RecyclerView recyclerView;
    ChatsAdapter chatsAdapter;
    RecyclerView.LayoutManager layoutManager;
    List<Chats> contactList = new ArrayList<>();

    public ChatFragment() {
        // Required empty public constructor
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_chat, container, false);
        recyclerView = view.findViewById(R.id.recyclerViewChat);
        contactList.add(new Chats("Doraemon", R.drawable.doraemon, "Hello! I'm a robot", "11:36 AM"));
        contactList.add(new Chats("Nobita Nobi", R.drawable.nobita, "Doraemooonnn <3", "12:00 AM"));
        contactList.add(new Chats("Shizuka Minamoto", R.drawable.shizuka, "Me dance classes k liay jaarhi", "12:00 AM"));
        contactList.add(new Chats("Jian Goda", R.drawable.jian, "Tum meray hathon ni bachogay", "12:00 AM"));
        contactList.add(new Chats("Suneo Honekawa", R.drawable.suneo, "Me itna sundar hun me kya krun", "12:00 AM"));
        contactList.add(new Chats("Hidetoshi Dekisugi", R.drawable.dekisugi, "I need to complete my HW", "12:00 AM"));
        contactList.add(new Chats("Tamako Nobi", R.drawable.tamako_nobi, "Aaj Nobita ko khana nahi milega", "12:00 AM"));
        contactList.add(new Chats("Nobisuke Nobi", R.drawable.nobi, "Me golf khelnay jaarha hu", "12:00 AM"));
        contactList.add(new Chats("Teacher", R.drawable.teacher, "Tum iss test mein b fail ho", "12:00 AM"));
        contactList.add(new Chats("Dorami", R.drawable.dorami, "I love cakes :p", "12:00 AM"));

        chatsAdapter = new ChatsAdapter(getContext(), contactList);
        recyclerView.setHasFixedSize(true);
        layoutManager = new LinearLayoutManager(getContext());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(chatsAdapter);

        DividerItemDecoration itemDecor = new DividerItemDecoration(recyclerView.getContext(), DividerItemDecoration.HORIZONTAL);
        Drawable divider = ContextCompat.getDrawable(getActivity(), R.drawable.divider);
        itemDecor.setDrawable(divider);
        recyclerView.addItemDecoration(itemDecor);

        return view;
    }
}