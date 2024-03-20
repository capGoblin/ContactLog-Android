package com.example.contactlog.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.contactlog.R;
import com.example.contactlog.interfaces.RecyclerViewInterface;
import com.example.contactlog.models.ContactLog;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {
    private final RecyclerViewInterface recyclerViewInterface;
    Context context;
    ArrayList<ContactLog> contactLogs;
    public RecyclerViewAdapter(RecyclerViewInterface recyclerViewInterface, Context context, ArrayList<ContactLog> contactLogs) {
        this.recyclerViewInterface = recyclerViewInterface;
        this.context = context;
        this.contactLogs = contactLogs;
    }

    @NonNull
    @Override
    public RecyclerViewAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.recycler_view_row, parent, false);
        return new ViewHolder(view, recyclerViewInterface);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerViewAdapter.ViewHolder holder, int position) {
//        ContactLog contactLog = contactLogs.get(position);
//        System.out.println("sad" + contactLogs);
//        holder.name.setText(contactLog.getName());
//        holder.phoneNo.setText(contactLog.getName());
//        holder.yesterday.setText(contactLog.getYesterdayHours());
//        holder.lastWeek.setText(contactLog.getLastWeekHours());
//        holder.lastMonth.setText(contactLog.getLastMonthHours());
        holder.title.setText("asfsafas");
        holder.content.setText("saffsafas");

//        if (contactLog.getDate().before(new Date())) {
//            holder.editButton.setEnabled(false);
//            holder.editButton.setImageResource(R.drawable.disabled_baseline_edit_24);
//        } else {
//            holder.editButton.setEnabled(true);
//            holder.editButton.setImageResource(R.drawable.baseline_edit_24);
//        }
    }

    @Override
    public int getItemCount() {
        return contactLogs.size();
    }
    public static class ViewHolder extends RecyclerView.ViewHolder{
        ImageButton editButton;
        TextView title;
        TextView content;
        TextView date;
        public ViewHolder(@NonNull View view, RecyclerViewInterface recyclerViewInterface) {
            super(view);
            editButton = view.findViewById(R.id.imageButton);
            title = view.findViewById(R.id.rvTitle);
            content = view.findViewById(R.id.rvContent);
            date = view.findViewById(R.id.rvDate);
//            ((ImageButton) view.findViewById(R.id.imageButton)).setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View v) {
//                    recyclerViewInterface.onItemClick(getAdapterPosition());
//                }
//            });
        }
//        TextView name;
//        TextView phoneNo;
//        TextView yesterday;
//        TextView lastWeek;
//        TextView lastMonth;
//
//        public ViewHolder(@NonNull View view, RecyclerViewInterface recyclerViewInterface) {
//            super(view);
//            name = view.findViewById(R.id.rv_textName);
//            phoneNo = view.findViewById(R.id.rv_phoneNo);
//            yesterday = view.findViewById(R.id.rv_yesterday);
//            lastWeek = view.findViewById(R.id.rv_lastWeek);
//            lastMonth = view.findViewById(R.id.rv_lastMonth);
//            view.setOnClickListener(new View.OnClickListener() {
//                                        @Override
//                                        public void onClick(View v) {
//                                            recyclerViewInterface.onItemClick(getAdapterPosition());
//                                        }
//                                    });
//
////            ((ImageButton) view.findViewById(R.id.imageButton)).setOnClickListener(new View.OnClickListener() {
////                @Override
////                public void onClick(View v) {
////                    recyclerViewInterface.onEditClick(getAdapterPosition());
////                }
////            });
//        }
    }
}

