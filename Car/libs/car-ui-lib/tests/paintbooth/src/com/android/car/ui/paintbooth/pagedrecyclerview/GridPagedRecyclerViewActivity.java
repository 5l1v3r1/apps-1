/*
 * Copyright (C) 2019 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.android.car.ui.paintbooth.pagedrecyclerview;

import android.app.Activity;
import android.os.Bundle;

import com.android.car.ui.pagedrecyclerview.PagedRecyclerView;
import com.android.car.ui.paintbooth.R;

import java.util.ArrayList;

/** Activity that shows GridPagedRecyclerView example with dummy data. */
public class GridPagedRecyclerViewActivity extends Activity {
    private final ArrayList<String> mData = new ArrayList<>();
    private final int mDataToGenerate = 50;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.grid_paged_recycler_view_activity);
        PagedRecyclerView recyclerView = findViewById(R.id.grid_list);

        RecyclerViewAdapter adapter = new RecyclerViewAdapter(generateDummyData());
        recyclerView.setAdapter(adapter);
    }

    private ArrayList<String> generateDummyData() {
        for (int i = 1; i <= mDataToGenerate; i++) {
            mData.add("data" + i);
        }
        return mData;
    }
}
