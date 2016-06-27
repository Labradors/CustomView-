package org.jiangtao.customview.ui;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import butterknife.ButterKnife;
import butterknife.InjectView;
import butterknife.OnClick;
import org.jiangtao.customview.R;
import org.jiangtao.customview.widget.CustomViewCircle;
import org.jiangtao.customview.widget.CustomViewLine;

public class MainActivity extends AppCompatActivity {

  @InjectView(R.id.toolbar) Toolbar toolbar;
  @InjectView(R.id.btn_calculater) Button btnCalculater;

  @Override protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    ButterKnife.inject(this);
  }

  @OnClick(R.id.btn_calculater) public void onClick(View v) {
    switch (v.getId()) {
      case R.id.btn_calculater:
        Intent intent = new Intent(MainActivity.this, ClockViewActivity.class);
        startActivity(intent);
        break;
    }
  }
}
