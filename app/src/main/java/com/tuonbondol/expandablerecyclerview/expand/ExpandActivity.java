package com.tuonbondol.expandablerecyclerview.expand;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.tuonbondol.expandablerecyclerview.R;

import static com.tuonbondol.expandablerecyclerview.model.GenreDataFactory.makeGenres;

/****
 *
 * @author TUON BONDOL
 *
 */

public class ExpandActivity extends AppCompatActivity {

    public GenreAdapter mGenreAdapter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_expand);

        RecyclerView mRecyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);

        assert mRecyclerView != null;
        RecyclerView.ItemAnimator animator = mRecyclerView.getItemAnimator();
        if (animator instanceof DefaultItemAnimator) {
            ((DefaultItemAnimator) animator).setSupportsChangeAnimations(false);
        }

        mGenreAdapter = new GenreAdapter(makeGenres());
        mRecyclerView.setLayoutManager(layoutManager);
        mRecyclerView.setAdapter(mGenreAdapter);
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        mGenreAdapter.onSaveInstanceState(outState);
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        mGenreAdapter.onRestoreInstanceState(savedInstanceState);
    }
}
