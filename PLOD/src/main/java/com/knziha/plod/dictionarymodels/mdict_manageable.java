package com.knziha.plod.dictionarymodels;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;

import com.knziha.plod.PlainDict.PDICMainAppOptions;
import com.knziha.plod.PlainDict.PlaceHolder;
import com.knziha.plod.widgets.WebViewmy;

import java.io.File;
/** Transient object for managing dictionary lists. */
public interface mdict_manageable {
	String getPath();
	boolean moveFileTo(Context c, File newF);
	void unload();
	Drawable getCover();
	String getDictionaryName();
	int getTmpIsFlag();
	boolean isMddResource();
	void setTmpIsFlag(int val);
	File f();
	void checkFlag(Activity context);
	long getFirstFlag();
	void setFirstFlag(long val);
	void validifyValueForFlag(WebViewmy view, int val, int mask, int flagPosition, int processId);
	PDICMainAppOptions getOpt();

	boolean renameFileTo(Context c, File to);

	boolean exists();

	boolean equalsToPlaceHolder(PlaceHolder placeHolder);
}
