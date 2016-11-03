package test.bw.com.griderview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private MyGriderView gv;
    private MyListView lv;
    private String []name={"作家协会","美术家协会","杂技家协会","戏剧家协会","舞蹈家协会","音乐家协会","曲艺家协会","民间文艺家协会","书法家协会","电影家协会","摄影家协会","电视艺术家协会","评论家协会","飞天编辑部","文学院","理论研究室"};
    private int[]image={R.drawable.gv1,R.drawable.gv2,R.drawable.gv3,R.drawable.gv4,R.drawable.gv5,R.drawable.gv6,R.drawable.gv7,R.drawable.gv8,R.drawable.gv9,R.drawable.gv10,R.drawable.gv11,R.drawable.gv12,R.drawable.gv13,R.drawable.gv14,R.drawable.gv12,R.drawable.gv12};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        gv= (MyGriderView) findViewById(R.id.gv);
        gv.setAdapter(new BaseAdapter() {
            @Override
            public int getCount() {
                return name.length;
            }

            @Override
            public Object getItem(int position) {
                return null;
            }

            @Override
            public long getItemId(int position) {
                return 0;
            }


            @Override
            public View getView(int position, View convertView, ViewGroup parent) {
                convertView=View.inflate(MainActivity.this,R.layout.item,null);
                ImageView iv= (ImageView) convertView.findViewById(R.id.iv);
                iv.setImageResource(image[position]);
                TextView tv= (TextView) convertView.findViewById(R.id.tv);
                tv.setText(name[position]);
                return convertView;
            }
        });

        lv=(MyListView)findViewById(R.id.lv);
        lv.setAdapter(new BaseAdapter() {
            @Override
            public int getCount() {
                return image.length;
            }

            @Override
            public Object getItem(int position) {
                return null;
            }

            @Override
            public long getItemId(int position) {
                return 0;
            }

            @Override
            public View getView(int position, View convertView, ViewGroup parent) {
                convertView=View.inflate(MainActivity.this,R.layout.item_lv,null);
                ImageView iv= (ImageView) convertView.findViewById(R.id.iv);
                iv.setImageResource(image[position]);
                TextView tv= (TextView) convertView.findViewById(R.id.tv);
                tv.setText(name[position]);
                return convertView;
            }
        });
    }
}
