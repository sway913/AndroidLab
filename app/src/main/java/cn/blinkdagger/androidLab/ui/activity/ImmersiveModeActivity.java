package cn.blinkdagger.androidLab.ui.activity;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import cn.blinkdagger.androidLab.R;
import cn.blinkdagger.androidLab.ui.fragment.AdvancedImmersiveModeFragment;

public class ImmersiveModeActivity extends AppCompatActivity {

    private AdvancedImmersiveModeFragment adVfragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_immersive_mode);
        initView();
    }

    private void initView(){
        adVfragment =new AdvancedImmersiveModeFragment();
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        ft.add(R.id.immersive_fl,adVfragment).commit();
    }

}
