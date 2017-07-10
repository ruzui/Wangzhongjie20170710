package test.bwie.com.wangzhongjie20170710;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private ImageView pw_jiaimg;
    private TextView pw_num;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.jj);
        pw_jiaimg = (ImageView) findViewById(R.id.pw_jiaimg);
        pw_num = (TextView) findViewById(R.id.pw_num);
         pw_jiaimg.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                  pw_num.setText("2");
             }
         });
    }
}
