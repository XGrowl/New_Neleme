package com.k.neleme;


import android.app.Application;

import com.facebook.drawee.backends.pipeline.Fresco;
import com.facebook.imagepipeline.core.ImagePipelineConfig;
import com.k.neleme.bean.FoodBean;

import java.util.ArrayList;
import java.util.List;

public class MyApp extends Application {
	private List<FoodBean> flist=new ArrayList<>();

	public List<FoodBean> getFlist() {
		return flist;
	}

	public void setFlist(List<FoodBean> flist) {
		this.flist = flist;
	}

	@Override
	public void onCreate() {
		super.onCreate();
		ImagePipelineConfig frescoConfig = ImagePipelineConfig.newBuilder(this).setDownsampleEnabled(true).build();
		Fresco.initialize(this, frescoConfig);
	}

}
