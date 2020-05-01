package com.example.chinthanRk.whatsappCavadium;


import android.os.Build;
import android.os.Bundle;

import androidx.annotation.RequiresApi;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;


public class ChatFragment extends Fragment {
    private String[] chatNames = new String[]{
            "Chinthan Rk",
            "Cavadium0",
            "Cavadium1",
            "Cavadium2",
            "Cavadium3",
            "Cavadium4",
            "Cavadium5",
            "Cavadium6",


    };
    private String[] chatDescription = new String[]{
            "Is it working ?",
            "I think so",
            "Hello",
            "Testing",
            "Testing",
            "Testing",
            "Testing",
            "Testing"

    };

    private String[] chatDate = new String[]{
            "12:00 am",
            "Yesterday",
            "01/05/2020",
            "12:01 am",
            "Yesterday",
            "02/05/2020",
            "12:03 am",
            "Yesterday"


    };

    public ChatFragment() {
    }


    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_chat, container, false);
        ListView listview = rootView.findViewById(R.id.chat_list);


        final ArrayList<String> chatNameList = new ArrayList<>(Arrays.asList(chatNames));

        final ArrayList<String> chatDescriptionList = new ArrayList<>(Arrays.asList(chatDescription).subList(0, chatNames.length));
        final ArrayList<String> chatDateList = new ArrayList<>(Arrays.asList(chatDate).subList(0, chatNames.length));
        final ChatAdapter adapter = new ChatAdapter(Objects.requireNonNull(getActivity()), chatNameList, chatDescriptionList, chatDateList);
        listview.setAdapter(adapter);
        return rootView;
    }

}
