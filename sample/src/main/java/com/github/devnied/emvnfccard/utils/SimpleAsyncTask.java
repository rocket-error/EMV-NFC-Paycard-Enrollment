package com.github.devnied.emvnfccard.utils;

import android.os.AsyncTask;
import android.util.Log;

/**
 * Simple Async task
 *
 * @author Millau Julien
 *
 */
public abstract class SimpleAsyncTask extends AsyncTask<Object, Void, Object> {

	@Override
	protected Object doInBackground(final Object... params) {

		Object result = null;

		try {
			doInBackground();
		} catch (Exception e) {
			result = e;
			Log.e(SimpleAsyncTask.class.getName(), e.getMessage(), e);
		}

		return result;
	}

	protected abstract void doInBackground();

}
