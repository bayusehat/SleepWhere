package id.sch.smktelkom_mlg.project.xirpl107162534.sleepwhere;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.LinearLayoutManager;
import android.widget.Adapter;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.item);

        RecyclerView rV = (RecyclerView) findViewById(R.id.recy);

        RecyclerAdapter adapter=new RecyclerAdapter(this);
        rV.setAdapter(adapter);
        rV.setHasFixedSize(true);
        rV.setLayoutManager(new LinearLayoutManager(this));
    }
}
