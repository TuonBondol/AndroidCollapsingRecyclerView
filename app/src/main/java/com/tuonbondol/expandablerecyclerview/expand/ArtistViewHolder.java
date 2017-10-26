package com.tuonbondol.expandablerecyclerview.expand;

import android.view.View;
import android.widget.TextView;

import com.thoughtbot.expandablerecyclerview.viewholders.ChildViewHolder;
import com.tuonbondol.expandablerecyclerview.R;

/****
 *
 * @author TUON BONDOL
 *
 */

class ArtistViewHolder extends ChildViewHolder {

    private TextView childTextView;

    ArtistViewHolder(View itemView) {
        super(itemView);
        childTextView = (TextView) itemView.findViewById(R.id.list_item_artist_name);
    }

    void setArtistName(String name) {
        childTextView.setText(name);
    }
}
