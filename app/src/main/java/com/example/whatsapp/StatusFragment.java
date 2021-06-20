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
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;


public class StatusFragment extends Fragment {
    RecyclerView recyclerView;
    StatusAdapter statusAdapter;
    RecyclerView.LayoutManager layoutManager;
    List<Status> contactList_Status = new ArrayList<>();

    public StatusFragment() {
        // Required empty public constructor
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_status, container, false);
        recyclerView = view.findViewById(R.id.recyclerViewStatus);
        contactList_Status.add(new Status("Dorami", R.drawable.dorami, "Today 3:15am"));
        contactList_Status.add(new Status("Teacher", R.drawable.teacher, "Today 5:08pm"));
        contactList_Status.add(new Status("Nobisuke Nobi", R.drawable.nobi, "Today 8:36pm"));
        contactList_Status.add(new Status("Tamako Nobi", R.drawable.tamako_nobi, "Today 1:55am"));
        contactList_Status.add(new Status("Hidetoshi Dekisugi", R.drawable.dekisugi, "Today 10:12am"));
        contactList_Status.add(new Status("Suneo Honekawa", R.drawable.suneo, "Yesterday 4:14am"));
        contactList_Status.add(new Status("Jian Goda", R.drawable.jian, "Yesterday 2:37am"));
        contactList_Status.add(new Status("Shizuka Minamoto", R.drawable.shizuka, "Yesterday 6:48pm"));
        contactList_Status.add(new Status("Nobita Nobi", R.drawable.nobita, "Yesterday 9:43pm"));
        contactList_Status.add(new Status("Doraemon", R.drawable.doraemon, "Yesterday 11:11am"));

        statusAdapter = new StatusAdapter(getContext(), contactList_Status);
        recyclerView.setHasFixedSize(true);
        layoutManager = new LinearLayoutManager(getContext());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(statusAdapter);

        DividerItemDecoration itemDecor = new DividerItemDecoration(recyclerView.getContext(), DividerItemDecoration.HORIZONTAL);
        Drawable divider = ContextCompat.getDrawable(getActivity(), R.drawable.divider);
        itemDecor.setDrawable(divider);
        recyclerView.addItemDecoration(itemDecor);

        return view;
    }
}