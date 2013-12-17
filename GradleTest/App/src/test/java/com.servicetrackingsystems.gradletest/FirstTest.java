package com.servicetrackingsystems.gradletest;

import static org.junit.Assert.assertEquals;
import org.junit.runner.RunWith;
import org.junit.Test;

import org.robolectric.RobolectricTestRunner;

import android.app.Activity;
import android.widget.TextView;

@RunWith(RobolectricTestRunner.class)
public class FirstTest
{
	@Test
	public void testInstantiation()
	{
		System.setSecurityManager(null);
		Activity activity = Robolectric.buildActivity();

		TextView tv = new TextView(activity);
		tv.setText("e84");

		assertEquals("e85", tv.getText());
	}
}
