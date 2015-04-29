package com.suyonoion.date;

/**
 * Created by Suyono on 4/29/2015.
 * Copyright (c) 2015 by Suyono (ion).
 * All rights reserved.
 * This product is protected by copyright and distributed under
 * licenses restricting copying, distribution and decompilation.
 */

import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;
import java.util.Calendar;


public class dateionHARI extends TextView {
    public dateionHARI(Context context) {
        super(context);
        setDate();
    }

    public dateionHARI(Context context, AttributeSet attrs) {
        super(context, attrs);
        setDate();
    }

    public dateionHARI(
            Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        setDate();
    }

    private void setDate() {
        String Dino = "";

        Calendar c = Calendar.getInstance();
        int dayOfWeek = c.get(Calendar.DAY_OF_WEEK);

        if (Calendar.MONDAY == dayOfWeek) {
            Dino = "Senen";
        } else if (Calendar.TUESDAY == dayOfWeek) {
            Dino = "Seloso";
        } else if (Calendar.WEDNESDAY == dayOfWeek) {
            Dino = "Rebo";
        } else if (Calendar.THURSDAY == dayOfWeek) {
            Dino = "Kemis";
        } else if (Calendar.FRIDAY == dayOfWeek) {
            Dino = "Jum'at";
        } else if (Calendar.SATURDAY == dayOfWeek) {
            Dino = "Setu";
        } else if (Calendar.SUNDAY == dayOfWeek) {
            Dino = "Ahad";
        }
        setText(Dino);
    }
}

