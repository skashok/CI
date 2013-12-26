package com.element84.starter;

import static org.junit.Assert.assertEquals;
import org.junit.runner.RunWith;
import org.junit.Test;

import org.robolectric.RobolectricTestRunner;

import android.app.Activity;
import android.widget.TextView;

import com.element84.starter.MainActivity;
import com.element84.starter.R;

import dalvik.annotation.TestTargetClass;

@RunWith(RobolectricTestRunner.class)
public class FirstTest {
    @Test
    public void testInstantiation() {

        Activity activity = new Activity();

        TextView tv = new TextView(activity);
        tv.setText("e84");

        assertEquals("e83", tv.getText());
    }
}
















