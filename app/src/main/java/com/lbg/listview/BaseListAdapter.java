package com.lbg.listview;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;


import java.util.ArrayList;

import java.util.List;


/**
 * Created by Penta on 16/3/4.
 */
public class BaseListAdapter extends BaseAdapter {

    //private Map<String ,Integer> map = new HashMap<String ,Integer>();
    private List<BaseListBean> beanList = new ArrayList<BaseListBean>();
    private LayoutInflater mInflater;
    private Context context;


    public BaseListAdapter(Context context) {
        mInflater = LayoutInflater.from(context);
        this.context = context;
    }

    public void refresh(List<BaseListBean> beanList) {
        this.beanList = beanList;
        //notifyDataSetChanged();
    }

    @Override
    public int getItemViewType(int position) {
        if (null != beanList && beanList.size() >= position) {
            String displayType = beanList.get(position).getDisplayType();
            if (null != displayType && "" != displayType) {
                return Integer.parseInt(displayType);
            }
        }
        return 0;
    }

    @Override
    public int getViewTypeCount() {
        return 10;
    }

    @Override
    public int getCount() {
        return beanList.size();
    }

    @Override
    public Object getItem(int position) {
        return beanList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        BaseListBean bean = beanList.get(position);
        if (convertView == null) {

            convertView = bean.initView(convertView, context);
            //convertView = initView(t,convertView,parent,mInflater,context);
        } else {
            bean.converseView(convertView);
            //converseView(t, convertView, context);
        }
        bean.fillDatas();
        return convertView;
    }

}
