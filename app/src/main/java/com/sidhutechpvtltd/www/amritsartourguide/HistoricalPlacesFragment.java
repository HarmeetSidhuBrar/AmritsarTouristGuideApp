package com.sidhutechpvtltd.www.amritsartourguide;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class HistoricalPlacesFragment extends Fragment {


    public HistoricalPlacesFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.places_list, container, false);

        // Create a list of placeInfos
        final ArrayList<PlaceInfo> placeInfos = new ArrayList<PlaceInfo>();
        placeInfos.add(new PlaceInfo(R.string.historical_place1_info, R.string.historical_place1, R.drawable.backg));
        placeInfos.add(new PlaceInfo(R.string.historical_place2_info, R.string.historical_place2, R.drawable.durgiana_temple_amritsar));
        placeInfos.add(new PlaceInfo(R.string.historical_place3_info, R.string.historical_place3, R.drawable.jallianwala_bagh));
        placeInfos.add(new PlaceInfo(R.string.historical_place4_info, R.string.historical_place4, R.drawable.qila_gobindgarh));
        placeInfos.add(new PlaceInfo(R.string.historical_place5_info, R.string.historical_place5, R.drawable.amritsar_museum));
        placeInfos.add(new PlaceInfo(R.string.historical_place6_info, R.string.historical_place6, R.drawable.wagah_border));

        // Create an {@link CustomAdapter}, whose data source is a list of {@link PlaceInfo}s. The
        // adapter knows how to create list items for each item in the list.
        CustomAdapter adapter = new CustomAdapter(getActivity(), placeInfos, R.color.category_family);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // places_list.xmlml layout file.
        ListView listView = (ListView) rootView.findViewById(R.id.list);

        // Make the {@link ListView} use the {@link CustomAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link PlaceInfo} in the list.
        listView.setAdapter(adapter);

        return rootView;
    }
}
