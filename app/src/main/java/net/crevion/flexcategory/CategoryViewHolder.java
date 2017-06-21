package net.crevion.flexcategory;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

/**
 * Created by yusuf on 6/22/17.
 */

public class CategoryViewHolder extends RecyclerView.ViewHolder {

    private TextView textView;

    public CategoryViewHolder(View itemView) {
        super(itemView);
        textView = (TextView) itemView.findViewById(R.id.text_category);
    }

    void bindTo(String string) {
        textView.setText(string);
    }
}
