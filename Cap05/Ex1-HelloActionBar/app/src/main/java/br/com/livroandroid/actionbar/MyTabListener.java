package br.com.livroandroid.actionbar;


import android.app.ActionBar;
import android.app.Fragment;
import android.app.FragmentTransaction;
import android.content.Context;
import android.widget.Toast;

/**
 * Created by tfbarbosa on 01/05/17.
 */
public class MyTabListener implements ActionBar.TabListener {

    private Context context;
    private int tabIdx;

    public MyTabListener(Context context, int tabIdx){
        this.context = context;
        this.tabIdx = tabIdx;
    }

    @Override
    public void onTabSelected(ActionBar.Tab tab, FragmentTransaction ft){
        Toast.makeText(context, "Selecionou a tab: " + tabIdx, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onTabUnselected(ActionBar.Tab tab, FragmentTransaction ft){

    }

    @Override
    public void onTabReselected(ActionBar.Tab tab, FragmentTransaction ft){

    }
}
