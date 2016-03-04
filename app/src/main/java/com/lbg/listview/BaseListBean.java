package com.lbg.listview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * Created by Penta on 16/3/4.
 */
public abstract class BaseListBean {

    /**
     * 显示类别，所有列表型数据必须有的字段
     *
     * @return
     */
    public abstract String getDisplayType();

    public abstract View initView(View convertView, Context context);

    public abstract void converseView(View convertView);

    public abstract void fillDatas();

}
