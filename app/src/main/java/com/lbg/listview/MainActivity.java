package com.lbg.listview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Penta on 16/3/4.
 */
public class MainActivity extends AppCompatActivity {


    ListView listView;

    BaseListAdapter adapter;

    List<BaseListBean> listBeanList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initData();
        listView = (ListView) findViewById(R.id.list);
        adapter = new BaseListAdapter(this);
        adapter.refresh(listBeanList);
        listView.setAdapter(adapter);


    }

    private void initData() {
        listBeanList = new ArrayList<>();
        listBeanList.add(new Student("Jim", "男"));
        listBeanList.add(new Teacher("Linda", "24"));
        listBeanList.add(new Student("Rose", "女"));
    }


}
