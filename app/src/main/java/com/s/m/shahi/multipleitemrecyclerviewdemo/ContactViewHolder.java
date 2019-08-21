package com.s.m.shahi.multipleitemrecyclerviewdemo;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ContactViewHolder extends RecyclerView.ViewHolder {

    public TextView name_contact, phone_contact;

    public ContactViewHolder(@NonNull View itemView) {
        super(itemView);

        name_contact =(TextView)itemView.findViewById(R.id.name_contact);
        phone_contact =(TextView)itemView.findViewById(R.id.phone_contact);
    }
}
