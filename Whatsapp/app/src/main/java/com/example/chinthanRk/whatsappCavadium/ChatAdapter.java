package com.example.chinthanRk.whatsappCavadium;

import android.annotation.SuppressLint;
import android.content.Context;

import androidx.annotation.NonNull;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;


public class ChatAdapter extends ArrayAdapter<String> {
    private final Context context;
    private List<String> chatNames;
    private List<String> chatDescriptions;
    private List<String> chatDate;


    private TextView chatNameText, chatDescriptionText, chatDateText, chatNotificationText;


    ChatAdapter(@NonNull Context context, List<String> chatNames, ArrayList<String> chatDescriptionList, ArrayList<String> chatDateList) {
        super(context, -1, chatNames);
        this.context = context;
        this.chatNames = chatNames;
        this.chatDescriptions = chatDescriptionList;
        this.chatDate = chatDateList;
    }

    @NonNull
    @SuppressLint("NewApi")
    @Override
    public View getView(int position, View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        assert inflater != null;
        @SuppressLint("ViewHolder") View rView = inflater.inflate(R.layout.chat_list, parent, false);

        findViews(rView);


        chatNameText.setText(chatNames.get(position));
        chatDescriptionText.setText(chatDescriptions.get(position));
        chatDateText.setText(chatDate.get(position));
        chatDateText.setTextColor(context.getColor(R.color.colorAccent));
        chatNotificationText.setVisibility(View.VISIBLE);

        return rView;
    }


    private void findViews(View v) {
        chatNameText = v.findViewById(R.id.chat_name_txt);
        chatDescriptionText = v.findViewById(R.id.chat_description);
        chatDateText = v.findViewById(R.id.chat_date_txt);
        chatNotificationText = v.findViewById(R.id.chat_notifs_txt);
    }
}