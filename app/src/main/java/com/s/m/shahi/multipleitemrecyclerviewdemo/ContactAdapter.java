package com.s.m.shahi.multipleitemrecyclerviewdemo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ContactAdapter extends RecyclerView.Adapter<ContactViewHolder>
        implements View.OnClickListener, View.OnLongClickListener {

    private Context context;
    private List<Contacts> contactsList;
    private List<Integer> selectedList;
    private ItemListener itemListener;

    public ContactAdapter(Context context, List<Contacts> contactsList) {
        this.context = context;
        this.contactsList = contactsList;
    }

    @NonNull
    @Override
    public ContactViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.contact_item, parent, false);
        return new ContactViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ContactViewHolder holder, int position) {
        holder.name_contact.setText(contactsList.get(position).getName());
        holder.phone_contact.setText(contactsList.get(position).getNumber());
    }

    @Override
    public int getItemCount() {
        return contactsList.size();
    }

    public int getSelectedCount() {
        return selectedList.size();
    }

    public String getItem(int position) {
        return contactsList.get(position).getNumber();
    }

    @Override
    public void onClick(View view) {

    }

    @Override
    public boolean onLongClick(View view) {
        return false;
    }
}
