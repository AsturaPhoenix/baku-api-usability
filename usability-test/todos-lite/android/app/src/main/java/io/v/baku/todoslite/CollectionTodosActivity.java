// Copyright 2015 The Vanadium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style
// license that can be found in the LICENSE file.

package io.v.baku.todoslite;

import android.os.Bundle;
import android.widget.EditText;

import io.v.baku.toolkit.BakuActivity;

public class CollectionTodosActivity extends BakuActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_todos_collection);

        // TODO: Add logic to bind a data prefix to the todoItems ListView.

        findViewById(R.id.add).setOnClickListener(bn -> {
            final EditText txtNewItem = (EditText) findViewById(R.id.newItemText);
            final String newItem = txtNewItem.getText().toString();

            // TODO: Add logic to add the text from newItemText as a data row with the above prefix
            // when the add button is clicked.

            txtNewItem.setText("");
        });
    }
}
