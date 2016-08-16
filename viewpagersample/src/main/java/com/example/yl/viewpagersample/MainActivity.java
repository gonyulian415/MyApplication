package com.example.yl.viewpagersample;

import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.design.widget.TabLayout;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;

import com.example.yl.viewpagersample.db.PersonDB;
import com.example.yl.viewpagersample.fragments.Fragments1;
import com.example.yl.viewpagersample.fragments.Fragments2;
import com.example.yl.viewpagersample.fragments.Fragments3;
import com.example.yl.viewpagersample.model.Person;
import com.squareup.picasso.Picasso;
import com.yalantis.phoenix.PullToRefreshView;

import org.xutils.view.annotation.Event;
import org.xutils.view.annotation.ViewInject;
import org.xutils.x;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private ImageView imageView;
    private final String URL = "http://i.imgur.com/DvpvklR.png";
    private ViewPager viewPager;
    private TabLayout tabLayout;
    private FragmentPagerAdapter fragmentPagerAdapter;
    private List<android.support.v4.app.Fragment> list;
    private Fragments1 fragments1;
    private Fragments2 fragments2;
    private Fragments3 fragments3;
    private PullToRefreshView pullToRefreshView;
    private ListView listView;
    private List<String> list2;
    private ArrayAdapter arrayAdapter;
    @ViewInject(R.id.drawer)
    private DrawerLayout drawerLayout;
    @ViewInject(R.id.btn1)
    private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.drawerlayout_sample);
        x.view().inject(this);
//        pullToRefreshView = (PullToRefreshView) findViewById(R.id.pulltorefresh);
//        listView = (ListView) findViewById(R.id.lv1);
//        list2 = new ArrayList<String>();
//        list2.add("1355545656");list2.add("1355545656");list2.add("1355545656");list2.add("1355545656");list2.add("1355545656");list2.add("1355545656");list2.add("1355545656");
//        list2.add("1355545656");list2.add("1355545656");list2.add("1355545656");list2.add("1355545656");list2.add("1355545656");list2.add("1355545656");list2.add("1355545656");
//        arrayAdapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,list2);
//        listView.setAdapter(arrayAdapter);
//        pullToRefreshView.setOnRefreshListener(new PullToRefreshView.OnRefreshListener() {
//            @Override
//            public void onRefresh() {
//                pullToRefreshView.postDelayed(new Runnable() {
//                    @Override
//                    public void run() {
//                        pullToRefreshView.setRefreshing(false);
//                        arrayAdapter.notifyDataSetChanged();
//                    }
//                },2000);
//                list2.add(0, "new 1");
//                list2.add(0,"new 2");
//
//            }
//
//        });

//        viewPager = (ViewPager) findViewById(R.id.viewpager1);
//        tabLayout = (TabLayout) findViewById(R.id.tablayout1);
//        init();
//        fragmentPagerAdapter = new FragmentPagerAdapter(getSupportFragmentManager()) {
//            @Override
//            public android.support.v4.app.Fragment getItem(int position) {
//                return list.get(position);
//            }
//
//            @Override
//            public int getCount() {
//                return list.size();
//            }
//        };
//        viewPager.setAdapter(fragmentPagerAdapter);
//        tabLayout.setupWithViewPager(viewPager);
//        tabLayout.getTabAt(0).setText("first");
//        tabLayout.getTabAt(1).setText("second");
//        tabLayout.getTabAt(2).setText("third");
//        imageView = (ImageView) findViewById(R.id.image1);
//        Picasso.with(this).load(R.drawable.gakki).into(imageView);
//        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
//        setSupportActionBar(toolbar);
//        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
//        fab.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();
//            }
//        });
    }

    private void init() {
        list = new ArrayList<android.support.v4.app.Fragment>();
        fragments1 = new Fragments1();
        fragments2 = new Fragments2();
        fragments3 = new Fragments3();
        list.add(fragments1);
        list.add(fragments2);
        list.add(fragments3);
        tabLayout.setTabMode(TabLayout.MODE_FIXED);

    }
    @Event(R.id.btn1)
    private void clickToShowDrawer(View view){
        Log.d("xyz","555");
        drawerLayout.openDrawer(Gravity.LEFT);
        Log.d("xyz","666");
    }

}
