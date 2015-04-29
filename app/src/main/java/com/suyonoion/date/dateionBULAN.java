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

import java.text.SimpleDateFormat;
import java.util.Calendar;


public class dateionBULAN extends TextView {
    public dateionBULAN(Context context) {
        super(context);
        setDate();
    }

    public dateionBULAN(Context context, AttributeSet attrs) {
        super(context, attrs);
        setDate();
    }

    public dateionBULAN(
            Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        setDate();
    }

    private void setDate() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("MMMM");
        String today = dateFormat.format(Calendar.getInstance().getTime());
        setText(today);
    }
}

