package com.exert.manager;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.NavUtils;
import android.view.MenuItem;

public class TestListActivity extends FragmentActivity
        implements TestListFragment.Callbacks {

    private boolean mTwoPane;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_list);

        if (findViewById(R.id.test_detail_container) != null) {
            mTwoPane = true;
            ((TestListFragment) getSupportFragmentManager()
                    .findFragmentById(R.id.test_list))
                    .setActivateOnItemClick(true);
        }
    }

    @Override
    public void onItemSelected(String id) {
        if (mTwoPane) {
            Bundle arguments = new Bundle();
            arguments.putString(TestDetailFragment.ARG_ITEM_ID, id);
            TestDetailFragment fragment = new TestDetailFragment();
            fragment.setArguments(arguments);
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.test_detail_container, fragment)
                    .commit();

        } else {
            Intent detailIntent = new Intent(this, TestDetailActivity.class);
            detailIntent.putExtra(TestDetailFragment.ARG_ITEM_ID, id);
            startActivity(detailIntent);
        }
    }
}
