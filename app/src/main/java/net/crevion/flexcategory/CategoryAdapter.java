package net.crevion.flexcategory;

import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yusuf on 6/22/17.
 */

public class CategoryAdapter extends RecyclerView.Adapter<CategoryViewHolder> {

    private List<String> stringList;

    public CategoryAdapter() {
        stringList = new ArrayList<>();
    }

    @Override
    public CategoryViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new CategoryViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_category, parent, false));
    }

    @Override
    public void onBindViewHolder(CategoryViewHolder holder, int position) {
        holder.bindTo(stringList.get(position));
    }

    @Override
    public int getItemCount() {
        return stringList.size();
    }

    public void addData(String string) {
        stringList.add(string);
        notifyDataSetChanged();
    }
}
