package net.crevion.flexcategory;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;

import com.google.android.flexbox.FlexDirection;
import com.google.android.flexbox.FlexWrap;
import com.google.android.flexbox.FlexboxLayoutManager;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        FlexboxLayoutManager flexboxLayoutManager = new FlexboxLayoutManager(this);
        flexboxLayoutManager.setFlexWrap(FlexWrap.WRAP);
        flexboxLayoutManager.setFlexDirection(FlexDirection.ROW);
//        flexboxLayoutManager.setAlignContent(AlignContent.FLEX_START);
        recyclerView.setLayoutManager(flexboxLayoutManager);

        CategoryAdapter adapter = new CategoryAdapter();
        adapter.addData("Kucing");
        adapter.addData("Anjing");
        adapter.addData("Kerbau");
        adapter.addData("Sapi");
        adapter.addData("Ayam");
        adapter.addData("Kuda");
        adapter.addData("Singa");
        adapter.addData("Singa");
        adapter.addData("Gajah");
        adapter.addData("Badak");
        adapter.addData("Ular");
        adapter.addData("Beruang");
        adapter.addData("Kadal");
        recyclerView.setAdapter(adapter);
    }
}
