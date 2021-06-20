package com.example.whatsapp;

import android.graphics.drawable.Drawable;
import android.os.Bundle;

import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

public class CallFragment extends Fragment {

    RecyclerView recyclerView_calls;
    CallAdapter callAdapter;
    RecyclerView.LayoutManager layoutManager;
    List<Calls> contactList_calls = new ArrayList<>();

    public CallFragment() {
        // Required empty public constructor
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_chat, container, false);
        recyclerView_calls = view.findViewById(R.id.recyclerViewChat);
        contactList_calls.add(new Calls("Suneo Honekawa", R.drawable.suneo, "Today 10:12am", R.drawable.call));
        contactList_calls.add(new Calls("Tamako Nobi", R.drawable.tamako_nobi, "Today 1:55am", R.drawable.call));
        contactList_calls.add(new Calls("Nobita Nobi", R.drawable.nobita, "Today 8:36pm", R.drawable.call));
        contactList_calls.add(new Calls("Dorami", R.drawable.dorami, "Today 5:08pm", R.drawable.call));
        contactList_calls.add(new Calls("Hidetoshi Dekisugi", R.drawable.dekisugi, "Today 3:15am", R.drawable.call));
        contactList_calls.add(new Calls("Doraemon", R.drawable.doraemon, "Yesterday 11:11am", R.drawable.call));
        contactList_calls.add(new Calls("Nobisuke Nobi", R.drawable.nobi, "Yesterday 9:43pm", R.drawable.call));
        contactList_calls.add(new Calls("Shizuka Minamoto", R.drawable.shizuka, "Yesterday 6:48pm", R.drawable.call));
        contactList_calls.add(new Calls("Teacher", R.drawable.teacher, "Yesterday 9:43pm", R.drawable.call));
        contactList_calls.add(new Calls("Jian Goda", R.drawable.jian, "Yesterday 11:11am", R.drawable.call));


        callAdapter = new CallAdapter(getContext(), contactList_calls);
        recyclerView_calls.setHasFixedSize(true);
        layoutManager = new LinearLayoutManager(getContext());
        recyclerView_calls.setLayoutManager(layoutManager);
        recyclerView_calls.setAdapter(callAdapter);

        DividerItemDecoration itemDecor = new DividerItemDecoration(recyclerView_calls.getContext(), DividerItemDecoration.HORIZONTAL);
        Drawable divider = ContextCompat.getDrawable(getActivity(), R.drawable.divider);
        itemDecor.setDrawable(divider);
        recyclerView_calls.addItemDecoration(itemDecor);

        return view;
    }
}