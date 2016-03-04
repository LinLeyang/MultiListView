package com.lbg.listview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * Created by Penta on 16/3/4.
 */
public class Student extends BaseListBean {

    private String displayType;
    private String id;
    private String name;
    private String sex;

    private StudentViewHolder holder;

    public Student() {

    }

    public Student(String name, String sex) {
        this.name = name;
        this.sex = sex;
    }


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

    public String getSex() {
        return sex;
    }


    public void setSex(String sex) {
        this.sex = sex;
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
        convertView = inflater.inflate(R.layout.test_item1, null);
        StudentViewHolder studentViewHolder = new StudentViewHolder();
        studentViewHolder.name = (TextView) convertView.findViewById(R.id.text1);
        studentViewHolder.sex = (TextView) convertView.findViewById(R.id.text2);
        convertView.setTag(studentViewHolder);

        holder = studentViewHolder;
        return convertView;
    }

    @Override
    public void converseView(View convertView) {
        holder = (StudentViewHolder) convertView.getTag();

    }

    @Override
    public void fillDatas() {
        holder.name.setText(name);
        holder.sex.setText(sex);

    }

    static class StudentViewHolder {
        public TextView name;
        public TextView sex;
    }

}
