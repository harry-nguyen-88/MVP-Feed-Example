package com.hoasen.studio.dailymailfeed.NewsDetail.Presenter;

import android.view.View;

import com.hoasen.studio.dailymailfeed.NewsDetail.View.INewsDetailView;

/**
 * Created by Harry Nguyen on 04-Mar-16.
 */
public class NewDetailPresenterImpl implements INewsDetailPresenter {

    INewsDetailView view;

    @Override
    public void showSnackBar() {
        this.view.showSnackBar();
    }

    @Override
    public void updateData() {
        view.updateData();
    }

    @Override
    public void setView(INewsDetailView view) {
        this.view = view;
    }
}
