/*
 * Copyright (c) 2015 by Suyono (ion).
 * All rights reserved.
 *
 * This product is protected by copyright and distributed under
 * licenses restricting copying, distribution and decompilation.
 */

package com.suyonoion.dateclockproject;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;


public class about extends Activity {

    ImageButton ion;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.about);
        addListenerOnImageButton();
    }

    public void addListenerOnImageButton() {

        final Context context = this;

        ion = (ImageButton) findViewById(R.id.home);

        ion.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(context, MainActivity.class);
                startActivity(intent);

            }

        });

    }

}
