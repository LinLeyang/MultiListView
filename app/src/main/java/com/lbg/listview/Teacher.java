package com.lbg.listview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * Created by Penta on 16/3/4.
 */
public class Teacher extends BaseListBean {

    private String displayType;
    private String id;
    private String name;
    private String age;

    public Teacher() {

    }

    public Teacher(String name, String age) {
        this.name = name;
        this.age = age;
    }

    private TeacherViewHolder holder;
    private BaseListAdapter adapter;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    @Override
    public String getDisplayType() {
        return displayType;
    }

    public void setDisplayType(String displayType) {
        this.displayType = displayType;
    }


    @Override
    public View initView(View convertView, Context context) {

        LayoutInflater inflater = LayoutInflater.from(context);
        convertView = inflater.inflate(R.layout.test_item2, null);
        TeacherViewHolder studentViewHolder = new TeacherViewHolder();
        studentViewHolder.name = (TextView) convertView.findViewById(R.id.text1);
        studentViewHolder.age = (TextView) convertView.findViewById(R.id.text2);
        convertView.setTag(studentViewHolder);

        holder = studentViewHolder;
        return convertView;
    }

    @Override
    public void converseView(View convertView) {
        holder = (TeacherViewHolder) convertView.getTag();

    }

    @Override
    public void fillDatas() {
        holder.name.setText(name);
        holder.age.setText(age);

    }


    static class TeacherViewHolder {
        TextView name;
        TextView age;
    }
}
