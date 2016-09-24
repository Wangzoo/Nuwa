package com.wangzuo.nuwa;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import org.w3c.dom.Text;

import cn.jiajixin.nuwa.Nuwa;

public class MainActivity extends AppCompatActivity {

    private TextView textView;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();
    }

    /**
     * 初始化
     */
    private void init() {
        findView();

    }

    /**
     * 设置文本
     */
    private void setText() {
        textView.setText("no bug");
    }

    /**
     *  找到控件
     */
    private void findView() {
        textView = (TextView) findViewById(R.id.main_tv);
        button = (Button) findViewById(R.id.main_btn);

        setText();

        button.setOnClickListener(new PatchListener());
    }


    /**
     * 打补丁监听
     */
    class PatchListener implements View.OnClickListener{

        @Override
        public void onClick(View v) {
            Nuwa.loadPatch(MainActivity.this,"/sdcard/patch.jar");
        }
    }
}
