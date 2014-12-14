package com.haitaocheng.fragment;


import java.util.ArrayList;

import com.google.common.collect.Lists;
import com.haitaocheng.www.R;
import com.lidroid.xutils.ViewUtils;
import com.lidroid.xutils.view.annotation.ViewInject;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class DiscountFragment extends BaseFragment {
	private View mView;
	private ArrayList<String> tabStrs;
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		mView = super.onCreateView(inflater, container, savedInstanceState);
//		ViewUtils.inject(this,mView);
		tabStrs = Lists.newArrayList("季特惠","促销品","甩货","清仓");
		setTabText(tabStrs);
		return mView;
	}
	
}
