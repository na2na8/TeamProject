package com.example.kwon_younghoon.opensourceteam;

import android.app.Dialog;
import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;


public class DialogforSelect extends Dialog {
    private Button mCloseButton;
    private Button mAllButton;
    private Button mImageButton;
    private Button mTextButton;
    private Context context;
    private View.OnClickListener mCloseClickListener;
    private View.OnClickListener mShowAll;
    private View.OnClickListener mShowImage;
    private View.OnClickListener mShowText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // 다이얼로그 외부 화면 흐리게 표현
        WindowManager.LayoutParams lpWindow_inf = new WindowManager.LayoutParams();
        lpWindow_inf.flags = WindowManager.LayoutParams.FLAG_DIM_BEHIND;
        lpWindow_inf.dimAmount = 0.8f;
        getWindow().setAttributes(lpWindow_inf);

        setContentView(R.layout.activity_dialogfor_select);

        mCloseButton = (Button) findViewById(R.id.dialog_close);
        mCloseButton.setBackgroundResource(R.drawable.ic_action_back);
        mAllButton = (Button)findViewById(R.id.allContents);
        mImageButton = (Button)findViewById(R.id.imageContents);
        mTextButton = (Button)findViewById(R.id.txtContents);

        // 클릭 이벤트 셋팅
        mCloseButton.setOnClickListener(mCloseClickListener);
        mAllButton.setOnClickListener(mShowAll);
        mImageButton.setOnClickListener(mShowImage);
        mTextButton.setOnClickListener(mShowText);


    }

    // 클릭버튼이 하나일때 생성자 함수로 클릭이벤트를 받는다.
    public DialogforSelect(Context context,
                           View.OnClickListener closeListener, View.OnClickListener showAll,
                           View.OnClickListener showImage, View.OnClickListener showText) {
        super(context, android.R.style.Theme_Translucent_NoTitleBar);
        this.mCloseClickListener = closeListener;
        this.mShowAll = showAll;
        this.mShowImage = showImage;
        this.mShowText = showText;
        this.context = context;
    }

}
