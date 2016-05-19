package org.jiangtao.customview.ui;

import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import butterknife.ButterKnife;
import butterknife.InjectView;
import org.jiangtao.customview.R;
import org.jiangtao.customview.widget.CustomViewCircle;
import org.jiangtao.customview.widget.CustomViewLine;

public class MainActivity extends AppCompatActivity {

  @InjectView(R.id.custom_line) CustomViewLine customLine;
  @InjectView(R.id.custom_circle) CustomViewCircle customCircle;
  @InjectView(R.id.toolbar) Toolbar toolbar;

  @Override protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    ButterKnife.inject(this);
  }
}
