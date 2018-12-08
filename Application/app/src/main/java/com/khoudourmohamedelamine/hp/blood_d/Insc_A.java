package com.khoudourmohamedelamine.hp.blood_d;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class Insc_A extends AppCompatActivity {

    ArrayList<Menu_item> item;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_insc_);


        item = new ArrayList<Menu_item>();
        item.add(new Menu_item("A+"));
        item.add(new Menu_item("A-"));
        item.add(new Menu_item("B+"));
        item.add(new Menu_item("B-"));
        item.add(new Menu_item("O+"));
        item.add(new Menu_item("O-"));
        item.add(new Menu_item("AB+"));
        item.add(new Menu_item("AB-"));
        MycustumAdapter myadabter = new MycustumAdapter(item);
        GridView ls = (GridView) findViewById(R.id.g);
        ls.setAdapter(myadabter);
    }

    class MycustumAdapter extends BaseAdapter {
        ArrayList<Menu_item> item = new ArrayList<Menu_item>();

        MycustumAdapter(ArrayList<Menu_item> item) {
            this.item = item;
        }

        @Override
        public int getCount() {
            return item.size();
        }


        @Override
        public String getItem(int position) {
            return item.get(position).pro;
        }

        @Override
        public long getItemId(int position) {
            return position;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewgroup) {

            LayoutInflater inflater = getLayoutInflater();
            View view1 = inflater.inflate(R.layout.menu_item, null);
            TextView txtname = (TextView) view1.findViewById(R.id.textView);
            final Menu_item temp = item.get(i);
            txtname.setText(item.get(i).pro);
            return view1;

        }
    }
}