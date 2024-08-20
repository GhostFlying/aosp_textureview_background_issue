package com.example.myapplication;

import android.app.Dialog;
import android.util.Log;
import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.SearchEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class CustomDialog extends Dialog {
    public CustomDialog(android.content.Context context) {
        super(context);
//        getWindow().setType(WindowManager.LayoutParams.TYPE_BASE_APPLICATION);
//        getWindow().setCallback(new Window.Callback() {
//            @Override
//            public boolean dispatchKeyEvent(KeyEvent event) {
//                return false;
//            }
//
//            @Override
//            public boolean dispatchKeyShortcutEvent(KeyEvent event) {
//                return false;
//            }
//
//            @Override
//            public boolean dispatchTouchEvent(MotionEvent event) {
//                return false;
//            }
//
//            @Override
//            public boolean dispatchTrackballEvent(MotionEvent event) {
//                return false;
//            }
//
//            @Override
//            public boolean dispatchGenericMotionEvent(MotionEvent event) {
//                return false;
//            }
//
//            @Override
//            public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent event) {
//                return false;
//            }
//
//            @Nullable
//            @Override
//            public View onCreatePanelView(int featureId) {
//                return null;
//            }
//
//            @Override
//            public boolean onCreatePanelMenu(int featureId, @NonNull Menu menu) {
//                return false;
//            }
//
//            @Override
//            public boolean onPreparePanel(int featureId, @Nullable View view, @NonNull Menu menu) {
//                return false;
//            }
//
//            @Override
//            public boolean onMenuOpened(int featureId, @NonNull Menu menu) {
//                return false;
//            }
//
//            @Override
//            public boolean onMenuItemSelected(int featureId, @NonNull MenuItem item) {
//                return false;
//            }
//
//            @Override
//            public void onWindowAttributesChanged(WindowManager.LayoutParams attrs) {
//                Log.d("", "");
//            }
//
//            @Override
//            public void onContentChanged() {
//                Log.d("", "");
//
//            }
//
//            @Override
//            public void onWindowFocusChanged(boolean hasFocus) {
//                Log.d("", "");
//
//            }
//
//            @Override
//            public void onAttachedToWindow() {
//                Log.d("", "");
//
//            }
//
//            @Override
//            public void onDetachedFromWindow() {
//                Log.d("", "");
//
//            }
//
//            @Override
//            public void onPanelClosed(int featureId, @NonNull Menu menu) {
//                Log.d("", "");
//
//            }
//
//            @Override
//            public boolean onSearchRequested() {
//                return false;
//            }
//
//            @Override
//            public boolean onSearchRequested(SearchEvent searchEvent) {
//                return false;
//            }
//
//            @Nullable
//            @Override
//            public ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
//                return null;
//            }
//
//            @Nullable
//            @Override
//            public ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int type) {
//                return null;
//            }
//
//            @Override
//            public void onActionModeStarted(ActionMode mode) {
//                Log.d("", "");
//
//            }
//
//            @Override
//            public void onActionModeFinished(ActionMode mode) {
//                Log.d("", "");
//
//            }
//        });
    }

    @Override
    protected void onStop() {
        super.onStop();
    }
}
