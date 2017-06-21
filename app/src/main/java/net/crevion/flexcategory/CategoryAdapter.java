package net.crevion.flexcategory;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yusuf on 6/22/17.
 */

public class CategoryAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private static final int TYPE_HEADER = 0;
    private static final int TYPE_ITEM = 1;

    private List<String> stringList;

    public CategoryAdapter() {
        stringList = new ArrayList<>();
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        if (viewType == TYPE_ITEM) {
            return new CategoryViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_category, parent, false));
        } else {
            return new VHHeader(LayoutInflater.from(parent.getContext()).inflate(R.layout.header_category, parent, false));
        }
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        if (holder instanceof CategoryViewHolder) {
            ((CategoryViewHolder) holder).bindTo(stringList.get(position));
        }
    }

    @Override
    public int getItemCount() {
        return stringList.size() + 1;
    }

    @Override
    public int getItemViewType(int position) {
        if (isPositionHeader(position))
            return TYPE_HEADER;

        return TYPE_ITEM;
    }

    private boolean isPositionHeader(int position) {
        return position == stringList.size();
    }

    public void addData(String string) {
        stringList.add(string);
        notifyDataSetChanged();
    }

    private class VHHeader extends RecyclerView.ViewHolder {
        VHHeader(View itemView) {
            super(itemView);
        }
    }
}
