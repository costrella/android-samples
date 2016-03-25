package com.costrella.cemetery.activity;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

import com.costrella.cemetery.model.DemoDetails2;
import com.costrella.cemetery.model.DemoDetailsList2;
import com.example.mapdemo.FeatureView;
import com.example.mapdemo.R;

/**
 * Created by mike on 2016-03-24.
 */
public class PersonsListActivity extends AppCompatActivity
        implements AdapterView.OnItemClickListener {

    private static class CustomArrayAdapter extends ArrayAdapter<DemoDetails2> {

        /**
         * @param demos An array containing the details of the demos to be displayed.
         */
        public CustomArrayAdapter(Context context, DemoDetails2[] demos) {
            super(context, R.layout.feature, R.id.title, demos);
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            FeatureView featureView;
            if (convertView instanceof FeatureView) {
                featureView = (FeatureView) convertView;
            } else {
                featureView = new FeatureView(getContext());
            }

            DemoDetails2 demo = getItem(position);

            featureView.setTitleId(demo.titleId);
            featureView.setDescriptionId(demo.descriptionId);

            Resources resources = getContext().getResources();
//            String title = resources.getString(demo.titleId);
//            String description = resources.getString(demo.descriptionId);

            featureView.setContentDescription("a" + ". " + "b");

            return featureView;
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        ListView list = (ListView) findViewById(R.id.list);

        ListAdapter adapter = new CustomArrayAdapter(this, DemoDetailsList2.DEMOS2);

        list.setAdapter(adapter);
        list.setOnItemClickListener(this);
        list.setEmptyView(findViewById(R.id.empty));
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        DemoDetails2 demo = (DemoDetails2) parent.getAdapter().getItem(position);
        Intent intent = new Intent(this, demo.activityClass);
        intent.putExtra("person", demo.person.getSector().getLatLng());
        startActivity(intent);
    }
}
