package com.dean.sparkscreen;

import android.content.Context;
import android.view.SurfaceHolder;
import android.view.SurfaceView;

public class SparkView extends SurfaceView implements SurfaceHolder.Callback {

	public SparkView(Context context) {
		super(context);
	}

	// Surface�Ĵ�С�����ı�ʱ����
	@Override
	public void surfaceChanged(SurfaceHolder holder, int format, int width,
			int height) {
		// TODO Auto-generated method stub

	}

	// Surface����ʱ������һ����������û�����߳�
	@Override
	public void surfaceCreated(SurfaceHolder holder) {
		// TODO Auto-generated method stub

	}

	// ����ʱ������һ�������ｫ������߳�ֹͣ���ͷš�
	@Override
	public void surfaceDestroyed(SurfaceHolder argholder0) {
		// TODO Auto-generated method stub

	}

}
